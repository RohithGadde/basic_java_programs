class ContinueStatement
{
 public static void main(String[] args)
 {
   int i,j,k;
   for(i=1;i<=3;i++)
   {
     for(j=1;j<=3;j++)
     {
       for(k=1;k<=3;k++)
       {
         if(i == 2 && j == 2 && k==2)
          continue;
         System.out.println(i+ "," +j+ ","+ k);
       }
     }
   }
 }
}
