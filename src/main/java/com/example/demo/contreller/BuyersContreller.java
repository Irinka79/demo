package com.example.demo.contreller;

import com.example.demo.model.Buyers;
import com.example.demo.repository.ShopRepository;
import com.example.demo.repository.BuyersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BuyersContreller {
    @Autowired
    BuyersRepository buyersRepository;
    @Autowired
    ShopRepository shopRepository;

    @GetMapping("/client")
    public String findAll(Model model) {
        List<Buyers> buyerses = buyersRepository.findAll();
        model.addAttribute("buers", buyerses);
        return "client";
    }

    @GetMapping("/delete-buyers")
    public String delete(@RequestParam int id) {
        buyersRepository.deleteById(id);
        return "redirect:client";
    }

    @GetMapping("/add-buyers")
    public String add(Model model) {
        model.addAttribute("shopes", shopRepository.findAll());
        return "add-buyers";
    }

    @PostMapping("/add-buyers")
    public String add(@ModelAttribute Buyers buyers) {
        buyersRepository.save(buyers);
        return "redirect:client";
    }

    @GetMapping("/update-buyers")
    public String update(@RequestParam int id, Model model) {
        Buyers buyers = buyersRepository.findById(id).get();
        model.addAttribute("shopes", shopRepository.findAll());
        model.addAttribute("buyers", buyers);
        return "update-buyers";
    }

    @PostMapping("/update-buyers")
    public String update(@ModelAttribute Buyers buyers) {
        buyersRepository.save(buyers);
        return "redirect:client";
    }
}
