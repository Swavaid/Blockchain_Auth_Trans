import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author emilio
 * @date 2022-07-31 19:49
 */
public class IndexPrivateKey {

    public static Web3j web3j = Web3j.build(new HttpService("HTTP://127.0.0.1:7545"));

    public static String Add_S="0xCC305d3833F13Df2642c09C3c42020c9674dEf4E";
    public static String S_privateKey="e749ae9fe363fbd1882666906e5443aef0f9a7221d2fc09704f67df438e1ede0";
    public static String Add_D="0x5379c88b38eb327C1d65B2c890AfADb8247c4726";
    public static String D_privateKey="2d7b75236c2b9085a9d82372fc702750d1390b97f59897f7d167f74f4d2c33f1";

//    public static HashMap hashMapAccountKey;
//
//    static {
//        try {
//            hashMapAccountKey = IndexGen();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    public static HashMap IndexGen() throws IOException {
//        HashMap hashMap=new HashMap<>();
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(0),"052035c506e805e7296322d3a7450b459a574e2483314238d43a0c0d39d9cbbb");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(1),"caca41322d912ea4f206ddfd2db0ba157fa3ebf7919746a2a9245a5a5d46f2ca");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(2),"56a79cbd4ef3568eb7d47ec6ef031fec997743122cfaaeafaf5ef700f526daea");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(3),"d42a1508ae7df55da3626bbefdf7ec5be0cb50fae2ae465f276cd1629c3cdf6e");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(4),"1687a9aedb8e0a735b9c7f18213a2c12cb7ccfc86c5ffd295f3377b9d480bc76");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(5),"704857742b46d1701499ecd4fb387bca215e6f05a2474d4019fe66b253a0783e");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(6),"ce24b020c02277d285e8c12ddc6899ff60db76b588f95d0e8afa3cce7dcc6820");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(7),"87053cf6bce57a22ea02bb2b3bbbbf825116baa0b83921adf339e56e44eedf2f");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(8),"05f0d979e7b09bea3b0f6b474d978e22874d95ec6a91a83cf1921a59b5a1a85b");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(9),"f69398ed8b9aa654c89222d3e0f7c5c6048e5f25408ace0189430d7ff91d283e");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(10),"86f8bcdb2a7e8835dc75f47761c50334b8c33beb2a2176d5c9112827427b2fa7");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(11),"c647cd8dc91ffaf29fb94aa34407385ce4d4364cc020b2327526a698d896ffd7");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(12),"8f722e6e484ecc6650319bd1a8d99af4c8e57be618862604adb394cc2a52eb48");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(13),"06f541590b662d573966844636b1446d072f9f5cf223876585ec81cbb964ef70");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(14),"71501def790c702c8b38364c7e1931c6ca73ae657e6dd5e4a1d5ac082474957f");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(15),"db4fdf3557de2b8be62092d42e68fd7b510968292999811543157766f57374cd");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(16),"f2bf7a930bf935216734536c1e30449908c4df79040abd0856f466716a0ca884");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(17),"837e1a8853e9ed6e60b3ce2ce461e1bec33cf2530bc5665efea2fc881da0c483");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(18),"91c6117e982313ba54438f212c5dab0457736286e096b2f688cb1fb6a086836e");
//        hashMap.put(web3j.ethAccounts().send().getAccounts().get(19),"0827eed15374a42cf3d8f5f9b9810190522644a9dc054f1fa4ec734f485a88e9");
//
//        return hashMap;
//    }



}
