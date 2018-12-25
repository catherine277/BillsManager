package com.newer.wangjiajie.app.controller;

import com.newer.wangjiajie.app.dao.BillMapper;
import com.newer.wangjiajie.app.domain.Bill;
import com.newer.wangjiajie.app.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bills")
public class BillController {

    @Autowired
    private BillService billService;

    //查询所有没有发货的订单以及查询所有正在派送中的订单
    @GetMapping(value = "/{status}")
    public Map<String,Object> findAll(@PathVariable("status")int status){
        Map<String,Object> map = new HashMap<>();
        List<Bill> bills = billService.findAll(status);
        if(bills.isEmpty()){
            map.put("msg","没有订单");
        }else{
            map.put("bills",bills);
        }
        return map;
    }

    //新增订单
    @PostMapping
    public Map<String,Object> addBill(Bill bill){
        Map<String,Object> map = new HashMap<>();
        int count = billService.addBill(bill);
        if(count>0){
            map.put("count",count);
        }else{
            map.put("count",2);
        }
        return map;
    }

    //修改订单
    @PutMapping(value = "/{id}")
    public Map<String,Object> updateBill(@PathVariable("id")int id){
        Map<String,Object> map = new HashMap<>();
        int count = billService.updateBill(1,id);
        if(count>0){
            map.put("count",count);
        }else{
            map.put("count",2);
        }
        return map;
    }




}
