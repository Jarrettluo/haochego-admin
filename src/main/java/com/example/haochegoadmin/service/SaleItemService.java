package com.example.haochegoadmin.service;

import com.example.haochegoadmin.entity.OperationLog;
import com.example.haochegoadmin.entity.Partner;
import com.example.haochegoadmin.entity.SaleItem;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.utils.ApiResult;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jarrett
 * @since 2021-08-04
 */
public interface SaleItemService extends IService<SaleItem> {

    ApiResult add(SaleItem saleItem);
    ApiResult getAll();
    ApiResult delete(Integer id);
    ApiResult deletebyVehicleId(Integer vehicleId);
    ApiResult getOne(Integer id);
    ApiResult getOnebyVehicleId(Integer vehicleId);
    ApiResult put(SaleItem saleItem);

}
