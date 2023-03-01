package LinkedReverse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedReverse {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("purple");
        colors.add("green");
        colors.add("yellow");
        colors.add("aqua");
        colors.add("brown");

        System.out.println("Print in order");
        Iterator<String> it = colors.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        System.out.println("Now print in reverse");
        Iterator<String> dt = colors.descendingIterator();
        while(dt.hasNext()){
            System.out.println(dt.next());
        }
    }
}
