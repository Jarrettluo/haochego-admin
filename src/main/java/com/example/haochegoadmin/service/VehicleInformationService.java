package com.example.haochegoadmin.service;

import com.example.haochegoadmin.entity.OperationLog;
import com.example.haochegoadmin.entity.VehicleInformation;
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
public interface VehicleInformationService extends IService<VehicleInformation> {

    ApiResult getAll();
    ApiResult getSaledbyCompanyId(Integer companyId);
    ApiResult getUnsaledbyCompanyId(Integer companyId);
    ApiResult delete(Integer id);
    ApiResult deletebyCompanyId(Integer companyId);
    ApiResult getOne();
    ApiResult put(VehicleInformation vehicleInformation);

}
