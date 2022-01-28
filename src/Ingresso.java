import java.util.Scanner;

public abstract class Ingresso {

    static double preco;

    static Scanner input = new Scanner(System.in);


    public static String alterarPreco(){
       System.out.println("DIGITE O NOVO PREÇO DO INGRESSO");
       double precoDigitado = input.nextDouble();
        preco = precoDigitado;
       return "Preço do ingresso alterado com sucesso";
    }


    public static double meiaEntrada(){
      return preco/2;
    }
    
}
