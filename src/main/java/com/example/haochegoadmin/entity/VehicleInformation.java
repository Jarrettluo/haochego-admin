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
public class VehicleInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * vehicle plate.
     */
    private String vehiclePlate;

    /**
     * vehicle brand.
     */
    private String vehicleBrand;

    /**
     * registration date

     */
    private Date registrationDate;

    private String vehicleColor;

    private Date purchaseDate;

    private Integer purchasePrice;

    private String vehicleNote;

    private Integer saleitemId;

    /**
     * 创建时间

     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    private Integer companyId;


}
