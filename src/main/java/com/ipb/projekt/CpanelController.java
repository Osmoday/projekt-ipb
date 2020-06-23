package com.ipb.projekt;

import com.ipb.projekt.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CpanelController {

    private final ProductService productService;

    @Autowired
    public CpanelController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/cpanel")
    public String cpanel(Model model) {
        model.addAttribute("products", productService.getAll());
        model.addAttribute("cpu", productService.getCpu());
        model.addAttribute("gpu", productService.getGpu());
        model.addAttribute("ram", productService.getCpu());
        //return "login";
        return "admin";
    }


}
