package com.ipb.projekt;

import com.ipb.projekt.entites.ProductEntity;
import com.ipb.projekt.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public String product(@RequestParam(name="id") int id, Model model) {
        Optional<ProductEntity> opt = productService.getProductById(id);
        if (opt.isPresent()) {
            model.addAttribute("product", opt.get());
            return "product_full";
        } else {
            return "error";
        }
    }

    @GetMapping("/product_min")
    public String product_min(@RequestParam(name="id") int id, Model model) {
        Optional<ProductEntity> opt = productService.getProductById(id);
        if (opt.isPresent()) {
            model.addAttribute("product", opt.get());
            return "product_min";
        } else {
            return "error";
        }
    }

}
