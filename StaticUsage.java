class StaticUsage
{
  public static void main(String[] args)
  {
    BankAccount a1 = new BankAccount("A1", 100000);
    BankAccount a2 = new BankAccount("A2", 200000);
    BankAccount a3 = new BankAccount("A3", 300000);
    System.out.println(a2.getBalance());
    System.out.println(BankAccount.getMinBalance());
  }
}


class BankAccount
{
  String accNum;
  float balance;
  static float minBalance = 1000; //static field

  BankAccount(String n, float bal)
  {
    accNum = n;
    balance = bal;
  }

  float getBalance()
  {
    return balance; // okay
    // return minBalance;  is also okay
  }

  static float getMinBalance()
  {
    return minBalance; //okay
    //retun balance; is not okay
  }
}
