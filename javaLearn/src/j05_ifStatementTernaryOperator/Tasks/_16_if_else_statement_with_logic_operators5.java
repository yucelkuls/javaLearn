package j05_ifStatementTernaryOperator.Tasks;

public class _16_if_else_statement_with_logic_operators5 {

    public static void main(String[] args) {

       /*   45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.  */

        double number = 45;

        if (number % 5 == 0 && number % 8 == 0) {
            System.out.println("able to divide by 5 and 8");
        } else if (number % 9 == 0 && number % 10 == 5){
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");
        }




    }
}
