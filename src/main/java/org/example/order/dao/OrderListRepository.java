package org.example.order.dao;

import org.example.order.domain.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderListRepository extends JpaRepository<OrderList, Long> {
}
