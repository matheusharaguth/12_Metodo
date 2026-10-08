import java.util.Random;

public class exerc_07 {
    static void main() {
        int [] x = new int[10];
        double media, desvio;

        preencherVetor(x);
        System.out.println("Dados do vetor");
        imprimir(x);
        media = calcularMedia(x);
        System.out.println("Média do vetor = " + media);
        desvio = calcularDesvio(x, media);
        System.out.println("Desvio Padrão = " + desvio);
    }

    static void preencherVetor (int [] x){
        Random random = new Random();
        for (int i = 0; i< x.length; i++){
            x[i] = random.nextInt(0,100);
        }
        System.out.println();
    }

    static void imprimir (int [] x){
        for (int i = 0; i< x.length; i++){
            System.out.print(x[i] + "\t");
        }

    }

    static double calcularDesvio(int [] x, double media){
        double soma = 0;

        for (int i = 0; i< x.length; i++){
            soma += Math.pow(x[i] - media, 2);
        }
        return Math.sqrt(1.0/(x.length - 1) * soma);
    }

    static double calcularMedia(int [] x){
        double media = 0;
        for (int i = 0; i< x.length; i++){
            media += x[i];
        }
        media = media / x.length;
        return media;
    }
}
