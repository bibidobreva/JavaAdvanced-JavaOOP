package rpg_lab;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;



public class HeroTest {
    private static final int TARGET_EXP=10;
    private static final String HERO_NAME = "TestHro";

    @Test
    public void attackGainsExperience(){
        Weapon weaponMock = Mockito.mock(Weapon.class);
        Target targetMock = Mockito.mock(Target.class);
        Mockito.when(targetMock.isDead()).thenReturn(true);
        Mockito.when(targetMock.giveExperience()).thenReturn(TARGET_EXP);

        Hero hero = new Hero(HERO_NAME,weaponMock);
        hero.attack(targetMock);

        Assert.assertEquals(TARGET_EXP,hero.getExperience());

    }
}
