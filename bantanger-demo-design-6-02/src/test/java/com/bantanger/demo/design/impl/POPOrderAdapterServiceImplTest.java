package com.bantanger.demo.design.impl;

import com.bantanger.demo.design.OrderAdapterService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/2 21:30
 */
class POPOrderAdapterServiceImplTest {

    @Test
    public void test_itfAdapter() {
        OrderAdapterService popOrderAdapterService = new POPOrderAdapterServiceImpl();
        System.out.println("判断首单，接口适配(POP)：" + popOrderAdapterService.isFirst("100001"));

        OrderAdapterService insideOrderService = new InsideOrderService();
        System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("100001"));
    }

}