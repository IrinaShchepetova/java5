package java5;

import java.util.Random;

public class AppData {
    private String[] header;
    private int[][] data;

    public void dataApp(String[] header){
        this.header=header;
        Random random = new Random();
        data=new int[header.length][header.length];

        for (int i=0;i<header.length;i++){
            for (int j=0; j<header.length;j++){
                data[i][j]=random.nextInt(10);
            }
        }
    }
    @Override
    public String toString(){
        String result = " ";
        for (String word : header){
            result += word + ";";
        }
        result += "\n";

        for (int i=0;i<data.length;i++){
            for (int j=0;j<data[i].length;j++){
                result += data[i][j] + ";";
            }
            result += "\n";
        }
        return result;
    }
}
