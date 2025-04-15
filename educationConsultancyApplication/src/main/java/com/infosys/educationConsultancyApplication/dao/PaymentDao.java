package com.infosys.educationConsultancyApplication.dao;

import com.infosys.educationConsultancyApplication.bean.Payment;
import java.util.List;

public interface PaymentDao {
    void save(Payment payment);
    Payment getPaymentByBill(String billNumber);
    List<Payment> getAllPayments();
    List<Payment> getPaymentsBySubscriptionId(String subscriptionId);
    List<Payment> getPaymentsByStudentId(String studentId);
    String generateNewBillNumber();
}
