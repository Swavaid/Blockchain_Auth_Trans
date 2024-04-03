import org.web3j.crypto.Credentials;
import org.web3j.crypto.RawTransaction;
import org.web3j.crypto.TransactionEncoder;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetTransactionCount;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.utils.Convert;
import org.web3j.utils.Numeric;

import java.math.BigInteger;

/**
 * @author emilio
 * @date 2022-07-31 19:47
 */
public class SendTransaction {

    public static String[] SendTransReturn(String SenderAdd,String toAdd,String data,String SenderKey,int num)throws Exception{

        BigInteger GAS_PRICE = BigInteger.valueOf(22_000_000_000L);
        BigInteger GAS_LIMIT = BigInteger.valueOf(4_300_000);

        String[] ReturnValue=new String[4];

        //Web3j web3j = Web3j.build(new HttpService("HTTP://127.0.0.1:7545"));

        //转账人私钥
        Credentials credentials = Credentials.create(SenderKey);
        EthGetTransactionCount ethGetTransactionCount = IndexPrivateKey.web3j.ethGetTransactionCount(
                SenderAdd, DefaultBlockParameterName.PENDING).sendAsync().get();
        BigInteger nonce = ethGetTransactionCount.getTransactionCount();

        //创建交易，这里是转0个以太币
        BigInteger value = Convert.toWei(String.valueOf(num), Convert.Unit.ETHER).toBigInteger();
        RawTransaction rawTransaction = RawTransaction.createTransaction(nonce, GAS_PRICE, GAS_LIMIT, toAdd, value, data);

        //签名Transaction，这里要对交易做签名
        byte[] signedMessage = TransactionEncoder.signMessage(rawTransaction, credentials);
        String hexValue = Numeric.toHexString(signedMessage);

        //发送交易
        EthSendTransaction ethSendTransaction =
                IndexPrivateKey.web3j.ethSendRawTransaction(hexValue).sendAsync().get();
        String transactionHash = ethSendTransaction.getTransactionHash();


        ReturnValue[0]=transactionHash;
        ReturnValue[1]=rawTransaction.getData();
        ReturnValue[2]=rawTransaction.getTo();
        ReturnValue[3]=SenderAdd;

        //获得到transactionHash后就可以到以太坊的网站上查询这笔交易的状态了
        //return rawTransaction.getData();
        return ReturnValue;
    }





}
