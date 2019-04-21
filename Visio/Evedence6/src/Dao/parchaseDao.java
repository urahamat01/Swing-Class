package Dao;

import java.util.List;
import pojo.purchase;



public interface parchaseDao {
    
    void createTable();
    void save();
    void upDate();
    void delete();
   
    purchase getProductById(int id);
    
    purchase getProductByCode(int code);
    
    List<purchase>getPurchase();
    

   

}
