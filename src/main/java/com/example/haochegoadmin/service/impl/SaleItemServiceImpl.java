package com.example.haochegoadmin.service.impl;

import com.example.haochegoadmin.entity.OperationLog;
import com.example.haochegoadmin.entity.SaleItem;
import com.example.haochegoadmin.mapper.SaleItemMapper;
import com.example.haochegoadmin.service.SaleItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.utils.ApiResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jarrett
 * @since 2021-08-04
 */
@Service
public class SaleItemServiceImpl extends ServiceImpl<SaleItemMapper, SaleItem> implements SaleItemService {

    public List<OperationLog> queryByCompanyId(Integer companyId) {
        return null;
    }

    @Override
    public ApiResult getAll() {
        return null;
    }

    @Override
    public ApiResult delete(Integer id) {
        return null;
    }

    @Override
    public ApiResult deletebyVehicleId(Integer vehicleId) {
        return null;
    }

    @Override
    public ApiResult getOne(Integer id) {
        return null;
    }

    @Override
    public ApiResult getOnebyVehicleId(Integer vehicleId) {
        return null;
    }

    @Override
    public ApiResult put(SaleItem saleItem) {
        return null;
    }
}
