package j18_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        // StringBuilder create etme -> Declaration

        // 1.yol

        StringBuilder  sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1); // hiclik
        System.out.println("sb1.length() = " + sb1.length()); // 0
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 16
        sb1.append("Hi");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length()); // 2
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 16
        sb1.append(", How is it going?");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length()); // 20
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 34  (16 * 2 + 2)
        // capacity asiminda yeni capacity = eski capacity * 2 + 2
        sb1.append("I am fine and you?");
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 70 (34 * 2 +2)

        // 2. yol

        StringBuilder  sb2 = new StringBuilder("Bursa'da iskender yenir"); // initialize edilmis sb
        System.out.println("sb2 = " + sb2);
        System.out.println("sb1.length() = " + sb2.length()); // 23
        System.out.println("sb1.capacity() = " + sb2.capacity()); // 39
        // 16 + ilkdeger uzunlugu ile capacity olusur.

        // trimToSize() bosluklari siler
        sb2.trimToSize();
        System.out.println("sb2.length() = " + sb2.length());     // 23
        System.out.println("sb2.capacity() = " + sb2.capacity()); // 23

        // 3. yol

        StringBuilder sb3=new StringBuilder(17);//17 capasity bir bos sb tanimladi
        System.out.println("sb3 = " + sb3);//hiclik
        System.out.println("sb3.length() = " + sb3.length());//0
        System.out.println("sb3.capacity() = " + sb3.capacity());//17
        sb3.append("155'i ararun cincix code");
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.length() = " + sb3.length());//24
        System.out.println("sb3.capacity() = " + sb3.capacity());//17*2+2=36

        //sb'de istenen index karakteri alma
        System.out.println("sb3.charAt(17) = " + sb3.charAt(17));//i
        //System.out.println("sb3.charAt(99) = " + sb3.charAt(99));//RTE->StringIndexOutOfBoundsException

        //sb'deki belli araliktaki karakterleri alma
        System.out.println("sb3.substring(11) = " + sb3.substring(11));//n cincix code
        System.out.println("sb3.subSequence(12,21) = " + sb3.subSequence(12, 21));// cincix c
        System.out.println("sb3.substring(12,21) = " + sb3.substring(12, 21));// cincix c

        //Sb'deki istenen index char'i silme
        System.out.println("sb3.deleteCharAt(23) = " + sb3.deleteCharAt(23));//155'i ararun cincix cod
        System.out.println("sb3 = " + sb3);//155'i ararun cincix cod

        //Sb'de istenen aralikta index karakterleri silme
        System.out.println("sb3.delete(12,21) = " + sb3.delete(12, 21));//155'i ararunod

        //sb'e char ve charlari girdi yapma insert
        System.out.println("sb3.insert(3,sb2,0,23) = " + sb3.insert(3, sb2, 0, 23));
        //155a ba'i ararunod

        //sb'deki istenen index char'i update(set) etme
        sb3.setCharAt(2,'$');
        System.out.println("sb3 = " + sb3);//15$a ba'i ararunod

        //sb'deki istenen index birden fazla char set etme
        System.out.println("sb3.replace(1,7,\"*\") = " + sb3.replace(1, 7, "******"));//1******'i ararunod

        //sb obj string variableye cevirme
        StringBuilder sb4=new StringBuilder("Savfet bey gecmis olsun");
        System.out.println("sb4 = " + sb4);//Savfet bey gecmis olsun
        String yeniStr = sb4.toString();
        System.out.println("yeniStr = " + yeniStr);
        System.out.println("sb4.toString().toUpperCase() = " + sb4.toString().toUpperCase());//SAVFET BEY GECMİS OLSUN

        //str variableyi sb variableye cevirme
        String str="Hayirli geceler";
        System.out.println("str = " + str);//Hayirli geceler
        StringBuilder sb5=new StringBuilder(str);//String variable sb'ye atandi
        System.out.println("sb5 = " + sb5);//Hayirli geceler


    }
}
