package Quiz3;
import Quiz4.AccessSpecifierDemo;   //accessible in another package as the class is public
//import Quiz4.AccessSpecifierTry;     //error: we can't access default class in another package

//public class AccessSpecifierTest {
//
//	public static void main(String[] args) {
//		AccessSpecifierDemo asd = new AccessSpecifierDemo();
//		asd.publicfun();	//accessible
//		//asd.protectedfun();  //protected method should be inherited for accessing purpose
//		//asd.defaultfun();   //not accessible as method is default
//		//asd.privatefun();   //not accessible as method is private
//	}
//
//}


//--------------------------------------------------------------------------------------------------------

class child extends AccessSpecifierDemo{
	void func() {                                //(create method to remove error mentioned below)
		protectedfun();    //accessible
	}
}
public class AccessSpecifierTest {

	public static void main(String[] args) {
		AccessSpecifierDemo asd = new AccessSpecifierDemo();
		asd.publicfun();	//accessible
		child ch = new child();
		//ch.protectedfun();  //still not accessible with the help of object directly because method in 
		//AccessSpecifierDemo class has become static
		//To solve this error: create a new method inside child class. For e.g. we have created func()
		//Because protected method accessible in subclass i.e. child class
		
		
		
		
		//Now u can create new object of child class and access protectedfun() of base class [Here AccessSpecifierDemo is a base class of child class]
		child c = new child();
		c.func();   //accessible
		
		
		//NOTE: By accessing protected method in child class , it becomes private i.e protected become private
	}

}