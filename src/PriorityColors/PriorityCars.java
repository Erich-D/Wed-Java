package PriorityColors;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityCars {
    public static void main(String[] args) {
        Queue<Car> cars = new PriorityQueue<>();
        cars.add(new Car("Ford","Mustang","green",1968));
        cars.add(new Car("Pontiac","GTO Judge","red",1969));
        cars.add(new Car("Chevrolet","Camaro","yellow",1969));
        cars.add(new Car("Dodge","Charger","rust",1969));
        cars.add(new Car("Plymouth","Road Runner","orange",1970));
        cars.add(new Car("Dodge","Challenger","orange",1970));
        cars.add(new Car("Chevrolet","Corvette","white",1963));
        cars.add(new Car("AMC","AMX","red",1970));
        cars.add(new Car("Chevrolet","Chevelle","forest green",1970));
        cars.add(new Car("Plymouth","Barracuda","neon green",1970));
        cars.add(new Car("Oldsmobile","442","pewter",1968));
        cars.add(new Car("Mercury","Cougar","blue",1970));
        cars.add(new Car("Buick","Grand National","black",1982));
        cars.add(new Car("Dodge","Coronet","light green",1970));

        System.out.println("List by make and model");
        while(!cars.isEmpty()) {
            System.out.println(cars.poll());
        }

        Queue<Car> cars2 = new PriorityQueue<>(new YearCompare());
        cars2.add(new Car("Ford","Mustang","green",1968));
        cars2.add(new Car("Pontiac","GTO Judge","red",1969));
        cars2.add(new Car("Chevrolet","Camaro","yellow",1969));
        cars2.add(new Car("Dodge","Charger","rust",1969));
        cars2.add(new Car("Plymouth","Road Runner","orange",1970));
        cars2.add(new Car("Dodge","Challenger","orange",1970));
        cars2.add(new Car("Chevrolet","Corvette","white",1963));
        cars2.add(new Car("AMC","AMX","red",1970));
        cars2.add(new Car("Chevrolet","Chevelle","forest green",1970));
        cars2.add(new Car("Plymouth","Barracuda","neon green",1970));
        cars2.add(new Car("Oldsmobile","442","pewter",1968));
        cars2.add(new Car("Mercury","Cougar","blue",1970));
        cars2.add(new Car("Buick","Grand National","black",1982));
        cars2.add(new Car("Dodge","Coronet","light green",1970));

        System.out.println("List by year and model");
        while(!cars2.isEmpty()) {
            System.out.println(cars2.poll());
        }
    }
}
