package Quiz3;

public class Test1

{

  static int i = 1;

  public static void main(String args[])

  {

  System.out.println(i+" ");

  //m(i);   //method m should be static

  System.out.println(i);

  }

  public void m(int i)

  {

   i=i+2;

  }

}
