package com.ipb.projekt;

import com.ipb.projekt.dataRepositories.CategoryRepository;
import com.ipb.projekt.entites.CategoryEntity;
import com.ipb.projekt.entites.CpuEntity;
import com.ipb.projekt.entites.ProductEntity;
import com.ipb.projekt.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class ProductController {

    private final ProductService productService;
    private final CategoryRepository categoryRepository;

    @Autowired
    public ProductController(ProductService productService, CategoryRepository categoryRepository) {
        this.productService = productService;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/product")
    @ResponseBody
    public ProductEntity product_min(@RequestParam(name="id") int id, Model model) {
        Optional<ProductEntity> opt = productService.getProductById(id);
        return opt.orElse(null);
    }

    @PostMapping("/add_cpu")
    public String addCpu(@RequestParam(value="idProduct") int idProduct,
                         @RequestParam(value="manufacturer") String manufacturer,
                         @RequestParam(value="price") Integer price,
                         @RequestParam(value="visibility") Byte visibility,
                         @RequestParam(value="category") Integer category,
                         @RequestParam(value="name") String name,
                         @RequestParam(value="cores") Integer cores,
                         @RequestParam(value="clockspeed") String clockspeed,
                         @RequestParam(value="turboclock") String turboclock) {
        String imgPath = "default.png";
        Optional<CategoryEntity> opt = this.categoryRepository.findById(category);
        if (opt.isPresent()) {
            CpuEntity e = new CpuEntity(
                    idProduct,
                    manufacturer,
                    price,
                    visibility,
                    opt.get(),
                    imgPath,
                    name,
                    cores,
                    clockspeed,
                    turboclock
            );
            productService.addNewCpu(e);
        }
        return "redirect:/cpanel";
        //TODO: change this to somewhere else
    }

    @PostMapping("/remove_product")
    public String removeProductById(@RequestParam(value="idProduct") int idProduct) {
        this.productService.removeProductById(idProduct);
        return "redirect:/cpanel";
        //TODO: change this to literally anywhere else, probably put this functionality in cpanel controller
    }

}
