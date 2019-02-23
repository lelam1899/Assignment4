package ASM4;

import java.util.ArrayList;

public class Order {
    public int idOrder;
    public double total;
    public ArrayList<Product> listProduct = new ArrayList<Product>();

    public Order(int idOrder) {
        this.idOrder = idOrder;
        this.total = 0;
    }
    public void addProduct(Product p) {
        if(p.quantity > 0) {
            listProduct.add(p);
            this.total += p.price;
            p.setQty(p.getQty()-1);
        } else {
            System.out.println(p.name + " het hang");
        }

    }  public void addProduct(Product p, int discount) {
        if(p.showQuantity() > 0) {
            listProduct.add(p);
            this.total += p.price*(100-discount)/100;
            p.setQty(p.getQty()-1);
        } else {
            System.out.println(p.name+" het hang");
        }

    }
}
