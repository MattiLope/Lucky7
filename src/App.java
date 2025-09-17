import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        Random r = new Random();

        System.out.println("Syötä rahamäärä: ");
        String input = in.nextLine();
        int money = Integer.parseInt(input.trim());
        
        System.out.println("Aloitusraha: " + money);

        
        while (money > 0) {
            
            System.out.println( "Rahaa jäljellä: " + money);
            int n1 = r.nextInt(10)+1;
            int n2 = r.nextInt(10)+1;
            int n3 = r.nextInt(10)+1;

            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            
            if (n1 == 7 && n2 == 7 && n3 == 7) {
                money += 7;
                System.out.println("Voitit 7");
            }else if(n1 == 7 && n2 == 7 && n3 != 7 ||
                     n1 == 7 && n3 == 7 && n2 != 7 ||
                     n2 == 7 && n3 == 7 && n1 != 7) {

                        money += 5;
                        System.out.println("Voitit 5 euroa");
                     }else if(n1 == 7 || n2 == 7 || n3 == 7) {
                        money += 3;
                        System.out.println("Voitit 3 euroa");
                     }else {
                        System.out.println("Hävisit");
                     }  
                     money--;           
        }
    }
}
