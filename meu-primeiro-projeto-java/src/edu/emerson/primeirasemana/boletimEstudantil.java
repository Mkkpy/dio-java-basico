package edu.emerson.primeirasemana;

public class boletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        if (mediaFinal<6)
            System.out.println("Reprovado");
        else if (mediaFinal==6)
            System.out.println("RECUPERACAO");
        else
            System.out.println("APROVADO");
    }
}
