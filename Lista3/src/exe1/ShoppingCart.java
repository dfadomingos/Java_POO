package exe1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    //associaçao com vetor
    private List<CarItem> itens;

    public ShoppingCart() {
        //aloca espaço na memoria para o vetor
        this.itens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id) {
        this.id = id;
        this.itens = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CarItem> getItens() {
        return itens;
    }

    public void addCarItem(int quantity, Product product){
        //adiciona item no ArrayList
        this.itens.add(new CarItem(quantity, product));
        System.out.println("Item de carrinho adicionado com sucesso");
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", itens=" + itens +
                '}';
    }

    //criar metodo que calcula o valor total do carrinho de compras
    public void valorTotal(){
        float total = 0;
        //para cada CarItem do vetor
        //a variavel item representa um item do vetor
        for(CarItem item : itens){
            total += item.getQuantity() * item.getProduct().getPrice();
        }
        System.out.println("Total do carrinho " + total);
    }

    // remove um item do carrinho
    public void removerCarItem(int quantity, Product product){
        // tentar encontrar solução para remoção

        boolean resposta = this.itens.remove(new CarItem(quantity, product));
        if(resposta){
            System.out.println("Item removido com sucesso");
        }
        else System.out.println("Item do carrinho não foi removido");
    }
}
