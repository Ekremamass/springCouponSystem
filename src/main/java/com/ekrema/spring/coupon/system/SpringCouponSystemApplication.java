package com.ekrema.spring.coupon.system;

import com.ekrema.spring.coupon.system.Utils.Art;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableScheduling
public class SpringCouponSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCouponSystemApplication.class, args);
	}

}
