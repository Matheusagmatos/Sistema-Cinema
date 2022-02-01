import java.util.Scanner;

public class Menu {

  public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("--------------------------------"); 
     System.out.println("-------- SISTEMA CINEMA --------");
     System.out.println("--------------------------------");
     System.out.println();
     System.out.println(">>> CLIENTE --------------------");
     System.out.println("( 1 ) - Nova Compra");
     System.out.println("( 2 ) - Filmes em Cartaz");
     System.out.println("( 3 ) - Informações de Compra");
     System.out.println("--------------------------------");
     System.out.println();
     System.out.println();
     System.out.println(">>> ADMINISTRADOR --------------");
     System.out.println("( 4 ) - Adicionar filme");
     System.out.println("( 5 ) - Remover Filme");
     System.out.println("( 6 ) - Alterar Preço do Ingresso");
     System.out.println("--------------------------------");

     int option = input.nextInt();
     input.close();

     switch(option){

         case 1: 
             Compra.novaCompra();

         case 2:
             Filme.filmesEmCartaz();

         case 3:
             Compra.infosCompra();

         case 4:
             Filme.adicionarFilme(args);

         case 5:
             Filme.removerFilme(args);

         case 6:
             Ingresso.alterarPreco();

     }
     
     


     
 
  }

    
}
