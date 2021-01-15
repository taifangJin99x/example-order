package com.example.order.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @className: com.example.order.orderservice.entity-> Order
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 11:31
 * @version: 1.0
 * @todo:
 */
@Data
@Accessors(chain = true)
@TableName("order_tbl")
public class Order {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String userId;
    private String commodityCode;
    private Integer count;
    private BigDecimal money;
}
