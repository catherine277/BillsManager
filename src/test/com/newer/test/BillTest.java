package com.newer.test;

import com.newer.wangjiajie.app.controller.BillController;
import com.newer.wangjiajie.app.domain.Bill;
import com.newer.wangjiajie.app.service.BillService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BillTest {

    @Test
    public void testAdd(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BillService billService = ctx.getBean("billService",BillService.class);
        Bill bill = new Bill();
        bill.setName("小芳");
        bill.setPhone("15632569658");
        bill.setAddress("湖南 永州 鼓楼大街 130号");
        bill.setSender("小强");
        bill.setSname("15636589654");
        System.out.println(billService.addBill(bill));

    }
    @Test
    public void testfindAll(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BillService billService = ctx.getBean("billService",BillService.class);
        billService.findAll(0).forEach(bill -> {
            System.out.println(bill.getName());
        });

    }
    @Test
    public void testUpdate(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BillService billService = ctx.getBean("billService",BillService.class);
        System.out.println(billService.updateBill(3,1));

    }

    @Test
    public void test77(){
        System.out.println("王佳洁是真蠢");

    }
}
