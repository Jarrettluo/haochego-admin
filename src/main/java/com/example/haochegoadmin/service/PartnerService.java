package com.example.haochegoadmin.service;

import com.example.haochegoadmin.entity.OperationLog;
import com.example.haochegoadmin.entity.Partner;
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
public interface PartnerService extends IService<Partner> {

    ApiResult getAll();
    ApiResult getAllbyVehicleId(Integer vehicleId);
    ApiResult delete(Integer id);
    ApiResult deletebyVehicleId(Integer vehicleId);
    ApiResult getOne();
    ApiResult put(Partner partner);

}
