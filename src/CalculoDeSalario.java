import java.util.Scanner;


public class CalculoDeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto é o valor da  sua hora trabalhada: ");
        double valorHora = sc.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasTrabalhadas = sc.nextDouble();
        double salario = valorHora * horasTrabalhadas;
        System.out.println("Seu salário é: " + salario);
        sc.close();
    }
    
}
