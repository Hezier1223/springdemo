package com.hezier.demo.mapper;

import com.hezier.demo.bean.PersonBean;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper {

    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        PersonBean personBean = new PersonBean(resultSet.getString("name"));
        personBean.setId(resultSet.getInt("id"));
        return personBean;
    }
}
