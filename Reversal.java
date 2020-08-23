class Reversal
{
 public static void main(String[] args)
 {
  int n = 1234, r , rev = 0;
  while(n != 0)
  {
   r = n%10;
   rev = (rev*10) + r;
   n = n/10;
  }
  System.out.println("The reversal value is :" +rev);
 }
}
