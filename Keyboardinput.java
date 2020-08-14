import java.util.*;

class Keyboardinput
{
  public static void main(String[] args)
  {
    System.out.println("Now the system will take default input as a string");
    int n;
    System.out.println("Enter a number :");
    Scanner scan = new Scanner(System.in); //takes the input from the user
    n = scan.nextInt(); //conversion from string to integer value
    System.out.println("The entered value is:" +n);
  }
}
