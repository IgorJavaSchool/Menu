package yanevskyy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class ConsoleMenuTest {
    Menu menuTVSmart = new Menu();
    ItemIpl settingConnected = new ItemIpl("Connected menu");
    SubItem lanSetting = new SubItem("LAN");
    SubItem wanSetting = new SubItem("WAN");
    ItemIpl settingChannels = new ItemIpl("Setting Channels");
    @Before
    public void setUp() throws Exception {
        settingConnected.addSubItems(lanSetting);
        settingConnected.addSubItems(wanSetting);
        menuTVSmart.addItems(settingConnected);
        menuTVSmart.addItems(settingChannels);
    }

    @Test
    public void printMenu() throws Exception {
        ConsoleMenu consoleMenu = new ConsoleMenu();
        PrintStream streamConsole = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream ourStream = new PrintStream(outputStream);
        System.setOut(ourStream);
        StringBuilder result = new StringBuilder();
        result.append("1п. Connected menu");
        result.append("\r\n");
        result.append("  1.1п.п LAN");
        result.append("\r\n");
        result.append("  1.2п.п WAN");
        result.append("\r\n");
        result.append("2п. Setting Channels");
        result.append("\r\n");

        consoleMenu.printMenu(menuTVSmart);
        System.setOut(streamConsole);

        Assert.assertEquals(outputStream.toString(),result.toString());
    }

}