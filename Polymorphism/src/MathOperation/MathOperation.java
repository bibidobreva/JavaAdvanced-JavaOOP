package MathOperation;

public class MathOperation {

    public MathOperation(){

    }

    public  int add(int a, int b){
        return a+b;
    }
    public  int add(int a, int b,int c){
        return add(a,add(b,c));
    }
    public  int add(int a, int b, int c, int d){
        return add(a,add(b,c,d));
    }

}
