import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = x.nextInt();
    int other = (7+(age/2));
    System.out.println(age + "-year olds should date somebody who is at least " + other + " years old.");
    }
}
