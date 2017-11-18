package com.hezier.demo.service;

import com.hezier.demo.bean.PersonBean;

import java.util.List;

public interface PersonService {
    //保存
    public void save(PersonBean person);

    //更新
    public void update(PersonBean person);

    //获取person
    public PersonBean getPerson(int id);

    public List<PersonBean> getPersonBean();

    //删除记录
    public void delete(int personid);
}
