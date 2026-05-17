public class Customer {
    String name;
    SuperMarket supermarket;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    void goToSuperMarket(SuperMarket supermarket){
        this.supermarket = supermarket;
   }

   public void  buyItem(Product productName, int amount){

        //validate is supermarket is null
        if(this.supermarket == null){
            System.out.println("Select a supermarket to go to first.\n");
            return;
        }
//TODO : Tip: gebruik equalsIgnoreCase om de namen hier te vergelijken,
//       getracht maar omdat het "Object - Product" niet een string is kan ik de bovenstaande  functie
//       niet gebruiken.
        for(Product product : supermarket.products){
                if(productName.equals(product)) {
                    supermarket.buyItem(product , amount);
                    return;
            }
            System.out.println(this.supermarket + " does not sell " + product);
       }



   }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", supermarket=" + supermarket +
                '}';
    }
}