package yanevskyy;

import java.util.ArrayList;
import java.util.List;

/**
 * Uses as item menu.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class ItemIpl implements Item {
    /*Item name*/
    private String name;
    /*All subitems*/
    private List<SubItem> subItems;

    /**
     * Default constructor
     * @param name
     */
    public ItemIpl(String name) {
        this.name = name;
        this.subItems = new ArrayList<>();
    }

    /**
     * Prints in console his name and subitems names.
     */
    @Override
    public void printItem(int count) {
        System.out.println(count + "п. " + this.name);
        for (int i = 0; i < this.subItems.size(); i++) {
            System.out.println("  " + count + "." + (i+1) + "п.п " + this.subItems.get(i).getName());
        }
    }

    public void addSubItems(SubItem subItem){
        this.subItems.add(subItem);
    }
}
