
/**
 * 
 * @author timothyroejr
 * @version 6/15/15
 */

public class GradesV2 {
	public static void main(String[] args) {
		//local variables
		int numTests = 0;
		int testGrade = 0;
		int totalPoints = 0;
		double average;
		
		//1
		numTests++;
		testGrade = 97;
		totalPoints += testGrade;
		average = (double)totalPoints/(double)numTests;
		System.out.print("n = " + numTests);
		System.out.print("  Test Grade for Test #"+numTests+": " + testGrade);
		System.out.print("  Total Points: " + totalPoints);
		System.out.println("  Average Score: " + average);
		
		//2
		numTests++;
		testGrade = 79;
		totalPoints += testGrade;
		average = (double)totalPoints/(double)numTests;
		System.out.print("n = " + numTests);
		System.out.print("  Test Grade for Test #"+numTests+": " + testGrade);
		System.out.print("  Total Points: " + totalPoints);
		System.out.println("  Average Score: " + average);
		
		//3
		numTests++;
		testGrade = 83;
		totalPoints += testGrade;
		average = (double)totalPoints/(double)numTests;
		System.out.print("n = " + numTests);
		System.out.print("  Test Grade for Test #"+numTests+": " + testGrade);
		System.out.print("  Total Points: " + totalPoints);
		System.out.println("  Average Score: " + average);
		
		//4
		numTests++;
		testGrade = 88;
		totalPoints += testGrade;
		average = (double)totalPoints/(double)numTests;
		System.out.print("n = " + numTests);
		System.out.print("  Test Grade for Test #"+numTests+": " + testGrade);
		System.out.print("  Total Points: " + totalPoints);
		System.out.println("  Average Score: " + average);
	}
}
