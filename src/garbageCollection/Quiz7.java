package garbageCollection;
//3)
//public class Quiz7
//{
//	public static void main(String[] args)
//	{
//		m1(); // Line
//	}
//	static void m1()
//	{
//		Quiz7 t1 = new Quiz7();
//		Quiz7 t2 = new Quiz7();
//	}
//}                                                             //Answer: 2 objects eligible for GC




//4)
//class X2
//{
//	public X2 x;
//	public static void main(String [] args)
//	{
//		X2 x2 = new X2(); /* Line 6 */
//		X2 x3 = new X2(); /* Line 7 */
//		x2.x = x3;
//		x3.x = x2;
//		x2 = new X2();
//		x3 = x2; /* Line 11 */        //After line 11 runs, 2 objects are eligible for garbage collection
//	}
//}



//5)
//public class Quiz7
//{
//	public static void main(String [] args)
//	{
//		Quiz7 t1 = new Quiz7();
//		Quiz7 t2 = m1(t1); // line 6
//		Quiz7 t3 = new Quiz7();
//		t2 = t3; // line 8         //1 object is eligible for garbage collection after execution of line 8
//	}
//	static Quiz7 m1(Quiz7 temp)
//	{
//		temp = new Quiz7();
//		return temp;
//	}
//}



//6)
//public Object m()
//{
//	Object o = new Float(3.14F);
//	Object [] oa = new Object[l];
//	oa[0] = o; /* Line 5 */
//	o = null; /* Line 6 */
//	oa[0] = null; /* Line 7 */      //When is the Float object, created in line 3, eligible for garbage collection? =>
                                                                                 //ans: just after line 7
//	return o; /* Line 8 */
//}



//7)
//public class Quiz7
//{
//	public static void main(String[] args)
//	{
//		m1(); // Line
//	}
//	static void m1()
//	{
//		Quiz7 t1 = new Quiz7();
//		Quiz7 t2 = new Quiz7();
//                t1.null();
// 
//	}
//}                                   //1 object will be GC