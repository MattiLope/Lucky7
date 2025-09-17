import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random r = new Random();
        Random q = new Random();
        Random p = new Random();

        int n1 = r.nextInt(10)+1;
        int n2 = q.nextInt(10)+1;
        int n3 = p.nextInt(10)+1;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        if (n1 == 7 || n2 == 7 || n3 == 7) {
            System.out.println("Voitit!");
        }else {
            System.out.println("Hävisit!");
        }
    }
}
