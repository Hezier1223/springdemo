package com.hezier.demo.service;

import com.hezier.demo.bean.PersonBean;
import com.hezier.demo.mapper.PersonRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    private JdbcTemplate jdbcTemplate;

    //@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(PersonBean person) {
        // TODO Auto-generated method stub
        jdbcTemplate.update("INSERT INTO person(name) VALUES(?)", new Object[]{person.getName()},
                new int[]{java.sql.Types.VARCHAR});
    }

    @Override
    public void update(PersonBean person) {
        // TODO Auto-generated method stub
        jdbcTemplate.update("UPDATE person SET name=? WHERE id=?", new Object[]{person.getName(), person.getId()},
                new int[]{java.sql.Types.VARCHAR, java.sql.Types.INTEGER});
    }

    @Override
    public PersonBean getPerson(int id) {
        // TODO Auto-generated method stub
        return (PersonBean) jdbcTemplate.queryForObject("SELECT * FROM person WHERE id=?", new Object[]{id},
                new int[]{java.sql.Types.INTEGER}, new PersonRowMapper());
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<PersonBean> getPersonBean() {
        // TODO Auto-generated method stub
        return (List<PersonBean>) jdbcTemplate.query("SELECT * FROM person", new PersonRowMapper());
    }

    @Override
    public void delete(int personid) {
        // TODO Auto-generated method stub
        jdbcTemplate.update("DELETE FROM person  WHERE id=?", new Object[]{personid},
                new int[]{java.sql.Types.INTEGER});
    }
}
