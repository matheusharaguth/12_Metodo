import java.util.Scanner;

public class exer_01 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Informe um numero positivo inteiro: ");
        valor = sc.nextInt();

        if (valor > 0){
            System.out.println("O valor é valido");
            imprimir(valor); //Argumento
        }
        else {
            System.out.println("O valor não é valido. numero deve ser inteiro e positivo");
        }
    }
    static void imprimir(int valor){
        for (int i = 1; i <= valor;i++ ){
            if (valor % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
