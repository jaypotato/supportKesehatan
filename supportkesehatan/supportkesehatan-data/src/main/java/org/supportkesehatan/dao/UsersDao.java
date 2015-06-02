package org.supportkesehatan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.supportkesehatan.domain.Users;

import java.util.List;
import java.util.UUID;

public interface UsersDao {
	public Users findByIdAndPassword(String id, String password);
}
