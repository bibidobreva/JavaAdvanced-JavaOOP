package GenericBox;

public class Box <T>{
    private T input;
    public Box(T input){
        this.input = input;
    }

    @Override
    public String toString() {
        return String.format(this.input.getClass().getName()+": "+this.input);
    }
}
