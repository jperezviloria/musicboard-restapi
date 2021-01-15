package MusicBoard.demo.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Product {

    @Id
    private String idProduct;

    private String categoryProduct;

    private String brandProduct;

    private int priceProduct;


}
