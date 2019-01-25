package com.lc.tt.lc.core.service;

import com.lc.tt.lc.core.entity.TSupplier;
import com.lc.tt.lc.core.mapper.TSupplierMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TSupplierService {

    @Resource
    TSupplierMapper tSupplierMapper;

    public void add(TSupplier tSupplier) {
        tSupplierMapper.insert(tSupplier);
    }

    public TSupplier select(String id) {
        return tSupplierMapper.selectByPrimaryKey(id);
    }
}
