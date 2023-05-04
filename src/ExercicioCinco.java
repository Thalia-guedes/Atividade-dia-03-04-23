import java.util.Scanner;

public class ExercicioCinco {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite um numero de 1 a 7 ");
        int numero = scanner.nextInt();

        String resultado1 = diasDasemana(numero);
        System.out.println(resultado1);
    }
    public static String diasDasemana (int numero) {
        String segunda = "Segunda Feira";
        String terca = "Terca Feira";
        String quarta = "Quarta Feira";
        String quinta = "Quinta Feira";
        String sexta = "Sexta Feira";
        String sabado = "Sabado";
        String domingo = "Domingo";

        switch (numero){
            case 1:
                return segunda;
            case 2:
                return terca;
            case 3:
                return quarta;
            case 4:
                return quinta;
            case 5:
                return sexta;
            case 6:
                return sabado;
            case 7:
                return domingo;
        }
        return null;
    }
}
