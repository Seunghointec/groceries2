package applicationpackage.controllers.implementations;

import applicationpackage.controllers.interfaces.IndexController;
import applicationpackage.data.Groceries;
import applicationpackage.services.interfaces.GroceriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexControllerImp implements IndexController {

    private Groceries grocery;
    @Autowired
    private GroceriesService groceriesService;

    @Override
    @GetMapping("/create")
    public String indexMethod2(Model model) {

        List<Groceries> groceries = groceriesService.getAllGroceries();
        model.addAttribute("grocery", new Groceries("", 0, 0.00));
        model.addAttribute("groceries", groceriesService.getAllGroceries());
        System.out.println(groceriesService.getAllGroceries().get(0));
        return "index";
    }

    @Override
    @PostMapping("/create")
    public String addTable(@ModelAttribute("grocery") Groceries grocery) {
        if (grocery== null) {
            return "redirect:create";
        }
        else {
            groceriesService.addGroceries(grocery);
        }
        return "index";
    }

    @Override
    public String deleteGroceries(Groceries grocery) {
        return null;
    }


    @GetMapping(value="/delete/{itemsID}")
    public String deleteGroceries(@PathVariable("itemsID") int itemsID) {
        Groceries groceries = groceriesService.findGroceryByID(itemsID);
        if (groceries == null) {
            return "redirect:/create";
        }else {
            groceriesService.deleteGroceries(groceries);
        }
        return "redirect:/create";
    }
}
