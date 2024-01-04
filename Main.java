package org.example.abstraction_1;

public class Main {
    public static void main(String[] args) {


        Triangle triangle = new Triangle(10.5, 12.3,7.5);
        Trapezium trapezium = new Trapezium(11.3,11.2, 18.2);
        Rectangle rectangle = new Rectangle(12.6, 11.0);

        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        System.out.println(trapezium.area());
        System.out.println(trapezium.perimeter());

        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.perimeter());


        Dog dog = new Dog("Bob");
        Duck duck = new Duck("Donald");
        Cat cat = new Cat("Tom");

        dog.sound();
        System.out.println(dog.getName());

        duck.sound();
        System.out.println(duck.getName());

        cat.sound();
        System.out.println(cat.getName());
    }
    }

