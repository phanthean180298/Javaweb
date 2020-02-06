package trieu.metech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import trieu.metech.com.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}