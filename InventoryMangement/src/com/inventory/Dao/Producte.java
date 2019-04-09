/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.Dao;

import com.inventory.pojo.Producta;
import java.util.List;

/**
 *
 * @author Student- J2EE
 */
public interface Producte {

    void createTable();

    void save();

    void update();

    void delete();

    Producta getProductaId(int id);

    Producta getProductByCode(String code);

    List<Producta> getProduct();

}
