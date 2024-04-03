import java.awt.*;
import java.math.BigInteger;

/**
 * @author emilio
 * @date 2022-07-30 20:44
 */
public class Registration {

    public static int charge=1;

    public Registration() throws Exception {
    }

    //D randomly choose esk_D from Zp*
    private static BigInteger GenPara(BigInteger p){
        BigInteger bigIntegerPara=p;
        int result=0;
        while (result!=-1){
            bigIntegerPara=Prime_Generate.ranPrime();
            result=bigIntegerPara.compareTo(p);
        }

        return bigIntegerPara;
    }

    private static BigInteger Bigint_esk_D=GenPara(Setup.Prime);

    public static String esk_D=String.valueOf(Bigint_esk_D);


    //D computes epk_D
    public static Point epk_D=Setup.G.multiplication(Bigint_esk_D);

    //The Data D sends to S
    public static String registrationData="Reg"+"X"+epk_D.getX()+"Y"+epk_D.getY();
    //D send application to S and

    public static String Add_T_reg;

    static {
        try {
            Add_T_reg = SendTransaction.SendTransReturn(IndexPrivateKey.Add_D, IndexPrivateKey.Add_S,registrationData,
                    (String) IndexPrivateKey.D_privateKey,charge)[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //data: Add_T_rec||epk_D
    public static String receiveData=Add_T_reg+"X"+epk_D.getX()+"Y"+epk_D.getY();

    //After receiving T_reg, S generates a receipt transaction T_rec

    public static String Add_T_rec;

    static {
        try {
            Add_T_rec = SendTransaction.SendTransReturn(IndexPrivateKey.Add_S, IndexPrivateKey.Add_D,registrationData,
                    (String) IndexPrivateKey.S_privateKey,0)[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //if D extracts Add_T_rec and broadcast, then others can verify the validity of epk_D
    //Broadcasts Data (put the data on the blockchain)
    public static String[] broadcastData={Add_T_rec, String.valueOf(epk_D.getX()), String.valueOf(epk_D.getY())};

    //use smart contract to broadcast





}
