class ThisUsage
{
  public static void main(String[] args)
  {
   Batch b1 = new Batch(20, "Java");
   b1.print();
   Batch b2 = new Batch();
   b2.print();
  }
}





class Batch
{
 int ns;
 String course;
 Batch(int ns, String course)
 {
   this.ns = ns;
   this.course = course;
 }

 Batch()
 {
   //ns = 60;
   //course = "C++";
   this(60,"C++");  //we can replace these above two sentences by this single line
 }

 void print()
 {
   System.out.println(ns + "," + course);
 }
}
