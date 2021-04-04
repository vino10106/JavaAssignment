import java.util.Scanner;
public class palindrome{
public static void main(String args[]) {
String InputString, reversedString="";
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Input String");
InputString=scan.nextLine();
int Stringlength=InputString.length();
for(int i=Stringlength-1;i>=0;i--)
  reversedString=reversedString+InputString.charAt(i);
if (InputString.equals(reversedString))
    System.out.println("Palindrome");
else
    System.out.println("Not a Palindrome");
}
}