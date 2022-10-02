package com.bantanger.demo.design;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/1 21:58
 */
class DecorationPackageControllerTest {

    @Test
    void getMatterList() {
        DecorationPackageController decoration = new DecorationPackageController();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));
        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));
        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));
    }
}