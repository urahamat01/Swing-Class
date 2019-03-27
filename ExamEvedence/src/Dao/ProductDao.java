package Dao;

import Pojo.Product;
import java.util.List;

public interface ProductDao {

    void createTable();

    void save(Product p);

    void update(Product p);

    void delete(int id);

    Product getProductById(int id);

    Product getProductByCode(String code);

    List<Product> getProducts();

}
