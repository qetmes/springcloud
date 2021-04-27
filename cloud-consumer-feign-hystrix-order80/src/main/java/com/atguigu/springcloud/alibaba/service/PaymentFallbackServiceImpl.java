package com.atguigu.springcloud.alibaba.service;


import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentHystrixService fall back-paymentInfo_OK, 呜呜呜";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentHystrixService fall back-paymentInfo_TimeOut, 呜呜呜";
    }
}
