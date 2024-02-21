public class A00_Test {
    public static void main(String[] args) {

        while (true) {
            int deger = (int) (Math.random()*10);
            System.out.println(deger);
            if (deger >= 4) {
                break;
            }
        }
    }
}
