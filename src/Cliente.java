import java.util.Scanner;
public class Cliente 
{
    Scanner read = new Scanner(System.in);
    String cpf;
    String nome;
    String sobrenome;
    String endereco;
    int telefone;
    String email;
    String senha;
    float renda;

    public Cliente() 
    {
        System.out.println("Informe seu nome: ");
        this.nome = read.nextLine().toUpperCase();
        System.out.println("Informe seu sobrenome: ");
        this.sobrenome = read.nextLine().toUpperCase();
        System.out.println("Informe seu endereço: "); 
        this.endereco = read.nextLine();
        System.out.println("Informe seu  telefone: ");
        this.telefone = read.nextInt();
        read.nextLine();
        System.out.println("Informe seu email: ");
        this.email = read.nextLine().toUpperCase();
        while (this.validaEmail(this.email) == false)
        {
            System.out.println("Por favor insira um email valido: ");
            this.email = read.nextLine().toUpperCase();
        }
        System.out.println("Informe sua senha: ");
        this.senha = read.nextLine();
        while (this.validaSenha(this.senha)== false)
        {
            System.out.println("Por favor digite uma senha com 6 digitos ou mais: ");
            this.senha = read.nextLine();
        }            
        System.out.println("Informe sua renda: ");
        this.renda = read.nextFloat();
    }
    
    boolean validaSenha(String s)
    {
        if (s.length() <6 )
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
    
    boolean validaEmail(String s)
    {
        if (s.contains("@")& s.endsWith(".COM") | s.endsWith(".BR"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean autenticar(String login, String senha)
    {
        if (login.toUpperCase().equals(this.email) & senha.equals(this.senha))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    void exibir(boolean valido)
    {
        valido = this.autenticar(nome, senha);
        if (valido == true)
        {
            System.out.println("Bem vindo Sr."+this.nome+" "+this.sobrenome);
        }
        else
        {
            System.out.println("Login Invalido");
        }
    }
        
    
}