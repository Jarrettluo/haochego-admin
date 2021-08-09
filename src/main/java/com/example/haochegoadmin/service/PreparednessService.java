package com.example.haochegoadmin.service;

import com.example.haochegoadmin.entity.OperationLog;
import com.example.haochegoadmin.entity.Partner;
import com.example.haochegoadmin.entity.Preparedness;
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
public interface PreparednessService extends IService<Preparedness> {

    ApiResult add(Preparedness preparedness);
    ApiResult getAll();
    ApiResult getAllByVehicleId(Integer vehicleId);
    ApiResult delete(Integer id);
    ApiResult deleteByVehicleId(Integer vehicleId);
    ApiResult getOne();
    ApiResult put();

}
