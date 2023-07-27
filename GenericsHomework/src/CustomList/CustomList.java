package CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable> {
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public void remove(int index) {
        this.list.remove(index);
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }

    public void swap(int first, int second) {
        if (first != second) {
            if (first < second) {

                T firstElement = this.list.get(first);
                T secondElement = this.list.get(second);
                this.list.remove(firstElement);
                this.list.remove(secondElement);
                this.list.add(first, secondElement);
                this.list.add(second, firstElement);
            } else {
                T firstElement = this.list.get(second);
                T secondElement = this.list.get(first);
                this.list.remove(firstElement);
                this.list.remove(secondElement);
                this.list.add(second, secondElement);
                this.list.add(first, firstElement);
            }
        }


    }


    public int countGreaterThan(T element) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMin() {
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }
        return min;
    }


    public T getMax() {
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public void print() {
        this.list.forEach(System.out::println);
    }

    public void sort(){
        this.list.sort(Comparable::compareTo);
    }
}
