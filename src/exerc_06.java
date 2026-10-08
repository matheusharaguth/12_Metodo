import java.util.Random;

public class exerc_06 {
    static void main() {
        int [][] x = new int[4][4];
        int [] maior;

        lerDados(x);
        System.out.println("Matriz");
        imprimir(x);
        maior = maiorValor(x);
        System.out.println("Maior valor de cada linha");
        imprimirMaiorValor(maior);

    }

    static void imprimirMaiorValor(int [] maior){
        for (int i = 0; i< maior.length; i++){
            System.out.print(maior[i] + "  ");
        }
    }

    static int[] maiorValor(int [][] x){
        int[] maior = new int[x.length];
        for (int i = 0; i< x.length; i++){
            for (int j = 0; j< x.length; j++){
                if(x[i][j] > maior[i]){
                    maior[i] = x[i][j];
                }
            }
        }
        return maior;
    }

    static void lerDados(int [][] x){
        Random random = new Random();
        for (int i = 0; i< x.length; i++){
            for (int j = 0; j< x.length; j++){
                x[i][j] = random.nextInt(0,100);

            }
        }
    }

    static void imprimir(int [][] x){
        for (int i = 0; i< x.length; i++){
            for (int j = 0; j< x.length; j++){
                System.out.print(x[i][j] + "\t");

            }
            System.out.println();
        }

    }
}
