package com.example.demo.contreller;
import com.example.demo.model.Shop;
import com.example.demo.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ShopController {
    @Autowired
    ShopRepository repository;
    @GetMapping("/shopes")
    public String findAll(Model model) {
        List<Shop> shopes = repository.findAll();
        model.addAttribute("shopes", shopes);
        return "shopes";
    }
    @GetMapping("/delete-shop")
    public String delete(@RequestParam int id) {
        repository.deleteById(id);
        return "redirect:shopes";
    }
    @GetMapping("/add-shop")
    public String add() {
        return "add-shop";
    }
    @PostMapping("/add-shop")
    public String add(@ModelAttribute Shop shop) {
        repository.save(shop);
        return "redirect:shopes";
    }
    @GetMapping("/update-shop")
    public String update(@RequestParam int id, Model model) {
        Shop shop = repository.findById(id).get();
        model.addAttribute("shop", shop);
        return "update-shop";
    }
    @PostMapping("/update-shop")
    public String update(@ModelAttribute Shop shop) {
        repository.save(shop);
        return "redirect:shopes";
    }

}
