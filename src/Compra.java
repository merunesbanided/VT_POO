public class Compra 
{
    Cliente cliente = new Cliente();
    Produto produto = new Produto();
    String data_compra;

    public Compra(String data_compra) 
    {
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
        produto.exibirProduto();
        System.out.println("Valor total: "+calcularValorTotal());
    }
    
}
