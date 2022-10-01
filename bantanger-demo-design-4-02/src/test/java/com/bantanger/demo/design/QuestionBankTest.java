package com.bantanger.demo.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/1 21:31
 */
class QuestionBankTest {

    @Test
    public void ApiTest() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }

}