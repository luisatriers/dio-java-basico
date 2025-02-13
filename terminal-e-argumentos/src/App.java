public class App {
    public static void main(String[] args) {

        String nome = args [0];
        int idade = Integer.valueOf(args [1]);
        double altura = Double.valueOf(args [2]);

        System.out.println("Oi, meu nome é" + nome + ", tenho "+ idade +" anos e "+ altura+" cm de altura");
    }
}
