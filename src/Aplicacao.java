import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
public class Aplicacao 
{
    public static void main (String args[])
    {
        Scanner read = new Scanner(System.in);
        Cliente c1 = new Cliente();
        List <Produto> lista_produto = new ArrayList<Produto>();
        int opcao = 0;
        int limite_lista;
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
                System.out.println("\n                 ===================================================");
                System.out.println("                |     1 - Cadastrar produtos                        |");
                System.out.println("                |     2 - Mostrar todos os produtos cadastrados     |");
                System.out.println("                |     3 - Consultar produtos por faixa de preço     |");
                System.out.println("                |     4 - Efetuar comprad e produtos                |");
                System.out.println("                |     0 - Sair                                      |");
                System.out.println("                 ===================================================\n");
                opcao = read.nextInt();
                switch (opcao)
                {
                    case 1:
                        System.out.println("Informe o número de produtos que serão cadastrados na lista: ");
                        limite_lista = read.nextInt();
                        read.nextLine();
                        for (int i = 0 ; i <limite_lista ; i++)
                        {
                            lista_produto.add(new Produto());
                        }
                        break;
                    case 2:
                        for (int i = 0 ; i < lista_produto.size() ; i++)
                        {
                            Produto p = lista_produto.get(i);
                            System.out.println(p.toString());
                        }
                        break;
                    case 3:
                        float preco_inic;
                        float preco_final;
                        System.out.println("Informe a faixa de preço inicial: ");
                        preco_inic = read.nextFloat();
                        System.out.println("Informe a faixa de preço final: ");
                        preco_final = read.nextFloat();
                        for (int i = 0 ; i < lista_produto.size() ; i++)
                        {
                            Produto p = lista_produto.get(i);
                            if (p.preco >= preco_inic & p.preco <= preco_final)
                            {
                                System.out.println(p.toString());
                            }
                        }
                        break;
                    case 4:
                        String nome_produto;
                        System.out.println("Informe o nome do produto: ");
                        nome_produto = read.nextLine();
                        for (int i = 0 ; i < lista_produto.size() ; i++)
                        {
                            Produto p = lista_produto.get(i);
                            if (p.nome.equals(nome_produto))
                            {
                                Calendar data_atual = Calendar.getInstance();
                                data_atual.set(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH);
                                Compra c = new Compra(data_atual,p,c1);
                                c.emitirNota();
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Programa encerrado!");
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
