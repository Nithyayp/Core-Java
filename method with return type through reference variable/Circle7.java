class Circle7
{
 static double area()
 {
  double pi=3.142;
  int r=5;
  double result=pi*r*r;
  return result;
 }
 public static void main(String[] args)
 {
   Circle7 C=new Circle7 ();
   double x=C.area();
   System.out.println(x);
  }
 }