package edu.emerson.primeirasemana;

public class MinhaClasse {

public static void main(String[] args) {
    
   String primeiroNome = "Emerson";
   String segundoNome = "Lima";

   String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
   System.out.print (nomeCompleto);


}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);

}

}