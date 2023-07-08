/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mini.toko.atk.dao;

import com.mini.toko.atk.model.TokoAtk;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bhaskara
 */
@Repository
public class TokoAtkImpl implements TokoAtkDao {
    
    @Autowired
    private SessionFactory sessionFactory; //koneksi ke dalam database
    
//    public TokoElektronikImpl (SessionFactory sessionFactory){
//        this.sessionFactory = sessionFactory;
//    }

    @Override
    public void save(TokoAtk toko) {
        sessionFactory.getCurrentSession().save(toko);
//       Session session = sessionFactory.openSession(); //izin koneksi ke database
//       try{
//           session.beginTransaction();//melakukan transaksi
//           session.save(toko);//implementasi save, ini sama seperti insert
//           session.getTransaction().commit();//apa yg sudah kita input, akan dimasukkan ke database
//       } catch (Exception e){
//           System.err.print("Tidak bisa menyimmpan barang");
//           session.getTransaction().rollback();//tidak jadi simpan
//       } finally {
//           session.close();
//       }
    }

    @Override
    public void delete(TokoAtk toko) {
        sessionFactory.getCurrentSession().delete(toko);
//       Session session = sessionFactory.openSession();//izin koneksi ke database
//       try{
//           session.beginTransaction();//melakukan transaksi
//           session.delete(toko);//implementasi save, ini sama seperti delete (Query)
//           session.getTransaction().commit();//apa yg sudah kita input, akan dimasukkan ke database
//       } catch (Exception e){
//           System.err.print("Tidak bisa menyimmpan barang");
//           session.getTransaction().rollback();//tidak jadi simpan
//       } finally {
//           session.close();
//       }
    }

    @Override
    public void update(TokoAtk toko) {
        sessionFactory.getCurrentSession().update(toko);
//       Session session = sessionFactory.openSession();//izin koneksi ke database
//       try{
//           session.beginTransaction();//melakukan transaksi
//           session.update(toko);//implementasi save, ini sama seperti insert
//           session.getTransaction().commit();//apa yg sudah kita input, akan dimasukkan ke database
//       } catch (Exception e){
//           System.err.print("Tidak bisa menyimmpan barang");
//           session.getTransaction().rollback();//tidak jadi simpan
//       } finally {
//           session.close();
//       }
    }

//    @Override
//    public TokoElektronik get(String kd_barang) {
//       Session session = sessionFactory.openSession();//izin koneksi ke database
//       try{
//           session.beginTransaction();//melakukan transaksi
//           TokoElektronik toko = (TokoElektronik) session.get(TokoElektronik.class, kd_barang);
//           //cek semua kolom di table (mappinng), trs dia cari kolom berdasarkan primary key 
//           session.getTransaction().commit();
//           return toko;
//       } catch (Exception e){
//           System.err.print("Tidak bisa mendapatkan barang" + e);
//           session.getTransaction().rollback();//tidak jadi simpan
//           return null;//gagal koneksi, row tadi yg tadi dipilih gajadi di click
//       } finally {
//           session.close();
//       }
//    }

    @Override
    public List<TokoAtk> getList() {
        return sessionFactory.getCurrentSession().createCriteria(TokoAtk.class).list();
//       Session session = sessionFactory.openSession();//izin koneksi ke database
//       try{
//           session.beginTransaction();//melakukan transaksi
//           List<TokoElektronik> listbarang = session.createCriteria(TokoElektronik.class).list();
//           //ini bentuknya array
//           session.getTransaction().commit();
//           return listbarang;
//       } catch (Exception e){
//           System.err.print("Tidak bisa menampilkan barang" + e);
//           session.getTransaction().rollback();
//           return null;//data yg ditampilkan kosong
//       } finally {
//           session.close();
//       }
    }
    
    
    
    
}
