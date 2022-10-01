package com.bantanger.demo.design.util;

import java.util.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 编号乱序生成类
 * (因为每个考生能看到的题目一定是一致的，只是顺序不同，
 * 所以本质上是对同一份试卷的多次备份，是使用原型模式的最好例子）
 * @Date 2022/10/1 20:56
 */
public class TopicRandomUtil {

    /**
     * 乱序Map元素，记录对应的答案key
     * @param option 题目
     * @param key 答案
     * @return Topic 乱序后 {A = c. B = d. C = a. D = b.}
     */
    static public Topic random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList); // 使用shuffle API将列表元素顺序随机打乱
        HashMap<String, String> optionNew = new HashMap<>();
        int idx = 0;
        String keyNew = ""; // 记录新答案的key
        for(String next : keySet) {
            String randomKey = keyList.get(idx ++);
            if(key.equals(next)) { // 找到打乱后的答案位置
                keyNew = randomKey; // 记录新答案的key
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }
}
