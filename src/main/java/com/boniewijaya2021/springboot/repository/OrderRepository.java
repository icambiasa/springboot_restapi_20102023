package com.boniewijaya2021.springboot.repository;

import com.boniewijaya2021.springboot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
