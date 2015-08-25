package com.pdsu.edu.service;

import java.util.List;

import com.pdsu.edu.domain.User;

/**
 * ��˵����
 * 
 * @author ����: LiuJunGuang
 * @version ����ʱ�䣺2012-3-25 ����02:31:11
 */
public interface UserService {

	// ����û�
	public abstract void addUser(User user);

	public abstract void updateUser(User user);

	public abstract void deleteUser(Integer userId);

	public abstract User findUserById(Integer userId);

	public abstract List<User> findAllUser();

	public abstract User login(User user);

}