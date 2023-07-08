/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mini.toko.atk.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bhaskara
 */
public class TokoAtkTableModel extends AbstractTableModel {

    private List<TokoAtk> listAtk = new ArrayList();//
    private final String HEADER[] = {"Kode Barang", "Nama Barang", "Merk Barang", "Jenis Barang",
        "Stok Barang", "Harga Barang"};
    
    public TokoAtkTableModel(List<TokoAtk> listAtk){
        this.listAtk = listAtk;
    }
    
    
    @Override
    public int getRowCount() { //baris
        return listAtk.size();
    }

    @Override
    public int getColumnCount() { //kolom
        return HEADER.length;//menyesuaikan jumlah kolom sesuai database
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TokoAtk tokoAtk = listAtk.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tokoAtk.getKd_barang();
            case 1:
                return tokoAtk.getNm_barang();
            case 2:
                return tokoAtk.getMerk();
            case 3:
                return tokoAtk.getJenis();
            case 4:
                return tokoAtk.getStok();
            case 5:
                return tokoAtk.getHarga();
            default:
                return null;
        }
    }
    
    
    @Override
    public String getColumnName(int index){
        return HEADER[index]; //buat sesuain tempat nama kolom
    }
    
}
