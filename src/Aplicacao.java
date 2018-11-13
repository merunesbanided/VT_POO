import java.util.Scanner;
public class Aplicacao 
{
    public static void main (String args[])
    {
        Scanner read = new Scanner(System.in);
        Cliente c1 = new Cliente();
        int opcao = 0;
        String login;
        String senha;
        
        System.out.println("Email: ");
        login = read.nextLine();
        System.out.println("Senha: ");
        senha = read.nextLine();
        
        
       if (c1.autenticar(login, senha)== true)
        {    
            do
            {
                System.out.println("\n                ===================================================");
                System.out.println("                |     1 - Cadastrar produtos                        |");
                System.out.println("                |     2 - Mostrar todos os produtos cadastrados     |");
                System.out.println("                |     3 - Consultar produtos por faixa de preço     |");
                System.out.println("                |     4 - Efetuar comprad e produtos                |");
                System.out.println("                |     0 - Sair                                      |");
                System.out.println("                  ===================================================\n");
                opcao = read.nextInt();
                switch (opcao)
                {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }    
            while (opcao != 0);
        }    
        else 
        {
            System.out.println("Login Invalido!!");
        }
            
        }

    }   
