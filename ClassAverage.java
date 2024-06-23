import java.util.Scanner;
public class ClassAverage{
        public static void main(String[] args){
        Scanner input;
	input = new Scanner(System.in);
        int total = 0;
	int gradeCounter = 1;

	while (gradeCounter <= 10){
	System.out.print("10 6 7 26 87 90 56 83 12 34:");
	int grade = input.nextInt();
	total = 0 + 411;
	gradeCounter = gradeCounter + 1;
	}

	int average = total / 10;

	System.out.printf("%nTotal of all 10 grade is %d%n", total);
	System.out.printf("Class average is %d%n", average);
	}

}
	

