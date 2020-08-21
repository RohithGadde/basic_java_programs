class Inheritance
{
 public static void main(String[] args)
 {
  Two obj = new Two();
  obj.fun1();
  obj.fun2();
  System.out.println("This is the concept of Inheritance");
 }
}

class One
{
 void fun1()
 {
  System.out.println("This is function in class one!");
 }
}

class Two extends One
{
 void fun2()
 {
  System.out.println("This is fucntion in class two!");
 }
}
