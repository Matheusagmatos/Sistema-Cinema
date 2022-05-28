import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Compra {

    static Scanner input = new Scanner(System.in);
    static Random aleatory = new Random();

    static ArrayList<Compra> listaCompras = new ArrayList<>();

    private Cliente cliente;
    private int quantIngressos;
    private Filme filme;
    private int[] poltrona = new int[3];
    private int codigoCompra;
    private double valorTotalCompra;

    /**
   * Método para efetuar compra.
   * <p>
   * Coleta informações sobre o cliente, filme escolhido, poltrona e finaliza a compra.
   */
    public static void novaCompra(){

      Compra novaCompra = new Compra(); 

      System.out.println("NOME DO CLIENTE:");
       novaCompra.cliente.nome = input.nextLine();
      System.out.println("CPF:");
       novaCompra.cliente.cpf = input.nextLong();
      System.out.println("QUANTIDADE DE INGRESSOS:");
       novaCompra.quantIngressos = input.nextInt();
      
      Filme.filmesEmCartaz();
      System.out.println("CÓDIGO DO FILME:");
       novaCompra.filme.codigo = input.nextInt();
      
        for(int i = 0; i < novaCompra.quantIngressos; i++){
         System.out.println("SELECIONE A POLTRONA " + i+1);
         novaCompra.poltrona[i] = Poltrona.selecionarPoltrona();
        }
      
      novaCompra.valorTotalCompra = Ingresso.getPreco() * novaCompra.quantIngressos;  
      
      boolean codigoCompraJaExiste = false;
      do{
        novaCompra.codigoCompra = aleatory.nextInt(1000000);
        for (int i = 0; i < listaCompras.size(); i++) {
          if(listaCompras.get(i).codigoCompra == novaCompra.codigoCompra){
            codigoCompraJaExiste = true;
          }
        }
      }while(codigoCompraJaExiste == true);

      System.out.println("CONFIRMAR COMPRA ? 1-SIM / 2-NÃO");
       int option = input.nextInt();
      if(option == 1){
        Compra.listaCompras.add(novaCompra);
        System.out.println("Compra Realizada com Sucesso !");
        Compra.infosCompra(novaCompra.codigoCompra);
      }else{
        System.exit(0);
      }
       
    }

    public static void cancelarCompra(int codigoCompra, String[] args){
     for (Compra compra : listaCompras) {
       if(compra.codigoCompra == codigoCompra){
        Compra.infosCompra(codigoCompra);
         System.out.println("DESEJA REALMENTE CANCELAR ESTA COMPRA ? SIM-1, NÃO-2");
          int option = input.nextInt();
          if(option == 1){
            listaCompras.remove(compra);
            System.out.println("--------------------------------"); 
            System.out.println("Compra cancelada com sucesso!");
            System.out.println("O cliente " + compra.cliente.nome + " receberá um reembolso \n no valor total de R$" + compra.valorTotalCompra + " em até 07 dias úteis.");
            System.out.println("--------------------------------"); 
            Menu.main(args);
          }else{
            Menu.main(args);
          }
       }
     }
    }


    public static void infosCompra(int codigoCompra, String[] args){
      System.out.println("--------------------------------"); 
      for (Compra compra : listaCompras) {
        System.out.println("CLIENTE: " + compra.cliente.nome);
        System.out.println("CPF: " + compra.cliente.cpf);
        System.out.println("FILME: " + compra.filme.titulo);
        System.out.println("INGRESSOS: " + compra.quantIngressos);
        System.out.println("VALOR TOTAL: " + compra.valorTotalCompra);
        for (int i = 0; i < compra.poltrona.length; i++) {
          System.out.print("POLTRONA(S): " + "["+compra.poltrona[i]+"] ");
        }
      }
      System.out.println("--------------------------------"); 

      Menu.main(args);
    }


    
}
