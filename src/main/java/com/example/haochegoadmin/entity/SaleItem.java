package com.example.haochegoadmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jarrett
 * @since 2021-08-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SaleItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer salePrice;

    private Double commissionRate;

    private Integer repairPrice;

    private Integer partnerPrice;

    private Double partnerProfit;

    private Double selfProfit;

    private Date saleDate;

    private Integer vehicleId;

    private Date createdTime;

    private Integer clearState;

    private Float mortgageRebate;

    private Float insuranceRefund;

    private Integer companyId;


}
