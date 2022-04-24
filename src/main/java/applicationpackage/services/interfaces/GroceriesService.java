package applicationpackage.services.interfaces;

import applicationpackage.data.Groceries;

import java.util.List;

public interface GroceriesService {

        List<Groceries> getAllGroceries();

        Groceries addGroceries(Groceries groceries);

        Groceries deleteGroceries(Groceries groceries);

        Groceries updateGroceries(Groceries groceries);

        Groceries findGroceryByID(int itemsID);

}
