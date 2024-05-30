package src.primeirasemana;

public class DeclararMetodos {
    public static void main(String[] args) {

        String primeiroNome = "Lucas";
        String segundoNome = "Andrade";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);//chamando o metodo nomeCompleto
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) { //método
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}