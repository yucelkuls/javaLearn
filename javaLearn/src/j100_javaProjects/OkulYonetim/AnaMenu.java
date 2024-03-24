package j100_javaProjects.OkulYonetim;

import java.util.Scanner;

public class AnaMenu implements AnaMenuInterface{
    static Scanner scan=new Scanner(System.in);
    public void giris(){
        System.out.println("\n    ====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        String secim=scan.next().toUpperCase();
        switch (secim){
            case "1":
                ogrenciIslemleri();
                break;
            case "2":
                ogretmenIslemleri();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatali giris. Tekrar deneyiniz");
                giris();
        }
    }

    @Override
    public void ogrenciIslemleri() {

    }

    @Override
    public void ogretmenIslemleri() {

    }

    @Override
    public void cikis() {

    }
}
