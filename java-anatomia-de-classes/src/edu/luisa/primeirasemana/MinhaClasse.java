package edu.luisa.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        
        final String BR = "Brasil"; //Constantes (com a palavra reservada final na frente do tipo) são declaradas em UPPERCASE [boas práticas]

        //caracteres que podem ser utilizados em variaveis -> $, _, letras e numeros de 0 a 9
        
        //ESTRUTURA DE VARIAVEIS

        // Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
        //Exemplo:

        String meuNome ="Luisa";
        int anoFabricacao = 2022;
        boolean verdadeira = true;

        //ESTRUTURA DE METODOS
        // TipoRetorno NomeObjetoNoInfinitivo Parametro(s)
        //Exemplo:

        // int somar (int numeroUm, int numero2);
        // String formatarCep (long cep);

        String primeiroNome = "Luisa";
        String segundoNome = "Triers";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método nomeCompleto() é: " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}

//Todo arquivo .java (código fonte) deve começar com letra MAIUSCULA, e a classe deve ser sempre o mesmo nome do arquivo.

//Toda VARIÁVEL deve ser escrita com letra minúscula e a partir daí, usar camelCase.

