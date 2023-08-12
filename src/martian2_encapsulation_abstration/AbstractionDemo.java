package martian2_encapsulation_abstration;

public class AbstractionDemo {
	public static void main(String[] args) {
		GraphicObject circle = new Circle();   //object of child class i.e Circle class referring to parent class GraphicObject
		   // while executing this line of object creation ... cursor goes to circle class and it sees that it extends
		   // GraphicObject class. So cursor goes to GraphicObject class and GraphicObject constructor get called
		   // hence the output =>  base abstract class
		circle.draw();  
		circle.resize();
		
		GraphicObject rectangle = new Rectangle();   //base abstract class
		rectangle.draw();
		rectangle.resize();
	}
}
