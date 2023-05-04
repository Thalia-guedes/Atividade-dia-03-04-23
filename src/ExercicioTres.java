import java.util.Scanner;

public class ExercicioTres {

    public static boolean testaSenha (String senha){
        if (senha.length() < 10){
            return false;
        }
        int digito = 0;
        for (int i = 0; i < senha.length() ; i++ ) {
            char c = senha.charAt(i);
            if ( !Character.isLetterOrDigit(c)) {
                return false;
            }
            if ( Character.isDigit(c)){
                digito++;
            }
        }
            if (digito < 2 ) {
                return false;
            }
            return true;
        }



    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite sua senha ");
        String senha = scanner.next();
        boolean resultado1 = testaSenha(senha);
        System.out.println(resultado1);

    }

}
