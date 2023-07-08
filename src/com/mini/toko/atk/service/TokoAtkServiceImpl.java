/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mini.toko.atk.service;

import com.mini.toko.atk.model.TokoAtk;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mini.toko.atk.dao.TokoAtkDao;

/**
 *
 * @author Bhaskara
 */

@Service("TokoAtkService")
@Transactional(readOnly = true)
public class TokoAtkServiceImpl implements TokoAtkService {

    @Autowired
    private TokoAtkDao tokoAtkDao;
    
    @Transactional
    @Override
    public void save(TokoAtk toko) {
        tokoAtkDao.save(toko);
    }

    @Transactional
    @Override
    public void delete(TokoAtk toko) {
         tokoAtkDao.delete(toko);
    }

    @Transactional
    @Override
    public void update(TokoAtk toko) {
         tokoAtkDao.update(toko);
    }

    @Override
    public List<TokoAtk> getList() {
        return tokoAtkDao.getList();
    }
    
}
