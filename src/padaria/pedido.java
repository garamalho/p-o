
package padaria;


public class pedido {
    
    private produto produto1;
    private produto produto2;
    private produto produto3;
    
    public void Pedidos(){
        System.out.println("Pedido 1 - "+produto1.getNome());
        System.out.println("Valor - "+produto1.getValor());
        System.out.println("Quantidade - "+produto1.getQuantidade());
        
        System.out.println("Pedido 2 - "+produto2.getNome());
        System.out.println("Valor - "+produto2.getValor());
        System.out.println("Quantidade - "+produto2.getQuantidade());
        
        System.out.println("Pedido 3 - "+produto3.getNome());
        System.out.println("Valor - "+produto3.getValor());
        System.out.println("Quantidade - "+produto3.getQuantidade());
    }

    public produto getProduto1() {
        return produto1;
    }

    public void setProduto1(produto produto1) {
        this.produto1 = produto1;
    }

    public produto getProduto2() {
        return produto2;
    }

    public void setProduto2(produto produto2) {
        this.produto2 = produto2;
    }

    public produto getProduto3() {
        return produto3;
    }

    public void setProduto3(produto produto3) {
        this.produto3 = produto3;
    }
    
}
