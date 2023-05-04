
public class Main1 {
    
    public static boolean stringaPariDispari(String str) {
        if(str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean annoBisestile(int anno) {
        if(anno % 4 == 0) {
            if(anno % 100 == 0) {
                if(anno % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        String s1 = "ciao";
        String s2 = "hello";
        int anno1 = 2020;
        int anno2 = 2021;
        
        System.out.println("La stringa " + s1 + " ha un numero " + (stringaPariDispari(s1) ? "pari" : "dispari") + " di caratteri.");
        System.out.println("La stringa " + s2 + " ha un numero " + (stringaPariDispari(s2) ? "pari" : "dispari") + " di caratteri.");
        System.out.println("L'anno " + anno1 + " è " + (annoBisestile(anno1) ? "bisestile" : "non bisestile"));
        System.out.println("L'anno " + anno2 + " è " + (annoBisestile(anno2) ? "bisestile" : "non bisestile"));
    }
}


