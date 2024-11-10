package animais.loja.Vendas;

public class Venda {
    private int id;
    private int produtoId;
    private int clienteId;
    private int funcionarioId;
    private String dataVenda; 
    private double valorTotal;
    
    private String nomeFuncionario;
    private String nomeCliente;
    private String nomeProduto;
    // atributo id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // atributo produtoId
    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    // atributo clienteId
    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

        // atributo funcionarioId
    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setfuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }
    
    // atributo dataVenda
    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    // atributo valorTotal
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}