class Accessmulticlass
{
   public static void main(String[] args)
   {
     System.out.println("This is the main function and we call function from the other class in this class");
     new Multiclass1().fun1();
   }
}


class Multiclass1
{
  void fun1()
  {
  System.out.println("This is class one");
}
}
