
import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero da 0 a 3: ");
        int num = input.nextInt();
        
        switch(num) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore: il numero inserito non è compreso tra 0 e 3.");
                break;
        }
    }
}
