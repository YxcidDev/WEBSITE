package com.informative.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.informative.website.model.ProductModel;
import com.informative.website.repository.ProductRepository;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/productos")
    public String showProduct(Model model) {
        List<ProductModel> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "productos";
    }
}
