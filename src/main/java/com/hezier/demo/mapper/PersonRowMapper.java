package com.hezier.demo.mapper;

import com.hezier.demo.bean.PersonBean;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper {

    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
//        JSONArray jsonArray = new JSONArray();
//        jsonArray.add(0, "ZHULI");
//        jsonArray.add(1, "30");
//        jsonArray.add(2, "ALI");
//        System.out.println("jsonArray1：" + jsonArray);
        PersonBean personBean = new PersonBean(resultSet.getString("name"));
        personBean.setId(resultSet.getInt("id"));
//        JSONObject personJson = JSONObject.fromObject(personBean);
//        System.out.println(personJson);
        return personBean;
    }
}
