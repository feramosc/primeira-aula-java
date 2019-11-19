public class Main {

    public static void main (String [] args){
        System.out.println("Hello World!");

        int numero = 25;
        System.out.println("Idade: " + numero);

        String nome = "Fernanda";
        System.out.println("Nome: " + nome);

        System.out.println("Soma: " + soma(1,1));

        int somar = soma(1,1);
        System.out.println("Variavel Somar: " + somar);
    }

    public static int soma (int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }


}
