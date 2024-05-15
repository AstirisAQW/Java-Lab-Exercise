/*
Create an inheritance program with a parent class called Fruits
and with three sub class classes called Apple, Orange and Mango.
Call the each method of every class in the main method
 */

public class ClassFruits {
    class Fruits{
        void eat(){
            System.out.println("\nEating Fruit...");
        }
    }

    class Apple extends Fruits{
        void taste(){
            System.out.println("Apple tastes like Apple");
        }

        void vitamins(){
            System.out.println("Apples has Vitamin C");
        }
    }

    class Orange extends Fruits{
        void taste(){
            System.out.println("Orange taste like Orange");
        }

        void vitamins(){
            System.out.println("Orange has Vitamin C");
        }
    }

    class Mango extends Fruits{
        void taste(){
            System.out.println("Mango tastes like Mango");
        }

        void vitamins(){
            System.out.println("Mango has Vitamin B\n");
        }
    }

    public static void main(String[] args) {
        ClassFruits fruits = new ClassFruits();

        Apple apple = fruits.new Apple();
        Orange orange = fruits.new Orange();
        Mango mango = fruits.new Mango();

        apple.eat();
        apple.taste();
        apple.vitamins();

        orange.eat();
        orange.taste();
        orange.vitamins();

        mango.eat();
        mango.taste();
        mango.vitamins();

    }
}
