import java.util.*;

class Sum
{
  public static void main(String[] args)
  {
    System.out.println("This is a program to find the sum.");
    int a,b,c;
    System.out.println("Enter value 1:");
    Scanner x = new Scanner(System.in);
    a = x.nextInt();
    System.out.println("Enter value 2:");
    Scanner y = new Scanner(System.in);
    b = y.nextInt();
    c = a+b;
    System.out.println("The sum is:"+c);
  }
}
