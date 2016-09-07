package yanevskyy;

/**
 * Uses for show all items and subitems menu.
 * Created by Y on 16.08.2016.
 */
public class ConsoleMenu {
    void printMenu(Menu menu){
        for (int i = 0; i < menu.getItems().size(); i++) {
            menu.getItems().get(i).printItem(i + 1);
        }
    }
}
