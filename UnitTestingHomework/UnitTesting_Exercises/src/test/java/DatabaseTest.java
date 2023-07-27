import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    Database database;


    @Before
    public void create() throws OperationNotSupportedException {

        this.database = new Database(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }


    @Test
    public void createsConstructorShouldCreateDB() throws OperationNotSupportedException {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(database.getElements(), array);

    }


    @Test(expected = OperationNotSupportedException.class)
    public void createConstructorWithMoreThan16ElementsShouldThrowException() throws OperationNotSupportedException {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        database = new Database(array);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void createConstructorWithLessThan1ElementsThrowsException() throws OperationNotSupportedException {

        database = new Database();
    }


    @Test(expected = OperationNotSupportedException.class)
    public void giveNullToAddMethodThrowsException() throws OperationNotSupportedException {
        database.add(null);
    }


    @Test
    public void addSuccessfullyElementToDatabase() throws OperationNotSupportedException {
        database.add(10);
        Integer[] databaseArray = database.getElements();
        Assert.assertEquals(databaseArray[databaseArray.length - 1], Integer.valueOf(10));
    }


    @Test(expected = OperationNotSupportedException.class)
    public void removeFromEmptyDatabaseThrowsException() throws OperationNotSupportedException {
        Database emptyDatabase = new Database(1);
        emptyDatabase.remove();
        emptyDatabase.remove();
    }

    @Test
    public void removeLastElementFromDatabase() throws OperationNotSupportedException {
        Integer[] beforeRemove = database.getElements();
        database.remove();
        Integer[] afterRemove = database.getElements();
        Assert.assertEquals(beforeRemove.length - 1, afterRemove.length);
        int secondToLastBeforeRemove = beforeRemove[beforeRemove.length-2];
        int lastAfterRemove = afterRemove[afterRemove.length-1];
        Assert.assertEquals(secondToLastBeforeRemove,lastAfterRemove);


    }

}
