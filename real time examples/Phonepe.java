class Phonepe
{
  static String name="chandan";
  static double balance=0;

  static void open_account()
  {
   System.out.println(" Thank you for opening the account");
   System.out.println(" your name is "+name);
   System.out.println(" your current balance is "+ balance);
  }

  static void deposit(double amt)
  {
   balance=amt;
  }

  static void withdraw(double amt)
  {
   balance=balance-amt;
   System.out.println(" your balance is "+ balance);
  }

  public static void main(String [] args)
  {
      open_account();
      deposit(5000.0);
      withdraw(1000.0);
  }
 }