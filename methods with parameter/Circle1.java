class Circle1
{
 static void area(int r)
 {
   final double pi=3.142;
         double result=pi*r*r;
   System.out.println(result);
 }
 public static void main(String [] args)
 {
  area(5);
  area(10);
 }
}