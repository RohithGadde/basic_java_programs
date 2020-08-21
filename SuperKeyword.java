class SuperKeyword
{
 public static void main(String[] args)
 {
  Base2 obj = new Base2();
  obj.fun();
 }
}


class Base1
{
 void fun()
 {
  System.out.println("This is base class 1");
 }
}

class Base2 extends Base1 //named the second class as Base2 but its actually child class.
{
 void fun()
 {
  super.fun(); //refers to the immediate parent class function.
  System.out.println("This is base class 2");
 }
}
