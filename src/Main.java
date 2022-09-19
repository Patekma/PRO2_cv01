import models.PizzaMenu;
import models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("zdar");
        System.out.println("Hi");

        int num = 10;
        int num2 = 15;

        if(num == num2){
            System.out.println("num = num2");
        }
        else if(num < num2){
            System.out.println("num < num2");
        } else {
            System.out.println("num > num2");
        }

        String text = "aaa";
        String text2 = "aaa";
        if (text==text2){
            System.out.println("aaa");
        }else{
            System.out.println("neee");
        }

        PizzaMenuItem item1 = new PizzaMenuItem(190, "Salami","Salam bro");
        PizzaMenuItem item2 = new PizzaMenuItem(190, "Salami","Salam bro");
        PizzaMenuItem item3 = item1;
        item3.setPrice(888);
        if (item1 == item3){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        System.out.println("item1 cena: " + item1.getPrice());
        System.out.println(item1);

        List<PizzaMenuItem> pizzaItems = new ArrayList<>();
        pizzaItems.add(item1);
        pizzaItems.add(item2);
        pizzaItems.add(item3);
        System.out.println("");
        System.out.println("foreach: ");
        for (PizzaMenuItem item:
             pizzaItems) {
            System.out.println(item);
        }
        System.out.println("");
        PizzaMenuItem itemFromList = pizzaItems.get(1);
        System.out.println(itemFromList);

        PizzaMenu menu1 = new PizzaMenu();
        menu1.addItem(new PizzaMenuItem(130, "Tuna", "tunak asi"));
        
    }
}
