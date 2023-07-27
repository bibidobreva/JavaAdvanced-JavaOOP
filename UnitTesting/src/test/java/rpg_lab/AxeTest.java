package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTest {
    private static final int DUMMY_INITIAL_HEALTH = 10;
    private static final int DUMMY_INITIAL_EXPERIENCE = 10;


    private Dummy dummy;

    @Before
    public  void setupDummy(){
        this.dummy = new Dummy(DUMMY_INITIAL_HEALTH,DUMMY_INITIAL_EXPERIENCE);
    }

    @Test
    public void weaponAttackLoseDurability() {
        int durability = 10;
        Axe axe = new Axe(10, durability);

        axe.attack(dummy);
        Assert.assertEquals(axe.getDurabilityPoints(), durability - 1);
    }

    @Test(expected = IllegalStateException.class)
    public void canNotAttackWithBrokenAxe() {
        Axe axe = new Axe(10, 0);

        axe.attack(dummy);
    }
}
