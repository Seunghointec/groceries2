package applicationpackage.data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Groceries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemsID;
    @NotEmpty
    @NotBlank(message = "item can't be left blank!")
    @Column(length = 1000)
    private String name;
    @Min(value=1, message = "Numbers must be above 0")
    private int amount;
    private double price;
    private double totalPrice;

    public Groceries() {
    }

    public Groceries(String name, int amount, double price, double totalPrice) {

        this.name = name;
        this.amount = amount;
        this.price = price;
        this.totalPrice = price;
    }

    public int getItemsID() {
        return itemsID;
    }

    public void setItemsID(int itemsID) {
        this.itemsID = itemsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {this.amount = amount;}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        double totalPrice = this.amount * this.price;
        return totalPrice;
    }


}
