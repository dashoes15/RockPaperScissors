import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice1;
        String choice2;
        String YN;
        boolean done = false;
        do {
            System.out.println("Enter r for rock p for paper and s for scissors ( player 1):");
            choice1 = scan.nextLine();
            choice1 = choice1.toUpperCase();
            System.out.println("Enter r for rock p for paper and s for scissors (player2):");
            choice2 = scan.nextLine();
            choice2 = choice2.toUpperCase();
            switch(choice1){
                case "R":
                    switch(choice2){
                        case "R":
                            System.out.println("It's a tie.");
                            System.out.println("Would you like to proceed? (Y/N)");
                            YN = scan.nextLine();
                            if (YN.equals("Y")) {

                            }else if (YN.equals("N")){
                                done = true;
                            }else{
                                System.out.println("Invalid input, running code again.");
                            }
                            break;
                        case "P":
                            System.out.println("Player 2 wins!");
                            System.out.println("Would you like to proceed? (Y/N)");
                            YN = scan.nextLine();
                            if (YN.equals("Y")) {

                            }else if (YN.equals("N")){
                                done = true;
                            }else{
                                System.out.println("Invalid input, running code again.");
                            }
                            break;
                        case "S":
                            System.out.println("Player 1 wins!");
                            System.out.println("Would you like to proceed? (Y/N)");
                            YN = scan.nextLine();
                            if (YN.equals("Y")) {

                            }else if (YN.equals("N")){
                                done = true;
                            }else{
                                System.out.println("Invalid input, running code again.");
                            }
                            break;
                        default:
                            System.out.println("Invalid selection made: ");
                            break;
                    }
                    break;
                case "P":
                    switch(choice2){
                        case "R":
                            System.out.println("Player 1 wins!");
                            System.out.println("Would you like to proceed? (Y/N)");
                            YN = scan.nextLine();
                            if (YN.equals("Y")) {

                            }else if (YN.equals("N")){
                                done = true;
                            }else{
                                System.out.println("Invalid input, running code again.");
                            }
                            break;
                        case "P":
                            System.out.println("It's a tie!");
                            System.out.println("Would you like to proceed? (Y/N)");
                            YN = scan.nextLine();
                            if (YN.equals("Y")) {

                            }else if (YN.equals("N")){
                                done = true;
                            }else{
                                System.out.println("Invalid input, running code again.");
                            }
                            break;
                        case "S":
                            System.out.println("Player 2 wins!");
                            System.out.println("Would you like to proceed? (Y/N)");
                            YN = scan.nextLine();
                            if (YN.equals("Y")) {

                            }else if (YN.equals("N")){
                                done = true;
                            }else{
                                System.out.println("Invalid input, running code again.");
                            }
                            break;
                        default:
                            System.out.println("Invalid selection made: ");
                            break;
                    }
                    break;
                case "S":
                    switch(choice2){
                        case "R":
                            System.out.println("Player 2 wins!");
                            System.out.println("Would you like to proceed? (Y/N)");
                            YN = scan.nextLine();
                            if (YN.equals("Y")) {

                            }else if (YN.equals("N")){
                                done = true;
                            }else{
                                System.out.println("Invalid input, running code again.");
                            }
                            break;
                        case "P":
                            System.out.println("Player 1 wins!");
                            System.out.println("Would you like to proceed? (Y/N)");
                            YN = scan.nextLine();
                            if (YN.equals("Y")) {

                            }else if (YN.equals("N")){
                                done = true;
                            }else{
                                System.out.println("Invalid input, running code again.");
                            }
                            break;
                        case "S":
                            System.out.println("It's a tie!");
                            System.out.println("Would you like to proceed? (Y/N)");
                            YN = scan.nextLine();
                            if (YN.equals("Y")) {

                            }else if (YN.equals("N")){
                                done = true;
                            }else{
                                System.out.println("Invalid input, running code again.");
                            }
                            break;
                        default:
                            System.out.println("Invalid selection made: ");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid selection made: ");
                    break;
            }
        } while (!done);
    }
}