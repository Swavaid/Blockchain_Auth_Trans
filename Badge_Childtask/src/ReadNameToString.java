import java.io.File;

/**
 * @author emilio
 * @date 2022-08-07 14:05
 */
public class ReadNameToString {
    public static String[] readFilenameToString(String filePath) {

        File desktop = new File(filePath);

        String[] nameArr = new String[50];

        String[] arr = desktop.list();
        int i=0;

        for (String string : arr) {
            if (string.endsWith(".txt")) {
                nameArr[i]=string;
                i++;
            }
        }
        return nameArr;
    }

}
