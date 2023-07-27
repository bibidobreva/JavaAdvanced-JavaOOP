package RandomArratList;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class RandomArrayList extends ArrayList<Object> {
    public Object getRandomElement(){
        int random = ThreadLocalRandom.current().nextInt(0,size());

        return remove(random);

    }
}
