/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mini.toko.atk.controller;

import static com.mini.toko.atk.app.MainTokoApp.getTokoAtkService;
import com.mini.toko.atk.model.TokoAtk;
import com.mini.toko.atk.model.TokoAtkTableModel;
import com.mini.toko.atk.view.TokoView;
import java.util.List;
import javax.swing.JOptionPane;
import com.mini.toko.atk.dao.TokoAtkDao;


/**
 *
 * @author Bhaskara
 */
public class TokoAtkController {
    private final TokoView tokoView;
    private List<TokoAtk> listTokoAtk;
    private TokoAtkTableModel tokoAtkTableModel;
//    private final TokoElektronikDao tokoAtkDao = HibernateUtil.getTokoElektronikDao();
    
    public TokoAtkController(TokoView tokoView){
        this.tokoView = tokoView;
    }
    
    public void clear(){
        this.tokoView.getTxtKodeBarang().setText("");
        this.tokoView.getTxtNamaBarang().setText("");
        this.tokoView.getTxtMerkBarang().setText("");
        this.tokoView.getTxtJenisBarang().setText("");
        this.tokoView.getTxtStokBarang().setText("");
        this.tokoView.getTxtHargaBarang().setText("");
       
    }
    
    public void saveToko(){
        TokoAtk tokoAtk = new TokoAtk();//mapping classnya, sesuai kolom yg di tabel
        tokoAtk.setKd_barang(this.tokoView.getTxtKodeBarang().getText());
        tokoAtk.setNm_barang(this.tokoView.getTxtNamaBarang().getText());
        tokoAtk.setMerk(this.tokoView.getTxtMerkBarang().getText());
        tokoAtk.setJenis(this.tokoView.getTxtJenisBarang().getText());
        tokoAtk.setStok(Integer.parseInt(this.tokoView.getTxtStokBarang().getText()));
        tokoAtk.setHarga(Integer.parseInt(this.tokoView.getTxtHargaBarang().getText()));
        
        try {
            getTokoAtkService().save(tokoAtk);
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan data barang", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            getAllData();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error saat menyimpan data barang", "Error",
                    JOptionPane.ERROR_MESSAGE);
            clear();
        }
        
    }
    
    public void updateToko(){
        TokoAtk tokoAtk = new TokoAtk();//mapping classnya, sesuai kolom yg di tabel
        tokoAtk.setKd_barang(this.tokoView.getTxtKodeBarang().getText());
        tokoAtk.setNm_barang(this.tokoView.getTxtNamaBarang().getText());
        tokoAtk.setMerk(this.tokoView.getTxtMerkBarang().getText());
        tokoAtk.setJenis(this.tokoView.getTxtJenisBarang().getText());
        tokoAtk.setStok(Integer.parseInt(this.tokoView.getTxtStokBarang().getText()));
        tokoAtk.setHarga(Integer.parseInt(this.tokoView.getTxtHargaBarang().getText()));
        
        try {
            getTokoAtkService().update(tokoAtk);
            JOptionPane.showMessageDialog(null, "Berhasil mengupdate data barang", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            getAllData();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error saat mengupdate data barang", "Error",
                    JOptionPane.ERROR_MESSAGE);
            clear();
        }
        
    }
    
    
    public void deleteToko(){
         if(this.tokoView.getTxtKodeBarang().getText() == null){
             JOptionPane.showMessageDialog(null, "Data belum dipilih", "Error", 
                     JOptionPane.ERROR_MESSAGE);
         } else {
             TokoAtk tokoAtk = new TokoAtk();
             tokoAtk.setKd_barang((this.tokoView.getTxtKodeBarang().getText()));
             //dicek dulu primary key yg bersangkutan ada atau tidak
             
             int option = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data?", "Warning",
                     JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
             
             if (option == JOptionPane.YES_OPTION){
                 try{
                     getTokoAtkService().delete(tokoAtk);
                     JOptionPane.showMessageDialog(null, "Berhasil Menghapus Barang", "Susccess",
                            JOptionPane.INFORMATION_MESSAGE);
                     clear();
                     getAllData();
                 } catch (Exception e){
                     JOptionPane.showMessageDialog(null, "Error saat menghapus barang", "Error",
                             JOptionPane.ERROR_MESSAGE);
                     clear();
                 }
             }
             
         }
     }
    
    
     public void getAllData(){
         listTokoAtk = getTokoAtkService().getList();//mandapatkan list dulu (query)
         tokoAtkTableModel = new TokoAtkTableModel(listTokoAtk);
         //panggil toko elektronik model untuk dikonvert kedalam bentuk list di table tokoView
         this.tokoView.getTblToko().setModel(tokoAtkTableModel);
         //tampilin listnya di table toko
     }
     
     
     public void getData(){
         int rowIndex = this.tokoView.getTblToko().getSelectedRow();
         this.tokoView.getTxtKodeBarang()
                 .setText(String.valueOf(this.tokoView.getTblToko()
                 .getValueAt(rowIndex, 0)));
         this.tokoView.getTxtNamaBarang()
                 .setText(String.valueOf(this.tokoView.getTblToko()
                 .getValueAt(rowIndex, 1)));
         this.tokoView.getTxtMerkBarang()
                 .setText(String.valueOf(this.tokoView.getTblToko()
                 .getValueAt(rowIndex, 2)));
         this.tokoView.getTxtJenisBarang()
                 .setText(String.valueOf(this.tokoView.getTblToko()
                 .getValueAt(rowIndex, 3)));
         this.tokoView.getTxtStokBarang()
                 .setText(String.valueOf(this.tokoView.getTblToko()
                 .getValueAt(rowIndex, 4)));
         this.tokoView.getTxtHargaBarang()
                 .setText(String.valueOf(this.tokoView.getTblToko()
                 .getValueAt(rowIndex, 5)));
     }
    
    
}
