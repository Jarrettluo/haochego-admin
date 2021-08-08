package com.example.haochegoadmin.service;

import com.example.haochegoadmin.entity.OperationLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jarrett
 * @since 2021-08-04
 */
public interface OperationLogService extends IService<OperationLog> {

    List<OperationLog> queryByCompanyId(Integer companyId);

}
