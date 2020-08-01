package com.example;

import com.example.menu.MenuItem;
import com.example.menu.Menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu(Calendar.getInstance().getTime(), new ArrayList<>());

        MenuItem milkSteak = new MenuItem("MilkSteak", 4.32, "A verbose bouquet of runny stew-water on bubblegum.", "Appetizer", true , "4/25/20");
        MenuItem chickenPotPie = new MenuItem("Chicken Pot Pie", 14.66, "A putrid bowl of inedible material with chicken stock poured over it.", "Main Course", false,"8/06/45");
        MenuItem froggyLegFishFangers = new MenuItem("Froggy Leg Fish Fangers", 650030.09, "Don't you dare order this. All tables automatically billed for it.", "Dessert", true, "5/06/19");

        menu.addMenuItem(milkSteak);
        menu.addMenuItem(chickenPotPie);
        menu.addMenuItem(froggyLegFishFangers);


        Scanner input;
            input = new Scanner(System.in);
            System.out.println("\nName of new menu item: ");
            String name = input.nextLine();

            System.out.println("\nPrice of new menu item: ");
            Double price = input.nextDouble();

            System.out.println("\nDescription of new menu item: ");
            String description = input.nextLine();

            System.out.println("\nAppetizer, Main Course, or Dessert: ");
            String category = input.nextLine();

            Boolean isRecentMenuAddition = true;

            Date currentTime = Calendar.getInstance().getTime();
            menu.setMenuLastUpdated(currentTime);

            MenuItem newItem = new MenuItem(name, price, description, category, isRecentMenuAddition, currentTime.toString());
            menu.addMenuItem(newItem);

        input.close();

        System.out.println(menu.menuPrint());


        System.out.println(froggyLegFishFangers);
        menu.removeMenuItem(milkSteak);
        System.out.println(menu.menuPrint());

    }

}
