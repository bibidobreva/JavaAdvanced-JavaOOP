package GenericSwapMethodInteger;

import java.util.List;

public class Swap {
    public static <T> void swapPositions(List<T> list, int first, int second) {
        if (first != second) {
            if (second > first) {
                T firstElement = list.get(first);
                T secondElement = list.get(second);
                list.remove(firstElement);
                list.remove(secondElement);
                list.add(first, secondElement);
                list.add(second, firstElement);
            } else {
                T firstElement = list.get(second);
                T secondElement = list.get(first);
                list.remove(firstElement);
                list.remove(secondElement);
                list.add(second, secondElement);
                list.add(first, firstElement);
            }
        }
        for (T type : list) {
            System.out.println(type.getClass().getName() + ": " + type);
        }

    }


}
