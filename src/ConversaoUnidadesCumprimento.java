import java.util.Scanner;

public class ConversaoUnidadesCumprimento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho do metro: ");
        double metro = entrada.nextDouble();

        double centimentro = metro * 100;

        System.out.printf("%.2f metros é igual a %.2f centrimentros.", metro, centimentro);

        entrada.close();


        

    }


    
}
