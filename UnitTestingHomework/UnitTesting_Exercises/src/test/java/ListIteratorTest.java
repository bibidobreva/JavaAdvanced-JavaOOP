import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p03_IteratorTest.ListIterator;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {
    ListIterator listIterator;
    ListIterator testList;

    @Before
    public void create() throws OperationNotSupportedException {
        String[] strings = new String[]{"One","Two","Three"};
        testList = new ListIterator(strings);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void createWithNullConstructor() throws OperationNotSupportedException {
        listIterator = new ListIterator(null);
    }

    @Test
    public void createsList() throws OperationNotSupportedException {
        String[] strings = new String[]{"One","Two","Three"};
        listIterator = new ListIterator(strings);
    }

    @Test
    public void testHasNext(){
        Assert.assertTrue(testList.hasNext());
        testList.move(); //"Two"
        Assert.assertTrue(testList.hasNext());
        testList.move(); //"Three"
        Assert.assertFalse(testList.hasNext());
    }

    @Test
    public void testMove(){
        Assert.assertTrue(testList.move());
        Assert.assertTrue(testList.move());
        Assert.assertFalse(testList.move());
    }


    @Test(expected = IllegalStateException.class)
    public void testPrintWithEmptyListThrows() throws OperationNotSupportedException {
        listIterator = new ListIterator();
       listIterator.print();
    }

    @Test
    public void testPrintReturnsCurrentElement(){
        String currentElement = testList.print();
        Assert.assertEquals("One",currentElement);
    }


}
