import java.io.IOException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Exception_DZ2_01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите дробное число");
            try{
                float a = Float.parseFloat(sc.nextLine());
                sc.close();
                break;

            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число, исправьтесь, будьте любезны");
            }
        }
    }
}
