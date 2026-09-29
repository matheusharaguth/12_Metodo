import java.util.Scanner;

public class exerc_02 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double valor1, valor2, valor3;

        System.out.print("Insira três valores: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();

        if (valor1 < valor2 + valor3 && valor2 < valor1 + valor3 && valor3 < valor1 + valor2){
            classificacao(valor1, valor2, valor3);

        }
        else {
            System.out.println("Esses valores não retornam um Triângulo");
        }

    }
    static void classificacao(double valor1, double valor2, double valor3){
        if (valor1 == valor2 && valor2 == valor3){
            System.out.print("O triângulo é equilatero");
        }
        else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3){
            System.out.print("O triângulo é isoceles");
        }
        else {
            System.out.print("O triângulo é escaleno");
        }
    }
}
