import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;
        double dobroArea = area *2;

        System.out.printf("A área do quadrado é: %.2f%n",area);
        System.out.printf("O dobro desta área é: %.2f%n", dobroArea);
        sc.close();
     
    }
    
}
