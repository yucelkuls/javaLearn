package j11_Arrays_.Tasks;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..
        int [] arr = {15, 25, 22, 18, 30};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("En buyuk 2. eleman : "+arr[arr.length - 2]);






    }
}
