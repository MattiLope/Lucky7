import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        Random r = new Random();

        System.out.println("Enter sum: ");
        String input = in.nextLine();
        int money = Integer.parseInt(input.trim());
        
        while (money > 0) {
            
            int n1 = r.nextInt(10)+1;
            int n2 = r.nextInt(10)+1;
            int n3 = r.nextInt(10)+1;

            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            
            if (n1 == 7 && n2 == 7 && n3 == 7) {
                money += 7;
                System.out.println("You won 7 euros");
            }else if(n1 == 7 && n2 == 7 && n3 != 7 ||
                     n1 == 7 && n3 == 7 && n2 != 7 ||
                     n2 == 7 && n3 == 7 && n1 != 7) {

                        money += 5;
                        System.out.println("You won 5 euros");
                     }else if(n1 == 7 || n2 == 7 || n3 == 7) {
                        money += 3;
                        System.out.println("You won 3 euros");
                     }else {
                        System.out.println("You lost");
                     }  
                     money--;  
                     System.out.println( "Money remaining: " + money);
                  
                    if (money <= 0) {
                        System.out.println("Out of money. Game over.");
                        break;
            }
                    System.out.println("Play again? (Enter = yes, e = no): ");
                    String again = in.nextLine().toLowerCase();

                    if (again.equals("e")) {
                        System.out.println("Game ended.");
                        break;
            }
        }
    } 
   
}
