import java.io.IOException;

/**
 * @author emilio
 * @date 2022-08-03 13:45
 */
public class findByHash {

    public static String[] findByHash(String TransactionHash) throws IOException {
        String[] TransactionInfo = new String[2];

        TransactionInfo[0]=IndexPrivateKey.web3j.ethGetTransactionByHash(TransactionHash).send().getTransaction().get().getFrom();
        TransactionInfo[1]=IndexPrivateKey.web3j.ethGetTransactionByHash(TransactionHash).send().getTransaction().get().getTo();

        return TransactionInfo;
    }

}
