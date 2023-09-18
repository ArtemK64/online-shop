package org.onlinestore;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String email;
    private int qtyOfOrders;

    public void incrementQtyOfOrders(User user) {
        user.qtyOfOrders += 1;
    }

    public void makeOrder(User user, List<Product> products) {
        user.qtyOfOrders += 1;
        for (Product product: products) {
            product.sellProduct(product.getQuantity());
        }
    }
}
