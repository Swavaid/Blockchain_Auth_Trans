import java.io.IOException;
import java.math.BigInteger;

/**
 * @author emilio
 * @date 2022-08-03 13:25
 */
public class DataReceiving {




    //Authenticates
    public static boolean Authentication() throws IOException {



        if(findByHash.findByHash(DataTransmission.dataChannel[1])[1].equalsIgnoreCase(IndexPrivateKey.Add_S)){

            if(findByHash.findByHash(DataTransmission.dataChannel[2])[0].equalsIgnoreCase(IndexPrivateKey.Add_S)){

                if(findByHash.findByHash(DataTransmission.dataChannel[2])[1].
                        equalsIgnoreCase(findByHash.findByHash(DataTransmission.dataChannel[1])[0])){

                    return true;
                }

            }
        }
        return false;

    }





    //若以上均成立，S可以解密
    public static String Decrypt() throws Exception {
        String Cx= String.valueOf(DataTransmission.Ciphertext_0.getX());
        String Cy= String.valueOf(DataTransmission.Ciphertext_0.getY());
        if(Authentication()==true){
            Point Ciphertext_0=Setup.G;
            Ciphertext_0.setX(new BigInteger(Cx));
            Ciphertext_0.setY(new BigInteger(Cy));
            Point y=Ciphertext_0.multiplication(Setup.Bigint_esk_S);
            System.out.println(y.getX());
            System.out.println(DataTransmission.y.getX());
            System.out.println(y.getY());
            System.out.println(DataTransmission.y.getY());
            byte[] k=Hash_SHA256.getSHA256(String.valueOf(y.getX())+String.valueOf(y.getY()));
            String plaintext=AES.decryptAES(DataTransmission.Ciphertext_1,k);
            return plaintext;
        }
        else{
            return "";
        }
    }

}
