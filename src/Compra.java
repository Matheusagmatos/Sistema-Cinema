import java.util.ArrayList;
import java.util.Scanner;

public class Compra {

    static Scanner input = new Scanner(System.in);

    ArrayList<Compra> listaCompras = new ArrayList<>();

    Cliente cliente;
    int quantIngressos;
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
      System.out.println("( 5 ) - Remover Filme");
       novaCompra.quantIngressos = input.nextInt();
      
      Filme.filmesEmCartaz();
      System.out.println("CODÍGO DO FILME:");
       novaCompra.filme.codigo = input.nextInt();
  
      novaCompra.poltrona = Poltrona.selecionarPoltrona();
      
      novaCompra.valorTotalCompra = Ingresso.getPreco() * novaCompra.quantIngressos;     

      System.out.println("CONFIRMAR COMPRA ? 1-SIM / 2-NÃO");
       int option = input.nextInt();
      if(option == 1){
        System.out.println("Compra Realizada com Sucesso !");
      }
       
    }

    public static void cancelarCompra(){

    }

    public static void infosCompra(){

    }


    
}
