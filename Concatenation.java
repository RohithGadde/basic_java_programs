class Concatenation
{
 public static void main(String[] args)
 {
  int n1 = 10, n2 = 20;
  String s1 = "hello", s2 = "30";
  float f = 46.25f;
  System.out.println(n1 + n2);
  System.out.println(n1 + s1);
  System.out.println(n1 + s2);
  System.out.println(n1 + f);
  System.out.println(s1 + n1 + n2);
  System.out.println(s1 + (n1 + n2));
 }
}
