import java.util.Scanner;

public class Sentinel {

	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		int total = 0;
		double average = 0.0;
		
		
		System.out.println("Enter grade or -1 to quit");
		int grade = scanner.nextInt();
		while(grade != -1) {
			total = total + grade;
			counter = counter + 1;
			
		System.out.println("Enter grade or -1 to quit");
			 grade = scanner.nextInt();
			
		}
			average = (double)total / counter;
			System.out.printf("Total:%n%d%n%nCounter:%n%d%n%nAverage:%n%.2f",total,counter,average);
		
	}

}
