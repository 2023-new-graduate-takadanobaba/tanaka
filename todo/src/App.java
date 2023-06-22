import java.io.BufferedReader;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws Exception {
       
System.out.println("数字を入力してください");
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 String str = reader.readLine();
 

try {
    int number = Integer.parseInt(str);
   System.out.println( number + "が入力されました。");
} catch (NumberFormatException e) {
    System.out.println("数字ではありません");
}





    }
}
