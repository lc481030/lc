package com.lc.tt.lc.core.mapper;

import com.lc.tt.lc.core.entity.TSupplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TSupplierMapper {

    void insert(TSupplier tSupplier);

    TSupplier selectByPrimaryKey(@Param("pid") String pid);
}
