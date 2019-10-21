package jp.co.systena.tigerscave.shopingtest.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import jp.co.systena.tigerscave.shopingtest.application.controller.service.ListService;;

@Controller
public class ShoppingController {

    @GetMapping("/itemlist")
    public String list(Model model) {
        ListService listService = new ListService();
        model.addAttribute("map", listService.getItemList());
        return "ListView";
    }
}
