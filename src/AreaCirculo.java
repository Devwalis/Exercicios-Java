import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a área do circulo: ");
        double area = sc.nextDouble();

        final double pi = 3.14;
        double raio = Math.sqrt(area / pi);
        System.out.printf("O raio do circulo é %.2f%n", raio);
sc.close();


}
}