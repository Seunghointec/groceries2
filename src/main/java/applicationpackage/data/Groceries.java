package applicationpackage.data;

import javax.persistence.*;
import javax.validation.constraints.*;

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
//    @Digits(integer = 4 /*precision*/, fraction = 3 /*scale*/, message = "numbers must be above 0, and 3 fraction")
    private double price;


    public Groceries() {
    }

    public Groceries(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
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




}
