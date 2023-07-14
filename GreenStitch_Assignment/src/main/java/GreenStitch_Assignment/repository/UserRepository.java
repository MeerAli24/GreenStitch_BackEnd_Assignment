package GreenStitch_Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import GreenStitch_Assignment.entity.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	 User findByUsername(String username);
}
