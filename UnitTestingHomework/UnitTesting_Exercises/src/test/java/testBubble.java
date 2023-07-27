import org.junit.Assert;
import org.junit.Test;
import p04_BubbleSortTest.Bubble;


public class testBubble {
    @Test
    public void testSortingBubble(){
        int [] unsortedArray = new int[]{5,-7,0,3,789,-111};
        int [] sorted = new int[]{-111,-7,0,3,5,789};
        Bubble.sort(unsortedArray);
        Assert.assertArrayEquals(unsortedArray,sorted);

    }
}
