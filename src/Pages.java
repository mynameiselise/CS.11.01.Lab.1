import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = x.nextInt();
        int pages = (100-age);
        System.out.println(age + "-year olds should read at least " + pages + " pages before giving up on a book.");

    }
}
