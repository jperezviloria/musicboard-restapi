package MusicBoard.demo.Service;

import MusicBoard.demo.Model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAllProduct();

    Optional<Product> getAllProductById(String idProduct);

    String saveProduct (Product product);

}
