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


    public static void adicionarFilme(){
        Filme novoFilme = new Filme();

        System.out.println("TÍTULO: ");
         novoFilme.titulo = input.nextLine();
        System.out.println("GÊNERO: ");
         novoFilme.genero = input.nextLine();
        System.out.println("DURAÇÃO");
         novoFilme.duracao = input.nextLine();
        
         boolean codExiste = false;
         int codFilme;
        do{
        
         codFilme = aleatory.nextInt(100000);
         for(int i = 0; i <= listaFilmes.size(); i++){
            if (listaFilmes.get(i).codigo == codFilme){
               codExiste = true;
            }
         }

        }while(codExiste = true);

        novoFilme.codigo = codFilme;


        listaFilmes.add(novoFilme);


        System.err.println(">> Filme adicionado com sucesso!");

        System.out.println("----------------------------");
        System.out.println("TÍTULO: " + novoFilme.titulo);
        System.out.println("GÊNERO: " + novoFilme.genero);
        System.out.println("DURAÇÃO: " + novoFilme.duracao);
        System.out.println("----------------------------");


        
    }

    public static void removerFilme(){

    }

    public static void infosFilme(){
      
      for(int i = 0; i <= listaFilmes.size(); i++){
          System.out.print("-----------------------\nTÍTULO: " + listaFilmes.get(i).titulo + "\n GÊNERO: " + listaFilmes.get(i).genero + "\n DURAÇÃO: " + listaFilmes.get(i).duracao + "\n-----------------------");
      }

      System.out.println();

    }
    
    
}