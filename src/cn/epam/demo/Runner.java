package cn.epam.demo;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		boolean isRepeat = true;
		
		while (isRepeat) {
		
			System.out.println("Please, enter number of menu:");
			System.out.println("1 - Addition");
			System.out.println("2 - Substraction");
			System.out.println("3 - Multiplicaiton");
			System.out.println("4 - Division");
			System.out.println("5 - Sortarray");
			System.out.println("0 - Exit");
			
			Scanner scanner = new Scanner(System.in);
			int action = scanner.nextInt();
	
			switch (action) {
			case 0:
				isRepeat = false;
				System.out.println("Completed");
				break;
	
			case 1:
				int toValueAdd1;
				int toValueAdd2;
				System.out.println("Please, enter first value: ");
				toValueAdd1 = scanner.nextInt();
				System.out.println("Please, enter second value: ");
				toValueAdd2 = scanner.nextInt();
				Calculator math1 = new Calculator(toValueAdd1, toValueAdd2);
				System.out.println("Additon = " + math1.addition(toValueAdd1,toValueAdd2));
				break;
	
			case 2:
				int toValueSub1;
				int toValueSub2;
				System.out.println("Please, enter first value: ");
				toValueSub1 = scanner.nextInt();
				System.out.println("Please, enter second value: ");
				toValueSub2 = scanner.nextInt();
				Calculator math2 = new Calculator(toValueSub1,toValueSub2);
				System.out.println("Substraction = " + math2.substraction(toValueSub1,toValueSub2));
				break;
				
			case 3:
				int toValueMul1;
				int toValueMul2;
				System.out.println("Please, enter first value: ");
				toValueMul1 = scanner.nextInt();
				System.out.println("Please, enter second value: ");
				toValueMul2 = scanner.nextInt();
				Calculator math3 = new Calculator(toValueMul1,toValueMul2);
				System.out.println("Multiplication = " + math3.multiplicaiton(toValueMul1,toValueMul2));
				break;
				
			case 4:
				int toValueDiv1;
				int toValueDiv2;
				System.out.println("Please, enter first value: ");
				toValueDiv1 = scanner.nextInt();
				System.out.println("Please, enter second value: ");
				toValueDiv2 = scanner.nextInt();
				Calculator math4 = new Calculator(toValueDiv1,toValueDiv2);
				System.out.println("Division = " + math4.division(toValueDiv1,toValueDiv2));
				break;
				
			case 5:
				String str[][] = {{"bb","a","ccc","dddd"},{"ccc","bb","a","dddd"},{"dddd","a","ccc","bb"}};
				System.out.println("Print orginal matrix: ");
				Matrix mat = new Matrix();
				mat.printmatirx(str);
				System.out.println("Please sorted matrix: ");
				mat.sortarray(str);
				mat.printmatirx(str);
				break; 
							
	
			default:
				System.out.println("Incorrect value! Please, try again.");
				break;
			}
		}
	}

}
