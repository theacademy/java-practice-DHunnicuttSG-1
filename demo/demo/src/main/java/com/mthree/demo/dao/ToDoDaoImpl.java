package com.mthree.demo.dao;

import com.mthree.demo.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ToDoDaoImpl implements ToDoDao {

    private final JdbcTemplate jdbc;

    @Autowired
    public ToDoDaoImpl(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<ToDo> getAll() {
        String sql = "select * from todo";
        return jdbc.query(sql, new ToDoMapper());
    }

    @Override
    public ToDo add(ToDo todo) {
        String sql = "insert into todo(todo, note) values(?,?)";
        jdbc.update(sql, todo.getTodo(), todo.getNote());

        int newId = jdbc.queryForObject("select LAST_INSERT_ID();", Integer.class );
        todo.setId(newId);
        return todo;
    }

    @Override
    public ToDo findById(int id) {
        String sql = "select * from todo where id = ?";
        return jdbc.queryForObject(sql, new ToDoMapper(), id);
    }

    @Override
    public boolean update(ToDo todo) {
        String sql = "update todo set todo=?, note=?, finished=? where id = ?";
        return jdbc.update(sql, todo.getTodo(), todo.getNote(), todo.isFinished(), todo.getId()) > 0;
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from todo where id = ?";
        return jdbc.update(sql, id) > 0;
    }

    private static final class ToDoMapper implements RowMapper<ToDo> {

        @Override
        public ToDo mapRow(ResultSet rs, int rowNum) throws SQLException {
            ToDo td = new ToDo();
            td.setId(rs.getInt("id"));
            td.setTodo(rs.getString("todo"));
            td.setNote(rs.getString("note"));
            td.setFinished(rs.getBoolean("finished"));
            return td;
        }
    }
}
