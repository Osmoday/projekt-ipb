package com.ipb.projekt;

import com.ipb.projekt.dataRepositories.CategoryRepository;
import com.ipb.projekt.dataRepositories.ProductRepository;
import com.ipb.projekt.entites.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@Controller
public class UserController {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public UserController(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/user")
    public String user(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "user";
    }

    @ModelAttribute("categories")
    public List<CategoryEntity> categories() {
        return (List<CategoryEntity>) categoryRepository.findAll();
    }

}