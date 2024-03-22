package j29_Collection;

import java.util.LinkedList;
import java.util.Set;

public class deneme {
    public static void main(String[] args) {

        LinkedList<Integer> sam = new LinkedList<>(Set.of(1, 2, 3, 4, 5));
        //System.out.println("sam.pollFirst() = " + sam.pollFirst());
        System.out.println("sam = " + sam);
        System.out.println("sam.contains(5) = " + sam.contains(5));
        System.out.println("sam = " + sam);
        System.out.println("sam.remove() = " + sam.remove());
        System.out.println("sam = " + sam);
        System.out.println("sam.element() = " + sam.element());
        System.out.println("sam = " + sam);


    }
}