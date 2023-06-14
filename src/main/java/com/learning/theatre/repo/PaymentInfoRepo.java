package com.learning.theatre.repo;

import com.learning.theatre.model.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, Long> {
}
