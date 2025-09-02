package exe1;

public class CarItem {
    private float quantity;
    // associar com o product
    private Product product;

    public CarItem() {
    }

    public CarItem(float quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "\nCarItem{" +
                "quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
