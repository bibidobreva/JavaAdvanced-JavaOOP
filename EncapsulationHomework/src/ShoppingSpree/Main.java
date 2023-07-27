package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] people = scanner.nextLine().split(";");
        String [] product = scanner.nextLine().split(";");

        List<Person> personList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        fillPersonList(people, personList);
        fillProductList(product, productList);

        String input;
        while(!(input = scanner.nextLine()).equals("END")){
            String person = input.split("\\s+")[0];
            String productToBuy = input.split("\\s+")[1];
            Person currentPerson = personList.stream().filter(e -> e.getName().equals(person)).findFirst().get();
            Product currentProduct = productList.stream().filter(e->e.getName().equals(productToBuy)).findFirst().get();
            currentPerson.buyProduct(currentProduct);
        }

        printPeople(personList);
    }

    private static void printPeople(List<Person> personList) {
        for(Person person: personList){
            if(person.getProducts().isEmpty()){
                System.out.println(person.getName()+" - Nothing bought");
            }else {
                System.out.print(person.getName()+" - ");
                System.out.println(person.getProducts().toString().replaceAll("[\\[\\]]",""));
            }
        }
    }

    private static void fillProductList(String[] product, List<Product> productList) {
        for (int i = 0; i < product.length; i++) {
            String productName = product[i].split("=")[0];
            double cost = Double.parseDouble(product[i].split("=")[1]);
            Product product1 = new Product(productName,cost);
            productList.add(product1);
        }
    }

    private static void fillPersonList(String[] people, List<Person> personList) {
        for (int i = 0; i < people.length; i++) {
            String personName = people[i].split("=")[0];
            double money = Double.parseDouble(people[i].split("=")[1]);
            Person person = new Person(personName,money);
            personList.add(person);
        }
    }
}
