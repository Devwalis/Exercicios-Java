import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        sc.close();
        int soma = num1 + num2;

        System.out.printf("A soma dos dois números é %d", soma);
    
}}
