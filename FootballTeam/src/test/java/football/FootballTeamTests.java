package football;

import org.junit.Assert;
import org.junit.Test;

public class FootballTeamTests {

    @Test(expected = NullPointerException.class)
    public void constructorNameIsNullThrows() {
        FootballTeam footballTeam = new FootballTeam(null, 15);
    }

    @Test(expected = NullPointerException.class)
    public void constructorNameIsEmptySpaceThrows() {
        FootballTeam footballTeam = new FootballTeam("   ", 15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void vacationPointsAreBelow0Throws() {
        FootballTeam footballTeam = new FootballTeam("Valid", -3);
    }

    @Test
    public void getNameReturnsName() {
        FootballTeam footballTeam = new FootballTeam("Name", 15);
        Assert.assertEquals(footballTeam.getName(), "Name");
    }

    @Test
    public void getVacationCountReturnsTheRightNumber() {
        FootballTeam footballTeam = new FootballTeam("Name", 15);
        Assert.assertEquals(footballTeam.getVacantPositions(), 15);
    }

    @Test
    public void getCountReturnsPlayersCount() {
        FootballTeam footballTeam = new FootballTeam("Name", 15);
        Footballer footballer = new Footballer("One");
        Footballer footballer2 = new Footballer("Two");
        Footballer footballer3 = new Footballer("Three");
        footballTeam.addFootballer(footballer);
        footballTeam.addFootballer(footballer2);
        footballTeam.addFootballer(footballer3);
        Assert.assertEquals(footballTeam.getCount(), 3);
    }

    @Test
    public void addFootballerSuccessfully() {
        FootballTeam footballTeam = new FootballTeam("Name", 2);
        Footballer one = new Footballer("One");
        Footballer two = new Footballer("Two");
        footballTeam.addFootballer(one);
        footballTeam.addFootballer(two);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addFootballerWhenThereIsNoCapacityThrows() {
        FootballTeam footballTeam = new FootballTeam("Name", 2);
        Footballer one = new Footballer("One");
        Footballer two = new Footballer("Two");
        Footballer three = new Footballer("Three");
        footballTeam.addFootballer(one);
        footballTeam.addFootballer(two);
        footballTeam.addFootballer(three);
    }

    @Test
    public void removeFootballerSuccessfully() {
        FootballTeam footballTeam = new FootballTeam("Name", 15);
        Footballer one = new Footballer("One");
        Footballer two = new Footballer("Two");
        Footballer three = new Footballer("Three");
        footballTeam.addFootballer(one);
        footballTeam.addFootballer(two);
        footballTeam.addFootballer(three);
        footballTeam.removeFootballer("One");
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeNonPlayerThrows() {
        FootballTeam footballTeam = new FootballTeam("Name", 15);
        Footballer one = new Footballer("One");
        Footballer two = new Footballer("Two");
        Footballer three = new Footballer("Three");
        footballTeam.addFootballer(one);
        footballTeam.addFootballer(two);
        footballTeam.addFootballer(three);
        footballTeam.removeFootballer("Invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void InvalidNameFootballerForSaleThrows(){
        FootballTeam footballTeam = new FootballTeam("Name", 15);
        Footballer one = new Footballer("One");
        Footballer two = new Footballer("Two");
        Footballer three = new Footballer("Three");
        footballTeam.addFootballer(one);
        footballTeam.addFootballer(two);
        footballTeam.addFootballer(three);
        footballTeam.footballerForSale("Invalid");
    }

    @Test
    public void setForSaleShouldMakeIsActivePlayerFalse(){
        FootballTeam footballTeam = new FootballTeam("Name", 15);
        Footballer one = new Footballer("One");
        footballTeam.addFootballer(one);
        Footballer footballer =footballTeam.footballerForSale("One");
        Assert.assertFalse(footballer.isActive());

    }

    @Test
    public void getStatisticsShouldReturnStringStatistics(){
        FootballTeam footballTeam = new FootballTeam("Name", 15);
        Footballer one = new Footballer("One");
        Footballer two = new Footballer("Two");
        Footballer three = new Footballer("Three");
        footballTeam.addFootballer(one);
        footballTeam.addFootballer(two);
        footballTeam.addFootballer(three);
        String statistics = footballTeam.getStatistics();
        String expected = "The footballer One, Two, Three is in the team Name.";
        Assert.assertEquals(expected,statistics);
    }

}
