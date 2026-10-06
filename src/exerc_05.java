import java.util.Random;
import java.util.Scanner;

public class exerc_05 {
    static void main() {

        int[] x = new int[10];
        gerar(x);
        System.out.println("Antes da Inversão");
        imprimir(x);
        inverter(x);
        System.out.println("Depoiss da Inversão");
        imprimir(x);

    }

    static void gerar(int[] x){
        Random random = new Random();

        for (int i = 0; i< x.length; i++){
            x[i] = random.nextInt(1,20);
        }
    }
    static void imprimir(int[] x){
        for (int i = 0; i< x.length; i++){
            System.out.print(x[i]);
            System.out.println("\t");
        }
    }
    static void inverter(int[] x){
        int aux;
        int j = x.length - 1;
        for (int i = 0; i< x.length/2; i++){
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
            j--;
        }
    }
}
