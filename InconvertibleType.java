class InconvertibleType
{
 public static void main(String[] args)
 {
  int a = 10,b;
  b = (int)(a > 20); // an error will arise saying that boolean can't be converted to integer.
  System.out.println(b);
 }
}
