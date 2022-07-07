package com.revature.activity;

import com.revature.exercise.Blue;
import com.revature.exercise.Red;
import com.revature.exercise.SecretClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ReflectionActivity {

	/*
	 * Find all of the following:
	 * 1. What fields does the secret class have?
	 * 2. What methods does the secret class have?
	 * 3. What are the modifiers on the fields and the methods?
	 * 4. What happens when you call each of the methods?
	 * 5. What are the values of the fields?
	 * 6. What annotations are used in the secret class?
	 * 7. What fields do the annotations have?
	 * 8. Which fields in the secret class use the annotations?
	 * 9. What are the values of those annotations' fields on each class field?
	 * 10. What annotation(s) does the class itself have, and what are the values of 
	 *     the field(s) on them?
	 */
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		SecretClass secret = new SecretClass();
		Class objClass = secret.getClass();

		System.out.println("1. What fields does the secret class have?");
		Field[] fields = objClass.getDeclaredFields();
		System.out.print("\tFields: ");
		for (Field field : fields) {
			System.out.print(field.getName() + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("2. What methods does the secret class have?");
		Method[] methods = objClass.getDeclaredMethods();
		System.out.print("\tMethods: ");
		for (Method method : methods) {
			System.out.print(method.getName() + "() ");
		}

		System.out.println();
		System.out.println();
		System.out.println("3. What are the modifiers on the fields and the methods?");
		System.out.println("\tprivate int id");
		System.out.println("\tprivate String name");
		System.out.println("\tprivate String message");
		System.out.println("\tprivate final long passcode");
		System.out.println();
		System.out.println("\tpublic String getMessage()");
		System.out.println("\tpublic static String getStaticMessage() throws InterruptedException");

		System.out.println();
		System.out.println("4. What happens when you call each of the methods?");
		System.out.println("\tReturns a hackerman image url: " + secret.getMessage());
		System.out.println("\tReturns a Rick Roll link: " + SecretClass.getStaticMessage());
		System.out.println();

		Field idField = secret.getClass().getDeclaredField("id");
		idField.setAccessible(true);

		Field nameField = secret.getClass().getDeclaredField("name");
		nameField.setAccessible(true);

		Field messageField = secret.getClass().getDeclaredField("message");
		messageField.setAccessible(true);

		Field passcodeField = secret.getClass().getDeclaredField("passcode");
		passcodeField.setAccessible(true);

		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		// set the modifier(s) of the value field to remove the final modifier
		modifiersField.setInt(passcodeField, passcodeField.getModifiers() & ~Modifier.FINAL);

		System.out.println("5. What are the values of the fields?");
		System.out.println("\tID: " + idField.get(secret));
		System.out.println("\tName: " + nameField.get(secret));
		System.out.println("\tMessage: " + messageField.get(secret));
		System.out.println("\tPasscode: " + passcodeField.get(secret));
		System.out.println();

		System.out.println("6. What annotations are used in the secret class?");
		for (Field field : fields) {
			if (field.getAnnotations().length != 0) {
				Annotation[] annotations = field.getAnnotations();
				for (Annotation annotation : annotations) {
					System.out.println("\t" + field.getName() + ": " + annotation.annotationType().getName());
				}
			}
		}
		System.out.println();

		System.out.println("7. What fields do the annotations have?");
		System.out.println("Red: pattern");
		System.out.println("Blue: isLight");
		System.out.println();

		System.out.println("8. Which fields in the secret class use the annotations?");
		System.out.println("\t name and message");
		System.out.println();

		System.out.println("9. What are the values of those annotations' fields on each class field?");
		System.out.println("name: red: pattern = DOTS");
		System.out.println("name: blue: isLight=true");
		System.out.println("message: blue: isLight = false");
		System.out.println();

		System.out.println("10. What annotation(s) does the class itself have, and what are the values of the field(s) on them?");
		Annotation[] annotations = objClass.getAnnotations();
		System.out.println("\tSecretClass has the red annotation with the field pattern=SOLID");
		for (Annotation annotation : annotations) {
			System.out.println("\t" + annotation);
		}
	}

	/*
	 * Example using the class and annotation below:
	 * 
	 * 1. the fields are name and number
	 * 2. the method is getName
	 * 3. name is public, number is public/static, getName() is public
	 * 4. the method returns the value of the name field
	 * 5. the value of name is "Ash", the value of number is 30
	 * 6. the annotation is Hello
	 * 7. the Hello annotation has a "value" field
	 * 8. the number field uses the Hello annotation
	 * 9. the "value" field of Hello is "num" on the number field
	 * 10. the class has the Hello field and its value is the default, "world"
	 * 
	 * @Hello
	 * public class Example {
	 * 		private String name = "Ash";
	 * 		@Hello(value="num")
	 * 		private static int number = 30;
	 *		public String getName() {
	 *			return this.name;
	 *		}
	 * }
	 * 
	 * @interface Hello {
	 * 		String value() default "world";
	 * }
	 */
}
