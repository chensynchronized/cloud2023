package com.chm.service;

import com.chm.dao.PaymentDao;
import com.chm.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PaymentServiceImpl implements PaymentService{
        @Resource
        private PaymentDao paymentDao;


        @Override
        public int create(Payment payment)
        {
            return paymentDao.create(payment);
        }

        @Override
        public Payment getPaymentById(Long id)
        {
            return paymentDao.getPaymentById(id);
        }
    }


