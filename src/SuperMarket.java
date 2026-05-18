import java.util.ArrayList;
import java.util.List;

public class SuperMarket {

        String name;
        List<Product> products ;
        int stock = 0;

    public SuperMarket(String name, List<Product> products){
        this.name = name;
        //Check on null pointer
        if (products == null) {
            this.products = new ArrayList<>();
        } else {
            this.products = products;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void buyItem(Product product, int amount){
           if(amount <= product.amount) {
             stock = amount - product.amount;
            double totalAmount =  amount * product.price;
            System.out.println( "You bought " + amount + " " + product.name + " for " + totalAmount +  " euro.\n");
        }else {
            System.out.println("You cannot buy " + amount + " " + product.name + ", we only have " + stock + " of " +  product.name + " in stock.\n");
        }
    }


    public void restockItem(Product productName, int amount){

        for(Product product : this.products){
            if(productName.equals(product)) {
//                this.products.buyItem(product , amount);
                System.out.println(" item ge-restocked");
                product.amount += amount;
                return;
            }
            System.out.println(this.name + " does not sell " + product + " item niet ge-restocked");
        }
    }

    @Override
    public String toString() {
        return "SuperMarket{" +
                "products=" + getProducts() +
                ", name='" + name + '\'' +
                '}';
    }
}