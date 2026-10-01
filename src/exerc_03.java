import java.util.Scanner;

public class exerc_03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int v1, v2, v3;
        int maior;
        System.out.print("Digite três valores inteiros: ");
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();
        maior_valor(v1, v2, v3);
        maior = maior_valor(v1, v2, v3);
        System.out.print("O maior valor é: " + maior);
    }
    static int maior_valor(int v1, int v2, int v3){
        int maior;
        if (v1> v2 && v1>v3) {
            maior = v1;
        }
        else if (v2> v3 && v2>v1) {
            maior = v2;
        }
        else {
            maior = v3;
        }
        return maior;
    }
}
