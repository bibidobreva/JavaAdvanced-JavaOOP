package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> clazz = Reflection.class;
        System.out.println(clazz);
        System.out.println(clazz.getSuperclass());
        Arrays.stream(clazz.getAnnotatedInterfaces()).forEach(System.out::println);
        System.out.println(clazz.getDeclaredConstructor().newInstance());
    }
}
