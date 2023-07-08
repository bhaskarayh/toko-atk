/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mini.toko.atk.service;

import com.mini.toko.atk.model.TokoAtk;
import java.util.List;

/**
 *
 * @author Bhaskara
 */
public interface TokoAtkService {
    public void save(TokoAtk toko);
    public void delete(TokoAtk toko);
    public void update(TokoAtk toko);
//    public TokoElektronik get(String kd_barang);//buat pilih barang yg nanti buat dihapus(get dulu datanya)
    public List<TokoAtk> getList();//Buat menampilkan list barang yg masuk ke database
}
