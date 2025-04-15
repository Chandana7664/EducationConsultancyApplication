package com.infosys.educationConsultancyApplication.dao;

import com.infosys.educationConsultancyApplication.bean.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentDaoImpl implements PaymentDao {

    @Autowired
    private PaymentRepository repository;

    @Override
    public void save(Payment payment) {
        repository.save(payment);
    }

    @Override
    public Payment getPaymentByBill(String billNumber) {
        return repository.findById(billNumber).orElse(null);
    }

    @Override
    public List<Payment> getAllPayments() {
        return repository.findAll();
    }

    @Override
    public List<Payment> getPaymentsBySubscriptionId(String subscriptionId) {
        return repository.getBillBySubscriptionId(subscriptionId);
    }

    @Override
    public List<Payment> getPaymentsByStudentId(String studentId) {
        return repository.getBillByStudentId(studentId);
    }

    @Override
    public String generateNewBillNumber() {
        String lastBill = repository.getMaxBillNumber();
        Long id = 100001L; // Starting ID for bill numbers
        if (lastBill != null && lastBill.startsWith("BL")) {
            id = Long.parseLong(lastBill.substring(2)) + 1;
        }
        return "BL" + id;
    }
}
