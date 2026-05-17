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

//        for(Product product : products.name){
//            if(productName.equals(product)) {
//                products.buyItem(product , amount);
//                System.out.println(" item ge-restocked");
//                return;
//            }
//            System.out.println(this.supermarket + " does not sell " + product + " item niet ge-restocked");
//        }
//TODO bouwen van restock function

//        SuperMarket krijgt een extra functionaliteit, namelijk een restockItem methode.
//
//                Deze methode lijkt op Customer.buyItem. Het heeft dezelfde parameters (String productName en int amount).
//        Het heeft ook een vergelijkbare for-loop (maar iets anders).
//
//                loop door Product products in this.products.
//                Als product.name overeenkomt met productName
//        Dan tellen we amount bij product.amount op en returnen we de methode.
//                Eindig de for-loop met een return wanneer het item ge-restocked is. Als restock niet lukt, omdat deze supermarkt dit item niet in de productenlijst heeft staan bijvoorbeeld, print daar dan een berichtje voor.

    }

    @Override
    public String toString() {
        return "SuperMarket{" +
                "products=" + getProducts() +
                ", name='" + name + '\'' +
                '}';
    }
}