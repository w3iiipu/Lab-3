import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double inputNum = 0;
        double numSquare = 0.0;
        double numCubed  = 0.0;
        Scanner scan1 = new Scanner(System.in);
        String userContinueChoice = "yes";

        System.out.println("Learn your squares and cubes!");

        do {System.out.println("Enter an integer:");
            inputNum = scan1.nextDouble();
            scan1.nextLine();
            System.out.printf("%-8s %-8s %-8s \n", "Number", "Squared",  "Cubed");
            System.out.printf("%-8s %-8s %-8s \n" , "======", "=======",  "=====");

            for(int i = 1; i <= inputNum; i++) {
                numSquare = Math.pow(i, 2);
                numCubed = Math.pow(i, 3);
                System.out.printf("%-8d %-8.0f %-8.0f \n", i, numSquare, numCubed);
            }
            System.out.println("Do you want to continue?");
            userContinueChoice = scan1.next();
        } while (userContinueChoice.equalsIgnoreCase("yes"));
    }
}