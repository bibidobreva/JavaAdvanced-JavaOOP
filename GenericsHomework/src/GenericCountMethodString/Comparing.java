package GenericCountMethodString;


import java.util.List;

public class Comparing<T extends Comparable<T>> {

    public List<T> list;
public Comparing(List<T> list){
    this.list = list;
}

    public void getCount(T toCompare) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(toCompare) > 0) {
                count++;
            }
        }
        System.out.println(count);

    }

}
