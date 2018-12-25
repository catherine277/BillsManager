package com.newer.wangjiajie.app.dao;

import com.newer.wangjiajie.app.domain.Bill;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/*
Bill的数据操作类
 */
public interface BillMapper {
    //新增货单
    @Insert("insert into bills values(null,#{name},#{phone},#{address},#{sender},#{sname},0)")
    int addBill(Bill bill);
    //查询全部0：收单货单
    @Select("select * from bills where status=#{status}")
    List<Bill> findAll(@Param("status")int status);
    //更新货单的状态
    @Update("update bills set status=#{status} where id=#{id}")
    int updateBill(@Param("status")int status,@Param("id")int id);
}
