package kf.monster.depot.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfiguration
{
    @Bean
    public OrderController orderController()
    {
        return new OrderController();
    }

    @Bean
    public OrderRepository orderRepository()
    {
        return new OrderRepository();
    }

    @Bean
    public OrderService orderService()
    {
        return new OrderService();
    }
}
