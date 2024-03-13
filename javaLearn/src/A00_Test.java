public class A00_Test {

    int num1=12;
     int num2=22;

    public static void main(String[] args) {
        A00_Test obj = new A00_Test();
        A00_Test obj2 = new A00_Test();
        obj.artirma();
        System.out.println("obj.num1 = " + obj.num1);
        System.out.println("num2 = " + obj2.num2);
        obj2.carp();
        obj.artirma();
        System.out.println("num2 = " + obj.num2);
        System.out.println("obj.num1 = " + obj.num1);
        System.out.println("obj2.num1 = " + obj2.num1);

    }
    private void artirma() {
        num1++;
        System.out.println("A Meth dan num1 = " + num1);
    }
    public void carp(){
        num2++;
        System.out.println("B Meth dan num2 = " + num2);
    }
}
