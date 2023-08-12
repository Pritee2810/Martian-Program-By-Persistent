
public class OneDArray {
	public static void main(String[] args) {
		//single value containers
		int state1PopulationCount = 502;
		int state2PopulationCount = 765;
		int state3PopulationCount = 897;
		int state4PopulationCount = 456;
				
		//multi value container
		//int[] countryPopulation = new int[4];   //all elements are default 0
		//int[] countryPopulation = {502,765,897,456};   //elements with some initial value =>  implicit way
		int[] countryPopulation = new int[] {502,765,897,456};   //elements with some initial value  =>explicit way  => reduces no. of lines of code
		//System.out.println("Country Population is: "+countryPopulation);   //[I@1eb44e46
		
		//Read the element in array
		System.out.println("First country population: "+countryPopulation[0]);
		System.out.println("Second country population: "+countryPopulation[1]);
		
		//Read all element in array
		for(int i=0; i<countryPopulation.length; i++) {
			System.out.println("Country Population["+i+"] is:"+countryPopulation[i]);
		}
		//Write / update operation
			countryPopulation[0] = 5102;
			countryPopulation[1] = 7645;
			countryPopulation[2] = 8927;
			countryPopulation[3] = 4756;
			
			System.out.println();
			System.out.println("Rewriting the values");
//			for(int j=0; j<countryPopulation.length; j++) {
//				System.out.println("Country Population["+j+"] is:"+countryPopulation[j]);
//			}
			
			
			//enhanced for loop / for each loop
			int count=0;
			for(int elm: countryPopulation) {   //each element one by one get assigned to elm variable and will get printed
				count = count + elm;
				System.out.println(elm);
			}
			System.out.println("total count is: "+ count);
	}
}

