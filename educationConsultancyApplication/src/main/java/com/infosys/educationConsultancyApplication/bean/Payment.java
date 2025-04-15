package com.infosys.educationConsultancyApplication.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @Column(name = "bill_number")
    private String billNumber; // Auto-generated bill number

    @Column(name = "subscription_id")
    private String subscriptionId;

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "installment_no")
    private Integer installmentNo;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "pay_date")
    private String payDate;

    // No-argument constructor
    public Payment() {
    }

    // Parameterized constructor
    public Payment(String billNumber, String subscriptionId, String studentId, Integer installmentNo, Double amount,
                   String payDate) {
        this.billNumber = billNumber;
        this.subscriptionId = subscriptionId;
        this.studentId = studentId;
        this.installmentNo = installmentNo;
        this.amount = amount;
        this.payDate = payDate;
    }

    // Getters and Setters
    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getInstallmentNo() {
        return installmentNo;
    }

    public void setInstallmentNo(Integer installmentNo) {
        this.installmentNo = installmentNo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    @Override
    public String toString() {
        return "Payment [billNumber=" + billNumber + ", subscriptionId=" + subscriptionId + ", studentId=" + studentId
                + ", installmentNo=" + installmentNo + ", amount=" + amount + ", payDate=" + payDate + "]";
    }
}
