package MusicBoard.demo.Controller;

import MusicBoard.demo.Model.Product;
import MusicBoard.demo.Service.Implementation.ProductServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.management.OperatingSystemMXBean;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("product")

public class ProductController {
    @Autowired
    ProductServiceImplementation productServiceImplementation;

    @GetMapping("/all")
    public List<Product> getAllProduct(){
        return productServiceImplementation.getAllProduct();
    }

    @GetMapping
    public Optional<Product> getAllProductById(@RequestBody String idProduct) {
        return productServiceImplementation.getAllProductById(idProduct);

    }
    @PostMapping
    public String saveProduct(@RequestBody Product product)
    { return productServiceImplementation.saveProduct(product);

    }


}
