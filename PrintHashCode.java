class PrintHashCode
{
  public static void main(String[] args)
  {
    Employee e1 = new Employee(1,"John","Author",24000);
    Employee e2 = new Employee(2,"Henry","Printer",15000);
    System.out.println(System.identityHashCode(e1));
    System.out.println(System.identityHashCode(e2));
    Employee e3;
    e3 = e2;
    System.out.println(System.identityHashCode(e3));

  }
}

class Employee
{
 int idno;
 String name, designation;
 double salary;
 Employee(int n, String name,String desig,double sal)
 {
   idno = n;
   this.name = name;
   designation = desig;
   salary = sal;
 }
}
