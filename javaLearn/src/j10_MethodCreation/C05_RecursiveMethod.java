package j10_MethodCreation;

import java.util.Scanner;

public class C05_RecursiveMethod {
    /*
        Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
        çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
        Bu yüzden Recursive(özyineleme) ile yapılan hesaplamalar daha yavaş ve verimsizdir.
        Peki Recursive(özyineleme) neden kullanıyoruz?
        Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
    */
    public static void main(String[] args) {
        /*
        Faktoriyel girilen sayıdan 1 e kadar olan tamsayıların çarpımına denir
        1!=1 0!=1 2!=2*1... 6!=6*5*4*3*2*1
        Task : girilen sayının faktöriyelini hesaplayan method create ediniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi girniz");
        int sayi= Math.abs(scan.nextInt());
        System.out.println(faktoriyelHesaplama(sayi));
    }

    private static int faktoriyelHesaplama(int sayi) {
        if (sayi>1){
            return sayi*faktoriyelHesaplama(sayi-1);
        }else return 1;
    }
}
