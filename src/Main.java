import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean inSuperMarket = true;
        String superMarketChoice = "";
        int choice = 0;
        int amount = 0;
        String name = "";

        Scanner scanner = new Scanner(System.in);

        //SuperMarkets
        List<Product> productsHalbertEijn = new ArrayList<>();
        List<Product> productsDumbo = new ArrayList<>();
        List<Product> productsCaldi = new ArrayList<>();

        List<Customer> customers = new ArrayList<>();
        Map<String,SuperMarket> superMarkets = new HashMap<>();

        Product bread = new Product("bread", 3.69, 10);
        Product fruit = new Product("fruit", 2.00, 70);
        Product cheese = new Product("cheese", 7.99, 90);
        Product toiletPaper = new Product("toiletPaper", 6.00, 12);

        Product popcorn = new Product("popcorn", 1.89, 50);
        Product milk = new Product("milk", 2.90, 40);
        Product salt = new Product("salt", 3.99, 20);
        Product butter = new Product("butter", 3.00, 72);

        Product egg = new Product("egg", 8.90, 50);
        Product iceCream = new Product("iceCream", 2.99, 20);
        Product salmon = new Product("salmon", 17.99, 80);
        Product beef = new Product("beef", 16.00, 52);

        Customer jan = new Customer("Jan");
        Customer customer = new Customer("Jhudeska");

        SuperMarket dumbo = new SuperMarket("dumbo", productsDumbo);
        SuperMarket halbertEijn = new SuperMarket("halbert eijn", productsHalbertEijn);
        SuperMarket caldi = new SuperMarket("caldi", productsCaldi);

        productsHalbertEijn.add(bread);
        productsHalbertEijn.add(fruit);
        productsHalbertEijn.add(cheese);
        productsHalbertEijn.add(toiletPaper);

        productsDumbo.add(popcorn);
        productsDumbo.add(milk);
        productsDumbo.add(salt);
        productsDumbo.add(butter);

        productsCaldi.add(egg);
        productsCaldi.add(iceCream);
        productsCaldi.add(salmon);
        productsCaldi.add(beef);

        customers.add(jan);
        customers.add(customer);

        superMarkets.put("dumbo", dumbo );
        superMarkets.put("halbert eijn", halbertEijn);
        superMarkets.put("caldi", caldi);


        while(inSuperMarket){
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - Pick a supermarket");
            System.out.println("2 - Buy a product");
            System.out.println("3 - Restock a product");
            System.out.println("4 - Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            //validation
            if (choice > 0){

                switch (choice){

                    case 1:
                        System.out.println("\nWhich supermarket do you want to go to?");
                        System.out.println("Pick one of the following:");
                        System.out.println("- Halbert Eijn");
                        System.out.println("- Dumbo");
                        System.out.println("- Caldi");
                        superMarketChoice = scanner.nextLine().toLowerCase();

                        // iterate through map and Product object
                        for (Map.Entry<String,SuperMarket> entry : superMarkets.entrySet()){
//                            System.out.println(entry.getKey());

                            if(entry.getKey().equals(superMarketChoice)){
                                switch (superMarketChoice) {
                                    case "halbert eijn":
                                        System.out.println("\nWelcome to the Supermarket " + entry.getKey());
                                        customer.goToSuperMarket(entry.getValue());
                                        break;
                                    case "dumbo":
                                        System.out.println("\nWelcome to the Supermarket " + entry.getKey());
                                        customer.goToSuperMarket(entry.getValue());
                                        break;
                                    case "caldi":
                                        System.out.println("\nWelcome to the Supermarket " + entry.getKey());
                                        customer.goToSuperMarket(entry.getValue());
                                        break;
                                    default:
                                        System.out.println("Please enter a valid supermarket from the list above.");
                                        return;
                                }


                                for (Product product : entry.getValue().getProducts()) {
                                System.out.println(" - " + product);
                                }


                        }else {
//                                System.out.println("User input is invalid for " + entry.getKey());
                            }

                       }
                        break;
                    case 2:
                        if(customer.supermarket == null) {
                            System.out.println("\nPick a supermarket first.");
                            break;
                        }

                        for (Map.Entry<String,SuperMarket> entry : superMarkets.entrySet()){

                            if(entry.getKey().equals(superMarketChoice)) {

                                System.out.println("\nWhich product do you want to buy from " + entry.getKey() + " ?");
                                name = scanner.nextLine().toLowerCase();
                                System.out.println("How many do you want to buy?");
                                amount = scanner.nextInt();
                            }

                                for (Product product : entry.getValue().getProducts()) {
//                                    System.out.println(" - " + product);
                                     if (name.equals(product.name)){
                                         customer.buyItem( product, amount);
                                     }

                                }
//                            }


                            }

                        break;
                    case 3:
                        if(customer.supermarket == null) {
                            System.out.println("\nPick a supermarket first.");
                            break;
                        }

                        for (Map.Entry<String,SuperMarket> entry : superMarkets.entrySet()){
//                            System.out.println(entry.getKey());

                            if(entry.getKey().equals(superMarketChoice)){

                                // TODO: helper functie maken
                                System.out.println("\nWhich supermarket do you want to restock?");
                                System.out.println("Pick one of the following:");
                                System.out.println("- Halbert Eijn");
                                System.out.println("- Dumbo");
                                System.out.println("- Caldi");
                                superMarketChoice = scanner.nextLine().toLowerCase();

                                System.out.println("Which product do you want to restock in [supermarket]?");
                                name = scanner.nextLine().toLowerCase();
                                System.out.println("How many do you want to add?");
                                amount = scanner.nextInt();


                                for (Product product : entry.getValue().getProducts()) {
                                    //Roep superMarket.restockItem aan.
                                    System.out.println(" - " + product);
                                }

//                                TODO: iterate supermarket
//                                for (SuperMarket super : entry.getValue().getProducts()) {
////                                    System.out.println(" - " + product);
//                                     if (name.equals(super.getName())){
//                                         super.restockItem( super, amount);
//                                     }
//


                            }

                        }
                        break;
                    case 4:
                        inSuperMarket = false;
                        System.out.println("Thank you for your visit, and goodbye!");
                        return;
                    default:
                        System.out.println("This menu option has no input yet");
                        break;
                }

            }else {
                System.out.println("Invalid Choice.\n Enter an number (1 - 4)");
                inSuperMarket = true;
            }

        }

        scanner.close();





    }
}