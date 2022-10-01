package com.bantanger.demo.design;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/1 20:35
 */
public class AnswerQuestion {

    private String name; // 问题
    private String key; // 答案

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
