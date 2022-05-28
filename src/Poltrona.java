import java.util.Scanner;

public abstract class Poltrona {


     static private int linhas = 5;
     static private int colunas = 10;
    
     static char[][] poltronas = new char[linhas][colunas];

     static private int cont = 0;

     static Scanner input = new Scanner(System.in);


     public static void organizarAssentos(){
       for(int l = 0; l <= linhas; l++){
          for(int c = 0; c <= colunas; c++){
            poltronas[l][c] = (char)cont++;
          }
       }
     } 

     
     public static int selecionarPoltrona(){
      boolean poltronaEscolhida = false;
      int numeroPoltrona = 0;
      
      do{

       Poltrona.exibirPoltronas();
       System.out.println("Selecione a poltrona:");
        int poltronaDigitada = input.nextInt();
        if(poltronaDigitada >= 1 && poltronaDigitada <= (linhas * colunas)){
          for(int l = 0; l <= linhas; l++){
            for(int c = 0; c <= colunas; c++){
              if(poltronas[l][c] == poltronaDigitada){
                poltronaEscolhida = true;
                numeroPoltrona = poltronas[l][c];
                System.out.println("Poltrona selecionada com sucesso!");
                poltronas[l][c] = 'X';
                break;
              }
            }
          }
        }

        if(poltronaEscolhida == false){
          System.out.println(">> Poltrona Indisponível! Selecione outra.");
        } 

      }while(poltronaEscolhida == false);

      return numeroPoltrona;
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

