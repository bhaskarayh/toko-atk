/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mini.toko.atk.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Bhaskara
 */
@Entity
@Table(name = "tb_toko_atk") 
public class TokoAtk implements Serializable {
    @Id 
    @Column(name = "kode_barang", length = 8)
    private String kd_barang;
    
    @Column(name = "nama_barang", length = 15)
    private String nm_barang;
    
    @Column(name = "merk", length =10)
    private String merk;
    
    @Column(name = "jenis", length = 10)
    private String jenis;
    
    @Column(name = "stok")
    private int stok;
    
    @Column(name = "harga")
    private int harga;

    /**
     * @return the kd_barang
     */
    public String getKd_barang() {
        return kd_barang;
    }

    /**
     * @param kd_barang the kd_barang to set
     */
    public void setKd_barang(String kd_barang) {
        this.kd_barang = kd_barang;
    }

    /**
     * @return the nm_barang
     */
    public String getNm_barang() {
        return nm_barang;
    }

    /**
     * @param nm_barang the nm_barang to set
     */
    public void setNm_barang(String nm_barang) {
        this.nm_barang = nm_barang;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }

    
    
}
