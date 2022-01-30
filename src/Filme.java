import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Filme {


    static ArrayList<Filme> listaFilmes = new ArrayList<>();
    static Random aleatory = new Random();

    String titulo;
    String genero;
    String duracao;
    int codigo;

    static Scanner input = new Scanner(System.in);


    public static void adicionarFilme(String[] args){
      boolean continuarAdicionandoFilmes = false;
      do{
        Filme novoFilme = new Filme();
         
         input.nextLine();
        System.out.println("TÍTULO: ");
         novoFilme.titulo = input.nextLine();
        System.out.println("GÊNERO: ");
         novoFilme.genero = input.nextLine();
        System.out.println("DURAÇÃO");
         novoFilme.duracao = input.nextLine();
        
         int codGerado;
         boolean codExiste = false;
         
        do{
        
         codGerado = aleatory.nextInt(100000);
         for(int i = 0; i < listaFilmes.size(); i++){
            if (listaFilmes.get(i).codigo == codGerado){
               codExiste = true;
            }
         }

        }while(codExiste = true);

        novoFilme.codigo = codGerado;


        listaFilmes.add(novoFilme);


        System.err.println(">> Filme adicionado com sucesso!");

        System.out.println("----------------------------");
        System.out.println("TÍTULO: " + novoFilme.titulo);
        System.out.println("GÊNERO: " + novoFilme.genero);
        System.out.println("DURAÇÃO: " + novoFilme.duracao);
        System.out.println("----------------------------");

        Menu.main(args);

        System.out.println("Adiconar mais filmes ? 1-sim, 2-não");
         int option = input.nextInt();
          if(option == 1){
            continuarAdicionandoFilmes = true;
          }else{
            continuarAdicionandoFilmes = true;
          }

      }while(continuarAdicionandoFilmes = true);

      Filme.filmesEmCartaz(args);
        
    }


    public static void pesquisarFilme(String[] args){
       System.out.println("CÓDIGO DO FILME:");
       int codDigitado = input.nextInt();

       for(int i = 0; i <= listaFilmes.size(); i++){
         if(codDigitado == listaFilmes.get(i).codigo){
            System.out.println("----------------------------");
            System.out.println("TÍTULO: " + listaFilmes.get(i).titulo);
            System.out.println("GÊNERO: " + listaFilmes.get(i).genero);
            System.out.println("DURAÇÃO: " + listaFilmes.get(i).duracao);
            System.out.println("----------------------------");
         }
       }

    }

 


    public static void removerFilme(String[] args){
        System.out.println("CÓDIGO DO FILME:");
        int codDigitado = input.nextInt();
 
        for(int i = 0; i <= listaFilmes.size(); i++){
          if(codDigitado == listaFilmes.get(i).codigo){
             listaFilmes.remove(i);
             System.out.println("Filme removido com sucesso!");
             break;
          }
        }
    }



    public static void filmesEmCartaz(String[] args){
      
      for(int i = 0; i <= listaFilmes.size(); i++){
          System.out.print("-----------------------\nTÍTULO: " + listaFilmes.get(i).titulo + "\n GÊNERO: " + listaFilmes.get(i).genero + "\n DURAÇÃO: " + listaFilmes.get(i).duracao + "\n-----------------------");
      }

      System.out.println();

    }
    
    
}
