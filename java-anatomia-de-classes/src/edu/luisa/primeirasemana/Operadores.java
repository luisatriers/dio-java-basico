package edu.luisa.primeirasemana;

public class Operadores {
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        //Comparar objetos utiliza-se o método equals()
        //Exemplo:

        String nomeUm = "Luisa";
        String nomeDois = new String("Triers");
        System.out.println(nomeUm.equals(nomeDois));


    }

}
