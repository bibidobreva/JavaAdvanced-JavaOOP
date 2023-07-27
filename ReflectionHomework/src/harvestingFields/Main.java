package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Class<RichSoilLand> clazz = RichSoilLand.class;


		String input;
		while(!(input=scanner.nextLine()).equals("HARVEST")){
			Field[] fields = clazz.getDeclaredFields();
			if(input.equals("private")){
				printPrivate(input, fields);
			} else if (input.equals("protected")) {
				printProtected(input, fields);
			} else if (input.equals("public")) {
				printPublic(input, fields);
			} else if (input.equals("all")) {
				printAll(input, fields);
			}
		}
	}

	private static void printAll(String input, Field[] fields) {
		for (Field field : fields) {
			int modifier = field.getModifiers();

			print(modifier,field);
		}
	}

	private static void printPublic(String input, Field[] fields) {
		for (Field field : fields) {
			int modifier = field.getModifiers();
			if(Modifier.isPublic(modifier)){
				print(modifier, field);
			}
		}
	}

	private static void printProtected(String input, Field[] fields) {
		for (Field field : fields) {
			int modifier = field.getModifiers();
			if(Modifier.isProtected(modifier)){
				print(modifier,field);
			}
		}
	}

	private static void printPrivate(String input, Field[] fields) {
		for (Field field : fields) {
			int modifier = field.getModifiers();
			if(Modifier.isPrivate(modifier)){
				print(modifier, field);
			}
		}
	}

	private static void print(int modifier, Field field) {

		System.out.println(Modifier.toString(modifier) +" "+ field.getType().getSimpleName()+" "+ field.getName());

	}
}
