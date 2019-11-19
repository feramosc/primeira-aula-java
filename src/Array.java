import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main (String [] arg){
        List<String> nomesCompletos = new ArrayList<>();
        String primeiroNome = "Fernanda";
        String segundoNome = "Ramos";
        String terceiroNome = "Costa";
        nomesCompletos.add(primeiroNome);
        nomesCompletos.add(segundoNome);
        nomesCompletos.add(terceiroNome);

        System.out.println(nomesCompletos);

        for (int i=0; i < nomesCompletos.size(); i++){
            System.out.println(nomesCompletos.get(i));
        }
    }
}