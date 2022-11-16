import java.util.Scanner;

public class Exception_DZ2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку: ");
            if (sc.nextLine().isEmpty()) {
                System.out.println("Пустые строки вводить нельзя!");
            }
            else break;
        }
        sc.close();
    }
}
