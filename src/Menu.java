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
     System.out.println("( 7 ) - Cancelar Compra");
     System.out.println("--------------------------------");

     int option = input.nextInt();
     int codigoDigitado;
     input.close();

     switch(option){

         case 1: 
             Compra.novaCompra();

         case 2:
             Filme.filmesEmCartaz();

         case 3:
             System.out.println("DIGITE O CÓDIGO DA COMPRA:");
             codigoDigitado = input.nextInt();
             Compra.infosCompra(codigoDigitado, args);
             break;

         case 4:
             if(Administrador.acessoAdministrador() == true){
                Filme.adicionarFilme(args);
             }else{
                Menu.main(args);
             }
             break;

         case 5:
             if(Administrador.acessoAdministrador() == true){
                Filme.removerFilme(args);
             }else{
                Menu.main(args);
             }
             break;

         case 6:
             if(Administrador.acessoAdministrador() == true){
                Ingresso.alterarPreco();
             }else{
                Menu.main(args);
             }
             break;
         
         case 7:
             if(Administrador.acessoAdministrador() == true){
                System.out.println("DIGITE O CÓDIGO DA COMPRA:");
                codigoDigitado = input.nextInt();
                Compra.cancelarCompra(codigoDigitado, args);
             }else{
                Menu.main(args);
             }
             break;

     }
     
     


     
 
  }

    
}
