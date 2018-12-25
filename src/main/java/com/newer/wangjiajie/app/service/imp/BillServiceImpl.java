package com.newer.wangjiajie.app.service.imp;

import com.newer.wangjiajie.app.dao.BillMapper;
import com.newer.wangjiajie.app.domain.Bill;
import com.newer.wangjiajie.app.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("billService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int addBill(Bill bill) {
        return billMapper.addBill(bill);
    }

    @Override

    public List<Bill> findAll(int status) {
        return billMapper.findAll(status);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int updateBill(int status, int id) {
        return billMapper.updateBill(status,id);
    }
}
