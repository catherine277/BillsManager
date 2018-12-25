package com.newer.wangjiajie.app.service;

import com.newer.wangjiajie.app.domain.Bill;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BillService {

    int addBill(Bill bill);

    List<Bill> findAll(@Param("status")int status);

    int updateBill(@Param("status")int status,@Param("id")int id);
}
