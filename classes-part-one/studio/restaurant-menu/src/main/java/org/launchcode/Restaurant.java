package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

        public static void main(String[] args) {
            // write your code here
            ArrayList<MenuItem> menuItems = new ArrayList<>();
            Menu menu = new Menu(new Date(), menuItems);

            MenuItem pasta = new MenuItem(5.99, "Italian Noodles", "Entree", true);
            MenuItem pizza = new MenuItem(99.99, "ZAAAAA", "Entree", false);

            menu.addItem(pasta);
            menu.addItem(pizza);
            menu.addItem(pizza);
            System.out.println(menu.printSingleFood(pasta));
            System.out.println(menu.printFullMenu());
            menu.removeItem(pasta);
            System.out.println(menu.printFullMenu());
            System.out.println("The Menu was last updated on " + menu.getLastUpdated());

        }


	// write your code here
//        Pet dog = new Pet(5);
//        Pet cat = new Pet(3);
//        System.out.println("1: " + dog.makeNoise());
//        System.out.println("2: " + Pet.makeNoise());
//
//        dog.increaseAge();
//        Pet.increaseAge();
//
//        MathClass math = new MathClass();
//        math.isEven(2);
//
//        boolean x = MathClass.isEven(2);
    }
