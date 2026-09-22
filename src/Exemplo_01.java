public class Exemplo_01 {
    static void main() {
        int x = 3, y = 5; // variavel local
        int resultado;
        resultado = somar(x, y);
        System.out.println(resultado);
    }

    static int somar(int x, int y){
        int resultado = x + y;
        return resultado;
    }

}
