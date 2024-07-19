package entities;

import dal.UserDatabase;

import java.util.ArrayList;
import java.util.List;

public class ShopWorldApp {
    public static void main(String[] args) {

        //Create a user database-Singleton
        UserDatabase userDatabase=UserDatabase.getInstance();

        ProductFactory productFactory = new ProductFactory();
        Product electronicProd= productFactory.createProduct("electronics");
        electronicProd.displayInfo();

        Product clothingProd= productFactory.createProduct("clothing");
        clothingProd.displayInfo();

        //Build the user account
        UserAccount.UserAccountBuilder userBuilder=new UserAccount.UserAccountBuilder("username","dev");

        UserAccount userAccount = userBuilder.build();
        System.out.println(userAccount);


        List<Product> products= new ArrayList<>();
        products.add(electronicProd);
        products.add(clothingProd);
        //Build the order
        Order.OrderBuilder orderBuilder = new Order.OrderBuilder("orderId",products);
        Order order=orderBuilder.build();

    }
}
