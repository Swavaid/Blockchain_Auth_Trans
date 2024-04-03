import java.math.BigInteger;
import java.util.Random;

/**
 * @author emilio
 * @date 2022-07-30 16:50
 */
public class Prime_Generate {


    public static BigInteger ranPrime() {


        Random ran = new Random();

        BigInteger bigInteger = BigInteger.probablePrime(3*Setup.l_SPara, ran);

        return bigInteger;
    }

}


