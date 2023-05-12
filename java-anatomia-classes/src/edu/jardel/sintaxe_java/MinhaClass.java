package edu.jardel.sintaxe_java;
public class MinhaClass {
    public static void main (String [] args){
        String primeiroNome = "Jardel";
        String segundoNome = "Dias";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeroNome,String segundoNome){
        return "Resultado do método " + primeroNome.concat(" ").concat(segundoNome);
    }
}
