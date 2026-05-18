public class Product {

    String name ;
    double price;
    int amount;

   public Product(String name, double price, int amount){

       if (name == null || name.isBlank()) {
           System.out.println("Name cannot be null or empty\n");
       }

       if (price < 0) {
           System.out.println("Price cannot be negative\n");
       }

       if (price < 0) {
           System.out.println("Amount cannot be negative\n");
       }

       this.name = name;
       this.price = price;
       this.amount = amount;
   }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}