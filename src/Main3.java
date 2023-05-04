
import java.util.Scanner;

public class Main3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        
        do {
            System.out.print("Inserisci una stringa (q per uscire): ");
            str = input.nextLine();
            
            if (!str.equals(":q")) {
                String[] chars = str.split("");
                for (int i = 0; i < chars.length; i++) {
                    System.out.print(chars[i] + ",");
                }
                System.out.println();
            }
            
        } while (!str.equals("q"));
        
        System.out.println("Programma terminato.");
    }
}

