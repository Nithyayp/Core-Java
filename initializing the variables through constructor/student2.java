class student2
{
   String course_name;
   String unv_name;
   int exam_cost;

  student2(String a,String b,int c)
  {
     course_name=a;
     unv_name=b;
     exam_cost=c;
  }
  public static void main(String [] args)
  {
   student2 s=new student2("CE","VTU",1000);
   System.out.println(s.course_name);
   System.out.println(s.unv_name);
   System.out.println(s.exam_cost);
}
}