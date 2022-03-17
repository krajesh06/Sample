package com.bike.dao;


import java.util.List;

import com.bike.Exception.DBException;
import com.bike.model.User;

public interface UserDAO {

      void register(User user) throws DBException;

	List<User> findAll()throws DBException;

}
