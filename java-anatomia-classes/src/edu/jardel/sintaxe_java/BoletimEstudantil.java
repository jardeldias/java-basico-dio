package edu.jardel.sintaxe_java;
public class BoletimEstudantil {
 
    public static void main(String[] args) {
        double mediaFinal = 5;
        boolean aprovacao = (mediaFinal < 6);
        boolean recuperacao = (mediaFinal == 6);

        if (aprovacao == true)
            System.out.println("Reprovado");
        else if (recuperacao == false)
            System.out.println("Recuperação");
        else
            System.out.println("Aprovado");

    }
}
