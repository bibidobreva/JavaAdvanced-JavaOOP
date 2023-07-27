package Froggy;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Lake implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }
    private Integer[] numbers;
    public Lake(Integer[] numbers){
        this.numbers = numbers;
    }

    private class Frog implements Iterator<Integer> {


        private Frog() {
            this.totalCount = 0;
            this.startIndexEven = 0;
            this.startIndexOdd = 1;
            this.counter = 0;

        }

        private int totalCount;
        private int startIndexEven;
        private int startIndexOdd;
        private int counter;

        @Override

        public boolean hasNext() {
            return totalCount < numbers.length;
        }

        @Override
        public Integer next() {
            if (this.hasNext()) {
                return numbers[this.getIndex()];
            }
            throw new NoSuchElementException();
        }

        private int getIndex() {

            int limitEven = numbers.length%2==0?numbers.length/2-1:numbers.length/2;
            if (counter <= limitEven) {
                this.counter++;
                this.totalCount++;
                int index = this.startIndexEven;
                this.startIndexEven += 2;
                return index;
            }
            this.counter++;
            this.totalCount++;
            int index = this.startIndexOdd;
            this.startIndexOdd+=2;
            return index;
        }
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }
}
