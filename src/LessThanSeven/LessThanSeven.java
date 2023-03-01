package LessThanSeven;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LessThanSeven {
    public static void main(String[] args) {
        Random rd = new Random();
        Set<Integer> numbers = new TreeSet<>();
        for(int i=0;i<15;i++){
            numbers.add(rd.nextInt(20));
        }
        System.out.println("Print results");
        System.out.println(numbers);
        System.out.println("Now print numbers less than 7");

        System.out.println(numbers.stream().filter(n->n<7).toList());
    }
}
