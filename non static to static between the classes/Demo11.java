class Trapezoida9
{
  void area()
 {
   final double t=0.5;
         int a=2;
	 int b=3;
	 int h=4;
	 double result=t*(a+b)*h;
   System.out.println(result);
  }
 }
 class Demo11
 {
  public static void main(String [] args)
  {
    Trapezoida9 T=new Trapezoida9();
   T.area();
   }
  }