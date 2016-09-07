package yanevskyy;

import java.util.ArrayList;
import java.util.List;

/**
 * Uses as menu with items.
 * Created by Y on 16.08.2016.
 */
public class Menu {
    /*Menu utils*/
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    /**
     * Default constructor
     */
    public Menu() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds new item.
     * @param item Takes item.
     */
    public void addItems(Item item) {
        this.items.add(item);
    }

}
