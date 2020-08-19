class ObjectComparision
{
  public static void main(String[] args)
  {
    Employee e1 = new Employee(1,"John","Author",24000);
    Employee e2 = new Employee(2,"Henry","Printer",15000);
    e2 = e1;
    if(e2 == e1)
    {
      System.out.println("Same");
    }
    else
    {
      System.out.println("Not Same");
    }
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
