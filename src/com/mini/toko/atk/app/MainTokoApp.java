/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mini.toko.atk.app;

import com.mini.toko.atk.view.TokoView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mini.toko.atk.service.TokoAtkService;

/**
 *
 * @author Bhaskara
 */
public class MainTokoApp {
    private static ApplicationContext appContext;
    
    public static void main(String[] args){
        appContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        new TokoView().setVisible(true);//guinya ditampilkan
    }
    
    public static TokoAtkService getTokoAtkService(){
        return (TokoAtkService) appContext.getBean("TokoAtkService");
    }
    
}
