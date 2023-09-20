package kf.monster.depot.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("APP_CUSTOMER_customerService")
public class CustomerService {
}
