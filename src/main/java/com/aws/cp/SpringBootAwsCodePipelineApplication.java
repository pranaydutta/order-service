package com.aws.cp;

import com.aws.cp.dao.OrderDao;
import com.aws.cp.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootAwsCodePipelineApplication {

	@Autowired
	private OrderDao orderDao;

	@GetMapping
	public List<Order> fetchOrders()
	{
		//System.out.println("order-service");
		return orderDao.getOrders();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsCodePipelineApplication.class, args);
	}

}
