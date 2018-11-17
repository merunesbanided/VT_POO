
import java.util.Calendar;

public class Compra 
{
    Cliente cliente;
    Produto produto;
    Calendar data_compra = Calendar.getInstance();

    public Compra(Calendar data_compra, Produto p,Cliente c) 
    {   
        this.cliente = c;
        this.produto = p;
        this.data_compra = data_compra;
    }
    float calcularValorTotal()
    {
        float totalvalor = 0;
        totalvalor = totalvalor + produto.preco;
        return totalvalor;
        
    }
    void emitirNota()
    {
        System.out.println("Nome: "+cliente.nome);
        System.out.println("CPF: "+cliente.cpf);
        System.out.println(produto.toString());
        System.out.println("Valor total: "+calcularValorTotal());
    }
    
}
