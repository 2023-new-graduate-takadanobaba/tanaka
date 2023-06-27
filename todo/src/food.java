import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class food {
    public static void main(String[] args) throws Exception {
       
Scanner scanner = new Scanner(System.in);
System.out.println("名前を入力してください");
 String input = scanner.nextLine();
System.out.println("こんにちは" + input + "さんですね");

 List<String> inputList = new ArrayList<>();



while (true) {
            System.out.println("食べ物を入力してください");
            String food = scanner.nextLine();

            if (food.isEmpty()) {
                break;
            }

            inputList.add(food);
        }

        if (!inputList.isEmpty()) {
       System.out.print("好きな食べ物は");
        for (int i = 0; i < inputList.size(); i++) {
            System.out.print(inputList.get(i));
            if (i < inputList.size() - 1) {
                System.out.print("と");
            }
        }
       System.out.println("です");
}
    }
}

    


