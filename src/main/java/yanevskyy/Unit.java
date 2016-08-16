package yanevskyy;

import java.util.ArrayList;
import java.util.List;

/**
 * Uses as the unit from menu.
 * Created by Y on 16.08.2016.
 */
public class Unit implements MenuUnit{
    /*Unit name*/
    private String name;
    /*Sub unit*/
    private List<SubUnit> subUnitList;

    /**
     * Default constructor
     * @param name Unit name.
     */
    public Unit(String name) {
        this.name = name;
        this.subUnitList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    public List<SubUnit> getSubUnitList() {
        return subUnitList;
    }
}
