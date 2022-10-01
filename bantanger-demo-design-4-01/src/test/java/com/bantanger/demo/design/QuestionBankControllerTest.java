package com.bantanger.demo.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/1 20:46
 */
class QuestionBankControllerTest {

    @Test
    void createPaper() {
        QuestionBankController questionBankController = new QuestionBankController();
        // 为考试人生成试卷
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }
}