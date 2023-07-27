package ListyIterator;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class ListyIterator implements Iterable<String> {
    private List<String> elements;
    private int counter;

    public List<String> getString() {
        return elements;
    }

    public int getCounter() {
        return counter;
    }

    public ListyIterator(String... elements) {
        this.elements = new ArrayList<>(Arrays.asList(elements));
        this.counter = 0;
    }

    public boolean Move() {
        if (hasNext()) {
            this.counter++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        if (this.counter<this.elements.size()-1) {
            return true;
        } else {
            return false;
        }
    }

    public void Print(){
        if(this.elements.isEmpty()){
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(this.elements.get(counter));
    }


    @Override
    public Iterator<String> iterator() {
        return new StringIterator();
    }

    private final class StringIterator implements Iterator<String>{
private int count;
        @Override
        public boolean hasNext(){
            return this.count < elements.size();
        }
        @Override
        public String next(){

            return elements.get(count);
        }



    }

    @Override
    public void forEach(Consumer<? super String> action) {
     this.elements.forEach(action::accept);
    }
}
