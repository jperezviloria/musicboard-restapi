package MusicBoard.demo.Service.Implementation;

import MusicBoard.demo.Model.Product;
import MusicBoard.demo.Service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplementation implements ProductService {
    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public Optional<Product> getAllProductById(String idProduct) {
        return Optional.empty();
    }

    @Override
    public String saveProduct(Product product) {
        return null;
    }
}
