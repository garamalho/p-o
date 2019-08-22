
package padaria;

public class Principal {
   
    public static void main(String[] args) {
        
        Frios frios1 = new Frios();
        frios1.setNome("frios");
        frios1.setValor(7.00);
        frios1.setQuantidade(3);
        
        Paozinho pão1 = new Paozinho();
        pão1.setNome("pães");
        pão1.setValor(4.00);
        pão1.setQuantidade(6);
        
        Doces doce1 = new Doces();
        doce1.setNome("doces");
        doce1.setValor(5.00);
        doce1.setQuantidade(3);
        
        pedido pedido = new pedido();
        pedido.setProduto1(pão1);
        pedido.setProduto2(frios1);
        pedido.setProduto3(doce1);
        
        pedido.Pedidos();
        
        
    }
    
}
