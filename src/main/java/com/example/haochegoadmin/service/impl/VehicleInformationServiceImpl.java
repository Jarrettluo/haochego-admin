package com.example.haochegoadmin.service.impl;

import com.example.haochegoadmin.entity.VehicleInformation;
import com.example.haochegoadmin.mapper.VehicleInformationMapper;
import com.example.haochegoadmin.service.VehicleInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class VehicleInformationServiceImpl extends ServiceImpl<VehicleInformationMapper, VehicleInformation> implements VehicleInformationService {
    @Override
    public List<VehicleInformation> queryByCompanyId(Integer companyId) {
        return null;
    }
}
