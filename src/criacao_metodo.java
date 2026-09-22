public class criacao_metodo {
    static void main() {
        int x = 10, y = 3;
        int resultado;
        resultado = subtracao(x, y);
        System.out.println(resultado);
    }
    static int subtracao(int x, int y){
        int resultado = x - y;
        return  resultado;
    }
}
