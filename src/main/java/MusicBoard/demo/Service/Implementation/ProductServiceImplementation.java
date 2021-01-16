package MusicBoard.demo.Service.Implementation;

import MusicBoard.demo.Model.Product;
import MusicBoard.demo.Repository.ProductRepository;
import MusicBoard.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getAllProductById(String idProduct) {
        return productRepository.findById(idProduct);
    }

    @Override
    public String saveProduct(Product product) {

        productRepository.save(product);

        return "Product was added";

    }
}
