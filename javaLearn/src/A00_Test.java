import java.util.InputMismatchException;
import java.util.Scanner;

public class A00_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //  code Start here don't change before this line
        //bu satırdan önceki kodlari değiştirmeyiniz

        try {
            int number = scanner.nextInt();
            boolean isEven = number % 2 == 0;
            System.out.println("isEven = " + isEven);

        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        }
        System.out.println("If you are reading this message, the application is running smoothly :)");

    }
}
