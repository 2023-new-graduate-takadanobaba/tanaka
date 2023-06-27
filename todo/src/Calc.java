import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {
       
Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("数字を入力してください（\"end\"で計算終了）:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("無効な入力です。数字を入力するか、\"end\"で終了してください。");
            }
        }

        System.out.println("合計: " + sum);
    }
}

