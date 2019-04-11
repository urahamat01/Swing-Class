/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.DaoImp;

import com.inventory.Connection.DBConnection;
import com.inventory.Connection.DataConnect;
import com.inventory.Dao.Producte;
import com.inventory.pojo.Producta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student- J2EE
 */
public class NewProductImple implements Producte {

    Connection conn = DBConnection.getConnect();

//    public static void main(String[] args) {
//        NewProductImple pdi = new NewProductImple();
//        pdi.createTable();
//    }
    @Override
    public void createTable() {

        String sql = "create table IF NOT EXISTS product(id int(10) auto_increment primary key, product_name varchar(10), product_code varchar(10), qty int(11), unit_price double, purchase_date date,p_cat_id int(5))";

        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            System.out.println("table create");
        } catch (SQLException ex) {
            Logger.getLogger(NewProductImple.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save(Producta p) {

        String sql = "insert into product(product_name, product_code, qty, unit_price, total_price,purchase_date, p_cat_id) values(?,?,?,?,?,?,?)";

        try {
            PreparedStatement pstm = conn.prepareStatement(sql);

//    int id;
//    String name;
//    String code;
//    Date date;
//    int qulty;
//    double uPrice;
//    String total;
            pstm.setString(1, p.getProductName());
            pstm.setString(2, p.getCode());
            pstm.setInt(3, p.getQulty());
            pstm.setDouble(4, p.getuPrice());
            pstm.setDate(5, p.getDate());
            pstm.setString(6, p.getTotal());

            pstm.executeUpdate();
            System.out.println("success insert");

        } catch (SQLException ex) {
            Logger.getLogger(NewProductImple.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update(Producta p) {
        String sql = "update product set product_name=?,product_code=?, buy_date=?,quantity=?,unit_price=?,total_amount=? where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductName());
            pstm.setString(2, p.getCode());
            pstm.setInt(3, p.getQulty());
            pstm.setDouble(4, p.getuPrice());
            pstm.setDate(5, p.getDate());
            pstm.setString(6, p.getTotal());

            pstm.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producta getProductaId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producta getProductByCode(String code) {
        Producta producta = null;
        String sql = "select * from product where product_code=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, code);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                //  producta = new Producta(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5), rs.getDouble(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewProductImple.class.getName()).log(Level.SEVERE, null, ex);
        }
        return producta;

    }

    @Override
    public List<Producta> getProduct() {

        List<Producta> list = new ArrayList<>();
        String sql = "select * from product";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producta p = new Producta();
                list.add(p);

            }
        } catch (SQLException ex) {

            ex.printStackTrace();

        }
        return list;

    }

    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
