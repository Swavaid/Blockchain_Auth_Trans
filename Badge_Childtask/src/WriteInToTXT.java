/**
 * @author emilio
 * @date 2022-08-08 11:01
 *
 *
 */

import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class WriteInToTXT {

        public static void wirteFile() throws Exception{
            //在d盘上创建一个名为testfile的文本文件
            File f = new File("src/file/43242.txt");
            //用FileOutputSteam包装文件，并设置文件可追加
            OutputStream out = new FileOutputStream(f,true);
            //字符数组
            String[] str = {"shanghai","beijing","guangdong","xiamen"};
            for(int i =0; i<str.length; i++){
                out.write(str[i].getBytes()); //向文件中写入数据
                out.write('\r'); // \r\n表示换行
                out.write('\n');
            }
            out.close(); //关闭输出流
            System.out.println("写入成功！");
        }





}
