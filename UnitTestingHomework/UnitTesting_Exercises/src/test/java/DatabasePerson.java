import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p02_ExtendedDatabase.Database;
import p02_ExtendedDatabase.Person;

import javax.naming.OperationNotSupportedException;

public class DatabasePerson {
    Database database;
    Person testPerson = new Person(0, "Testing");

    @Before
    public void create() throws OperationNotSupportedException {
        Person first = new Person(1, "First");
        Person second = new Person(2, "Second");
        Person third = new Person(3, "Third");
        this.database = new Database(first, second, third);
    }


    @Test(expected = OperationNotSupportedException.class)
    public void addNullPersonToDatabaseThrowsException() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void addsPersonToDatabase() throws OperationNotSupportedException {
        Person person = new Person(4, "Fourth");
        int elementsBefore = database.getElements().length;
        database.add(person);
        int elementsAfter = database.getElements().length;
        Person lastPerson = database.getElements()[database.getElements().length - 1];
        Assert.assertEquals(person, lastPerson);
        Assert.assertEquals(elementsBefore + 1, elementsAfter);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void removePersonFromEmptyDatabaseThrowsException() throws OperationNotSupportedException {
        Database empty = new Database();
        empty.remove();

    }

    @Test
    public void removePersonFromDatabase() throws OperationNotSupportedException {
        int databaseLengthBefore = database.getElements().length;
        database.remove();
        int databaseLengthAfter = database.getElements().length;
        Assert.assertEquals(databaseLengthBefore - 1, databaseLengthAfter);

    }


    @Test(expected = OperationNotSupportedException.class)
    public void findByNullStringThrows() throws OperationNotSupportedException {
        database.findByUsername(null);
    }


    @Test
    public void findsPersonByUsername() throws OperationNotSupportedException {
        database.add(testPerson);
        Person foundPerson = database.findByUsername("Testing");
        Assert.assertEquals(foundPerson, testPerson);
    }

    @Test
    public void findById() throws OperationNotSupportedException {
        database.add(testPerson);
        Person found = database.findById(0);
        Assert.assertEquals(found,testPerson);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findPersonWithNoSuchIDThrows() throws OperationNotSupportedException {
        Person person = database.findById(-10);
    }
}
