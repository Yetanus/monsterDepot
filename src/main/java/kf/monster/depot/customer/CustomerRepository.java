package kf.monster.depot.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("APP_CUSTOMER_customerRepository")
public class CustomerRepository {
}
