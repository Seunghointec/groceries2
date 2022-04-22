package applicationpackage.controllers.interfaces;

import applicationpackage.data.Groceries;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public interface IndexController {

    @GetMapping
    String indexMethod2(Model model);

    @PostMapping("/create")
    String addTable(@ModelAttribute("grocery") Groceries grocery);


    @DeleteMapping(value="/delete")
    String deleteGroceries(@ModelAttribute("grocery") Groceries grocery);
}
