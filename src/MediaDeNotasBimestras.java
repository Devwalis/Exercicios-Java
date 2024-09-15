import java.util.Scanner;

public class MediaDeNotasBimestras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira Nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda Nota: ");
        double nota2 = entrada.nextDouble();

        entrada.close();


        double soma = nota1 + nota2;
        double media = soma / 2;
        System.out.printf("A soma da média é: %.2f", media);
    }

    
}
