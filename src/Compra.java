import java.util.ArrayList;
import java.util.Scanner;

public class Compra {

    static Scanner input = new Scanner(System.in);

    ArrayList<Compra> listaCompras = new ArrayList<>();

    Cliente cliente;
    double precoIngresso;
    Filme filme;
    int poltrona;
    int codigoCompra;
    double valorTotalCompra;

    
    public static void novaCompra(){

      Compra novaCompra = new Compra(); 

      System.out.println("NOME DO CLIENTE:");
       novaCompra.cliente.nome = input.nextLine();
      System.out.println("CPF:");
       novaCompra.cliente.cpf = input.nextLong();
      
      Filme.filmesEmCartaz();
      System.out.println("CODÍGO DO FILME:");
       novaCompra.filme.codigo = input.nextInt();
  
      novaCompra.poltrona = Poltrona.selecionarPoltrona();
      
      novaCompra.precoIngresso = Ingresso.getPreco();
  
      
       
    }

    public static void cancelarCompra(){

    }

    public static void infosCompra(){

    }


    
}
