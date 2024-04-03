import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

/**
 * @author emilio
 * @date 2022-07-30 16:49
 */
public class Setup {

    //security Parameter
    public static int l_SPara=112/8;




    //curve
    public static Curve curve=new Curve("P-256");

    //prime
    public static BigInteger Prime=curve.getP();
    public static int prime_length= String.valueOf(Prime).length();


    //order of G
    public static BigInteger n=curve.getN();

    //generator of Group
    public static Point G=curve.getG();




    //Add_S
    public static String add_s;

    //Add_D
    public static String add_d;

    //esk_S and epk_S
    //S randomly choose esk_S from Zp*
    private static BigInteger GenPara(BigInteger p){
        BigInteger bigIntegerPara=p;
        int result=0;
        while (result!=-1){
            bigIntegerPara=Prime_Generate.ranPrime();
            result=bigIntegerPara.compareTo(p);
        }

        return bigIntegerPara;
    }

    public static BigInteger Bigint_esk_S=GenPara(Setup.Prime);

    public static String esk_S=String.valueOf(Bigint_esk_S);

    //S computes epk_S
    public static Point epk_S=G.multiplication(Bigint_esk_S);


    //ECC:a,b and G is a group
}
