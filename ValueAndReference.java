class ValueandReference
{
  void fun(int p,Student q)
  {
    p = 98;
    q.idno = 22;
    q.name = "MG Hetor";
    q.course = "Java";
    q.fee = 35000;
  }
  public static void main(String[] args)
  {
    int n = 57;
    Student s = new Student(11,"Rohith Sharma",".Net",18000);
    System.out.println("Before:");
    System.out.println(n);
    s.print();
    ValueandReference obj = new ValueandReference();
    obj.fun(n,s);
    System.out.println("After:");
    System.out.println(n);
    s.print();

  }
}


class Student
{
 int idno;
 String name, course;
 double fee;
 Student(int idno,String name,String course, double fee)
 {
   this.idno = idno;
   this.name = name;
   this.course = course;
   this.fee= fee;
 }
 void print()
 {
   System.out.println(idno+","+name+","+course+","+fee);
 }
}
