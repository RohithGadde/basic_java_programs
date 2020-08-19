class StringPassedByValue
{
 void fun(String t)
 {
   t = "Hello in fun()";
   System.out.println("This is within the function: "+t);
 }
 public static void main(String[] args)
{
  String s = "hello";
  new StringPassedByValue().fun(s);
  System.out.println(s);
}
}
