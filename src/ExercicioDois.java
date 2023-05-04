import java.util.Scanner;
import java.lang.String;

public class ExercicioDois {

    public static boolean verificaVogais (String palavra) {
        String vogais = "aeiouAEIOU";
        for (int i = 0; i < palavra.length() ; i++ ) {
            char c = palavra.charAt(i);
            if ( vogais.indexOf(c) == -1) {
                return false;
            }
        }
            return true;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra1 = scanner.next();
        boolean resultado1 = verificaVogais(palavra1);
        System.out.println(resultado1);

    }
}
