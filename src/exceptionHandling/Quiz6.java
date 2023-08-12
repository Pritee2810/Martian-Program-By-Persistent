package exceptionHandling;

//1)
//	class Quiz6 {
//		public static void main(String[] args)
//
//		 {
//			try
//
//			{
//
//				int b=5/0;//exception occur
//
//				int a[]=new int[5];//index created 0 to 4
//
//				a[5]=12;//exception occur here
//
//
//			}
//
//			catch(Exception se)
//
//			{
//
//				System.out.println(se);
//
//			}
//
//			catch(ArithmeticException ae)
//
//			{
//
//			System.out.println(ae);	
//
//			}
//
//			catch(ArrayIndexOutOfBoundsException e)
//
//			{
//
//				System.out.println(e);
//
//			}
//
//		}
//
//		}


//2)
//public class Quiz6
//
//{
//
//public static void main(String[] args) 
//
//{
//
//int[ ] list = new int[4];
//
//System.out.println(list[4]);
//
//  }
//
//}



//3)
public class Quiz6 {
	public static void main(String[] args) {
        try

		{

			try


			{

				String s=null;

				System.out.println(s.length());

			}

			catch(NullPointerException e)

			{

				System.out.println(e);

			}

			finally

			{

			}

			try

			{

				int a[]=new int[5];

				a[5]=30;

			}

			catch(ArithmeticException e)

			{

				System.out.println(e);

			}
			System.out.println("Rest of code");

		}
		catch(Exception e)

		{

			System.out.println("can not divide by 0");

		}

		System.out.println("Important code");

	}
}

