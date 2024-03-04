package task2;
import java.util.Scanner;

public class StudentGradeCalculator {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects : ");
		int numSubjects = sc.nextInt();
		
		if(numSubjects <= 0) {
			System.out.println("Please enter valid no. of subjects.");
			return;
		}
		int totalMarks = 0;
		int maxMarksPerSubject = 100;
		
		for(int i = 1; i <= numSubjects; i++) {
			System.out.println("Enter marks obtained in subject " + i + "(Out of 100):");
			int marks = sc.nextInt();
			
			if(marks < 0 || marks > maxMarksPerSubject){
				System.out.println("Marks should be in between 1 to 100. Please enter valid marks.");

			}
			else {
				totalMarks += marks;
			}
		}
		double averagePercentage = (double) totalMarks/(numSubjects * maxMarksPerSubject) * 100;
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average percentage: " + averagePercentage + "%");
		
		String grade;
		
		if(averagePercentage >= 90) {
			grade = "A+";
		}
		else if(averagePercentage >= 80) {
			grade = "A";
		}
		else if(averagePercentage >= 70) {
			grade = "B";
		}
		else if(averagePercentage >= 60) {
			grade = "C";
		}
		else if(averagePercentage >= 50) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println("Grade: " + grade);
		sc.close();
	}
}
