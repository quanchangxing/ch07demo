package dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dao.UserMapper;
import entity.User;

public class UserMapperImpl implements UserMapper {
	
	private SqlSessionTemplate sqlSession;

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<User> getUserList(User user) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("dao.UserMapper.getUserList",user);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
