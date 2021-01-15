package com.example.order.repository;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.example.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @className: com.example.order.orderservice.repository-> OrderDAO
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:05
 * @version: 1.0
 * @todo:
 */
@Mapper
@Repository
public interface OrderDAO extends BaseMapper<Order> {

}
