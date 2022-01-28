public class Assento {


     static private int linhas = 5;
     static private int colunas = 10;
    
     static char[][] poltronas = new char[linhas][colunas];

     static private int cont = 0;


     public static void organizarAssentos(){
       for(int l = 0; l <= linhas; l++){
          for(int c = 0; c <= colunas; c++){
            poltronas[l][c] = (char)cont++;
          }
       }
     } 

     public static String selecionarPoltrona(){
       Assento.exibirPoltronas();
     }

     
     public static void exibirPoltronas(){
        for(int l = 0; l <= linhas; l ++){
          for(int c = 0; c <= colunas; c ++){
            System.out.println("["+poltronas[l][c]+"]");
          }
          System.out.println();
        }
     }

 }

