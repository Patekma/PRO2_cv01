package models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaMenuItem> menuItems;
    private LocalDateTime lastUpdate;

    public PizzaMenu(){
        menuItems = new ArrayList<>();
    }
    public void addItem(PizzaMenuItem itemToAdd){
        menuItems.add(itemToAdd);
        lastUpdate = LocalDateTime.now();
    }

    public void removeItem(PizzaMenuItem itemToRemove){
        menuItems.remove(itemToRemove);
    }
    public void removeItem(String name){
        PizzaMenuItem toDelete = null;
        for (PizzaMenuItem item :
                menuItems) {
            if (item.getName().equals(name)) {
                toDelete = item;
                break;
            }
            if (toDelete != null){
                menuItems.remove(toDelete);
            }
            }

    }
}
