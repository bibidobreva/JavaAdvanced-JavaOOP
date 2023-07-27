package barracskWars.core.factories;

import barracskWars.interfaces.Unit;
import barracskWars.interfaces.UnitFactory;
import barracksWars.models.units.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType)  {
        try {
            Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<Unit> constructor = unitClass.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
}
