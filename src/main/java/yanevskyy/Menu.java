package yanevskyy;

import java.util.ArrayList;
import java.util.List;

/**
 * Uses as menu with utils.
 * Created by Y on 16.08.2016.
 */
public class Menu implements ConsoleMenu, UnitsMenager {
    /*Menu utils*/
    private List<Unit> units;

    /**
     * Default constructor
     */
    public Menu() {
        this.units = new ArrayList<>();
    }

    /**
     * Print all utils and sub utils to console.
     */
    @Override
    public void printAllMenu(){
        for (Unit unit : getUnits()) {
            System.out.println(unit);
            if (unit.getSubUnitList().size() > 0){
                for (SubUnit subUnit : unit.getSubUnitList()){
                    System.out.println(subUnit);
                }
            }
        }
    }

    /**
     * Adds new units.
     * @param unit Takes unit.
     */
    @Override
    public void addUnits(Unit unit) {
        getUnits().add(unit);
    }

    public List<Unit> getUnits() {
        return units;
    }

}
