/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.Dao;

import com.inventory.pojo.Product;
import java.util.List;

/**
 *
 * @author Md Yasin Arif
 */
public interface ProductDao {

    void createTable();

    void save(Product p);

    void update(Product p);

    void delete(int id);

    Product getProductById(int id);

    Product getProductByCode(String code);

    List<Product> getProducts();
}
