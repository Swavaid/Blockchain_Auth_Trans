import org.web3j.crypto.Credentials;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.gas.StaticGasProvider;
import smartcontract.Broadcast.Broadcast;

import java.math.BigInteger;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

/**
 * @author emilio
 * @date 2022-07-30 15:22
 */
public class main {

    public static String Encrypt(){

        //读取所有文件名，并找到最近上传的文件，既文件名最大的
        String[] arr=ReadNameToString.readFilenameToString("src/file/");
        BigInteger Bigger= BigInteger.valueOf(0);
        int index=0;



        for (int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                BigInteger BigNum=new BigInteger(arr[i].substring(0,1));
                if(BigNum.compareTo(Bigger)>=0){
                    Bigger=BigNum;
                    index=i;
                }
                else{
                    Bigger=Bigger;
                }


            }


        }



        return arr[index];
    }


    public static String ContractAddress="0x28393c48d61a14F60a1BBf4F884582e956632683";


    public static BigInteger GAS_PRICE = BigInteger.valueOf(22_000_000_000L);


    public static Credentials credentials=Credentials.create(IndexPrivateKey.S_privateKey);


    public static Broadcast broadcast= Broadcast.load(ContractAddress,
            IndexPrivateKey.web3j,credentials,new StaticGasProvider(GAS_PRICE, BigInteger.valueOf(3000000L)));

    public static String plaintext=ReadTXTtoString.readToString("/Users/emilio/Downloads/santi.txt");




    public static void main(String[] args) throws Exception {

        System.out.println("hybrid");

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS") .format(new Date() ));

        String cipher1=DataTransmission.dataChannel[0];

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS") .format(new Date() ));

        DataReceiving.Authentication();

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS") .format(new Date() ));


        System.out.println("Elgamal");

        KeyPair keyPair=Elgamal.GenElGamalKey();


        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS") .format(new Date() ));
        byte[] cipher= Elgamal.ElGamalEncrypt(plaintext,keyPair.getPublic());


        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS") .format(new Date() ));
        Elgamal.ElGamalDecrypt(cipher,keyPair.getPrivate());


        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS") .format(new Date() ));




    }
}
