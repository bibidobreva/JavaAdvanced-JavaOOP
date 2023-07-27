package barracskWars;

import barracskWars.core.Engine;
import barracskWars.core.factories.UnitFactoryImpl;
import barracskWars.data.UnitRepository;
import barracskWars.interfaces.Repository;
import barracskWars.interfaces.Runnable;
import barracskWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
