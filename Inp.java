import java.util.Scanner;
public class Inp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String value: ");
        String userString = scan.nextLine();
        System.out.println("Enter the Interger value: ");
        int userInteger = scan.nextInt();
        System.out.println("Enter the Float value: ");
        float userFloat = scan.nextFloat();
        System.out.println("\nString Value : "+userString);
        System.out.println("Integer Value : "+userInteger);
        System.out.println("Float Value : "+userFloat);


    }
}