package com.lc.tt.lc.api;

import com.lc.tt.lc.core.entity.TSupplier;
import com.lc.tt.lc.core.service.TSupplierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SpApi {

    @Autowired
    TSupplierService tSupplierService;

    @PostMapping("sp/add")
    private void add(@RequestBody TSupplier tSupplier){
        tSupplierService.add(tSupplier);
    }

    @GetMapping("sp/select")
    private TSupplier select(String id){
        log.info("---fucna十大按我说的就阿瑟东---------"+id);
        return tSupplierService.select(id);
    }

    @GetMapping("sp/select1")
    private TSupplier select1(String id){
        log.info("---fucna十大按我说的就阿瑟东---------"+id);
        return tSupplierService.select(id);
    }


}
