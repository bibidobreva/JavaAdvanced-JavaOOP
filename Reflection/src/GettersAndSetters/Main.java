package GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;
        Method[] methods = clazz.getDeclaredMethods();

        Comparator<Method> comparator = Comparator.comparing(Method::getName);

        Set<Method> getters = new TreeSet<>(comparator);
        Set<Method> setters = new TreeSet<>(comparator);

        for (Method method : methods) {
            if(method.toString().contains("set")){
                setters.add(method);
            } else if (method.toString().contains("get")) {
                getters.add(method);
            }
        }

        getters.forEach(e-> System.out.println(e.getName()+" will return class "+e.getReturnType().getName()));
        setters.forEach(e-> System.out.println(e.getName()+" and will set field of class "+e.getParameterTypes()[0].getName()));
    }
}

