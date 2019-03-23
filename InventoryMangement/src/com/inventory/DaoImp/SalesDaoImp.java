/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.DaoImp;

import com.inventory.Connection.DBConnection;
import com.inventory.Dao.ProductDao;
import com.inventory.pojo.Product;
import com.inventory.view.ProductView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Md Yasin Arif
 */
public class SalesDaoImp implements ProductDao{
        Connection con = DBConnection.getConnect();
        public static void main(String[] args) {
        SalesDaoImp obj = new SalesDaoImp();
        obj.createTable();
    }

    @Override
    public void createTable() {
         String sql = "create table if not Exists sales(id int(4) auto_increment primary key,product_name varchar(20),product_code varchar(20),sales_date date,quantity int(20),unit_price double,total_amount double)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("table created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(com.inventory.pojo.Product p) {
        String sql = "insert into sales(product_name,product_code,sales_date,quantity,unit_price,total_amount)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getProductName());
            ps.setString(2, p.getProductCode());
            ps.setDate(3, p.getDate());
            ps.setInt(4, p.getQty());
            ps.setDouble(5, p.getuPrice());
            ps.setDouble(6, p.getTotalAmount());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(com.inventory.pojo.Product p) {
        String sql = "update sales set product_name=?,product_code=?, sales_date=?,quantity=?,unit_price=?,total_amount=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getProductName());
            ps.setString(2, p.getProductCode());
            ps.setDate(3, p.getDate());
            ps.setInt(4, p.getQty());
            ps.setDouble(5, p.getuPrice());
            ps.setDouble(6, p.getTotalAmount());
            ps.setInt(7, p.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from sales where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public com.inventory.pojo.Product getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public com.inventory.pojo.Product getProductByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<com.inventory.pojo.Product> getProducts() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from sales";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5), rs.getDouble(6), rs.getDouble(7));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
}
