import java.util.Scanner;

public abstract class Administrador {

    static Scanner input = new Scanner(System.in);

    static private String user = "Administrador Geral";
    static private int senha;

    public static boolean acessoAdministrador(){
      System.out.println(">> ACESSO DE ADMINISTRADOR NECESSÁRIO");
      System.out.println(Administrador.user);
      System.out.println("Digite sua senha:");
       int senhaDigitada = input.nextInt();
       if(senhaDigitada == senha){
         System.out.println("Acesso permitido!");
         return true;
       }else{
         System.err.println(">> Senha incorreta! Acesso negado.");  
       }
       return false;
    }

    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return user;
    }

    
    
}
