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
//TODO : producten vergeijken met lijst producten uit supermarket
// Tip: gebruik equalsIgnoreCase om de namen hier te vergelijken

        for(Product product : supermarket.products){
                if(productName.equals(product)) {
                    supermarket.buyItem(product , amount);
                    return;
            }
            System.out.println(this.supermarket + " does not sell " + product);
       }
        // can also be an if statement
//       switch (productName) {
//           case "bread" -> supermarket.buyBread(amount);
//           case "fruit" -> supermarket.buyFruit(amount);
//           case "cheese" -> supermarket.buyCheese(amount);
//           case "toiletpaper" -> supermarket.buyToiletPaper(amount);
//           default -> System.out.println("Sorry, we do not have this product in stock.\n");

//       Als de loop klaar is en er is niks gevonden, dan printen we een berichtgeving als: "[supermarket] does not sell [product]"
//
//       Tip: gebruik equalsIgnoreCase om de namen hier te vergelijken
   }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", supermarket=" + supermarket +
                '}';
    }
}