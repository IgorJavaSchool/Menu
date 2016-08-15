package yanevskyy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Y on 16.08.2016.
 */
public class MenuTest {
    @Test
    public void printAllMenu() throws Exception {
        Menu menu = new Menu();
        Unit brightness = new Unit("Setting brightness");
        Unit volume = new Unit("Setting volume");
        Unit network = new Unit("Setting network");
        SubUnit lan = new SubUnit("Setting LAN");
        SubUnit wan = new SubUnit("Setting WAN");
        network.getSubUnitList().add(lan);
        network.getSubUnitList().add(wan);
        menu.addUnits(brightness);
        menu.addUnits(volume);
        menu.addUnits(network);

        menu.printAllMenu();
    }

}