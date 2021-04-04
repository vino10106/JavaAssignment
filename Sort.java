import java.util.Scanner;

public class Sort
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
		String str1 = scan.nextLine();
		int j = 0;
		char temp = 0;
		char[] chars = str1.toCharArray();
		for (int i = 0; i < chars.length; i++) {
				for (j = 0; j < chars.length; j++) {
						if (chars[j] > chars[i]) {
								temp = chars[i];
								chars[i] = chars[j];
								chars[j] = temp;
						}
				}
		}
	System.out.println("The sorted string is : ");
    System.out.println(chars);
	}
}