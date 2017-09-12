package pkgMain;
import java.util.Scanner;
public class PRMain {
	public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);
	System.out.println("Please enter Comp");
	double Comp = Keyboard.nextDouble();
	System.out.println("Please enter Att");
	int Att = Keyboard.nextInt();
	System.out.println("Please enter TD");
	int TD = Keyboard.nextInt();
	System.out.println("Please enter Yards");
	int Yards = Keyboard.nextInt();
	System.out.println("Please enter INT");
	int INT = Keyboard.nextInt();
	PR QBRating = new PR(Comp, Att, TD, Yards, INT);
	System.out.println("Your QB rating is: " + QBRating.fPR());
	}
	
}
// run the program and enter the desired values 
// Carson Wentz QB rating is 136.4375