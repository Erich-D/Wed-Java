package PriorityColors;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityColors {
    public static void main(String[] args) {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("blue");
        colors.add("red");
        colors.add("purple");
        colors.add("green");
        colors.add("yellow");
        colors.add("aqua");
        colors.add("brown");

        while(!colors.isEmpty()){
            System.out.println(colors.poll());
        }
    }
}
