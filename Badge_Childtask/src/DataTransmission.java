import java.math.BigInteger;

/**
 * @author emilio
 * @date 2022-08-02 17:34
 */
public class DataTransmission {

    //plaintext data M
    private static String dataPlaintext=main.plaintext;

    //secure channel is established between D and S

    //D randomly choose r from Zp*
    private static BigInteger GenPara(BigInteger p){
        BigInteger bigIntegerPara=p;
        int result=0;
        while (result!=-1){
            bigIntegerPara= Prime_Generate.ranPrime();
            result=bigIntegerPara.compareTo(p);
        }

        return bigIntegerPara;
    }

    private static BigInteger r=GenPara(Setup.Prime);

    //D computes y=epk_S^r
    public static Point y= Setup.epk_S.multiplication(r);



    //k=h(y)
    public static byte[] k;

    static {
        try {
            k = Hash_SHA256.getSHA256(String.valueOf(y.getX())+String.valueOf(y.getY()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //D computes the ciphertext

    public static Point Ciphertext_0= Setup.G.multiplication(r);

    public static String Ciphertext_1;

    static {
        try {
            Ciphertext_1 = AES.encryptAES(dataPlaintext,k);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String Ciphertext= String.valueOf(Ciphertext_0.getX())+String.valueOf(Ciphertext_0.getY())+Ciphertext_1;
    public static byte[] Ciphertext_Hash;

    static {
        try {
            Ciphertext_Hash = Hash_SHA256.getSHA256(Ciphertext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    //D creates a transaction T_send with Add_T_send
    public static String Add_T_send;

    static {
        try {
            Add_T_send = SendTransaction.SendTransReturn(IndexPrivateKey.Add_D, IndexPrivateKey.Add_S, Ciphertext_Hash.toString(),
                    (String) IndexPrivateKey.D_privateKey,0)[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //D send {C,Add_T_send,Add_T_rec} to S
    public static String[] dataChannel={Ciphertext,Add_T_send,Registration.Add_T_rec};



}
