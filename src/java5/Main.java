package java5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static String file = "1.csv";

    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            byte[] csvData = newData().toString().getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(csvData);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            byte[] cvsData = new byte[fileInputStream.available()];
            fileInputStream.read(cvsData);
            String data =  new String(cvsData);
            System.out.println(data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static AppData newData(){
        AppData appData = new AppData();
        String[] header =  new String[] {"Value 1", "Value 2", "Value 3"};
        appData.dataApp(header);
        return appData;
    }
}
