
public class IfStatement {
	public static void main(String[] args) {
		int score=66;
		char grade;
		if(score>=90) {
			grade='O';
		}else if(score>=80) {
			grade ='A';
		}else if(score>=70) {
			grade='B';
		}else if(score>=60) {
			grade='C';
		}else if(score>=50) {
			grade='D';
		}else if(score>=40) {
			grade='P';
		}else {
			grade='F';
		}
		System.out.print("Grade= "+grade);
	}
}
