import java.util.Scanner;
public class MostrarNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();

        System.out.printf("O número que vc digitou foi: %d", numero);
    }
    
}
