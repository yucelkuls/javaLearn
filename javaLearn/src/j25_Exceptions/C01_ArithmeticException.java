package j25_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    public static void main(String[] args) {

        //  ArithmeticException -> matematiksel(Arithmetic) işlemlerde olusan Run Time Exception type'dir.

        Scanner scan =  new Scanner(System.in);
        System.out.println("please enter first number = ");
        int num1 = scan.nextInt();
        System.out.println("please enter second number = ");
        int num2 = scan.nextInt();
   //     int divide = num1 / num2;
   //     System.out.println("divide = " + divide);   RTE - ArithmeticException

        try {
            System.out.println("Try blok runed");
            System.out.println(num1 / num2);
            System.out.println("Greetings, from try blok");
            /*
1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz.catch block try block exception yakalarsa calışır
2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
   aynı anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE

 */
        } catch (ArithmeticException e) {
            System.out.println("Catch blok runed");
            System.out.println("The divisor number cannot be zero!"+ e.getMessage());  //exc mesaji print edildi.
            e.printStackTrace(); // exc. tum ciktiyi print eder
            System.out.println("Greetings, from 1. catch blok");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. catch blok runed");
            System.out.println("Greetings, from 2.catch blok");
        }catch (Exception e) {
            System.out.println("Biggest catch blok runed");
            System.out.println("Greetings, from biggest catch blok");
        }
        System.out.println("If you are reading this message, the application is running smoothly :))");


    }
}
