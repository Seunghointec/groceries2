package applicationpackage.services.implementation;

import applicationpackage.data.Groceries;
import applicationpackage.repositories.GroceriesRepository;
import applicationpackage.services.interfaces.GroceriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceriesServiceImp implements GroceriesService {

    private GroceriesRepository groceriesRepository;

    public GroceriesServiceImp(){}

    @Autowired
    public GroceriesServiceImp(GroceriesRepository groceriesRepository) {
        this.groceriesRepository = groceriesRepository;
    }

   @Override
    public List<Groceries> getAllGrocers() {
        return groceriesRepository.findAll();
    }

    @Override
    public Groceries addGroceries(Groceries groceries) {
        groceriesRepository.save(groceries);
        return groceries;
    }

    public Groceries deleteGroceries(Groceries groceries) {
        groceriesRepository.delete(groceries);
        return groceries;
    }

    @Override
    public Groceries updateGroceries(Groceries groceries) {
        return null;
    }

    @Override
    public Groceries findGroceryByID(int itemsID) {
        return groceriesRepository.findById(itemsID).get();
    }


}
