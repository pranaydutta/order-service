package com.aws.cp.dao;

import com.aws.cp.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders()
    {
        return Stream.of(
                new Order(101, "Mobile", 200,1200),
                new Order(102, "Book", 999, 2000),
                new Order(278, "Book", 1466, 3522),
                new Order(953, "Jeans", 4499, 1555)

        ).collect(Collectors.toList());
    }
}
