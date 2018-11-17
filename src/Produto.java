import java.util.Calendar;
import java.util.Scanner;
public class Produto 
{
    int codigo_produto;
    String nome;
    String modelo;
    String marca;
    int lote;
    float preco;
    int quantidade;
    int dia;
    int mes;
    int ano;
    Scanner read = new Scanner(System.in);
    Calendar data_validade = Calendar.getInstance();
    Produto()
    {
        System.out.println("Informe o código do produto: "); 
        this.codigo_produto = read.nextInt();
        read.nextLine();
        System.out.println("Informe o nome do produto: ");
        this.nome = read.nextLine();
        System.out.println("Informe o modelo do produto: ");
        this.modelo = read.nextLine();
        System.out.println("Informe a marca do produto: ");
        this.marca = read.nextLine();
        System.out.println("Informe o dia da validade: ");
        this.dia = read.nextInt();
        System.out.println("Informe o mês da validade: ");
        this.mes = read.nextInt();
        System.out.println("Informe o ano da validade: ");
        this.ano = read.nextInt();
        data_validade.set(dia, mes, ano);
        System.out.println("Informe o lote do produto: ");
        this.lote = read.nextInt();
        System.out.println("Informe o preço do produto: ");
        this.preco = read.nextFloat();
        System.out.println("Informe a quantidade do produto: ");
        this.quantidade = read.nextInt();
    }
    int calcularValidade()
    {
        Calendar data_atual = Calendar.getInstance();
        data_atual.set(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH);
        long milisec = data_validade.getTimeInMillis()-data_atual.getTimeInMillis();
        int hora = (int)(milisec/1000/60/60);
        int fim_validade = hora/24;
        return fim_validade;  
    }

    @Override
    public String toString() 
    {
        return "Produto{" + "codigo_produto=" + codigo_produto + ", nome=" + nome + ", modelo=" + modelo + ", marca=" + marca + ", preco=" + preco + '}';
    }
}
