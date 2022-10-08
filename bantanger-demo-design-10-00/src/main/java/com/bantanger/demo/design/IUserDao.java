package com.bantanger.demo.design;

import com.bantanger.demo.design.agent.Select;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description DAO层
 * @Date 2022/10/6 19:08
 */
public interface IUserDao {

    @Select("select userName from user where id = # {uId}")
    String queryUserInfo(String uId);

}
