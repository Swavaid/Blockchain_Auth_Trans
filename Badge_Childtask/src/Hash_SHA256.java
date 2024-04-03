/**
 * @author emilio
 * @date 2022-08-02 20:05
 */
import java.security.MessageDigest;
import java.util.Base64;

public class Hash_SHA256 {
    //SHA256
    public static byte[] getSHA256(String str) throws Exception{
        MessageDigest messageDigest;

        messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes("UTF-8"));

        return messageDigest.digest();
    }

    private static String byte2Hex(byte[] bytes) throws Exception{
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<bytes.length;i++){
            String temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length()==1){
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }

}
