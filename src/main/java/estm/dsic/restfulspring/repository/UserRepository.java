package estm.dsic.restfulspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import estm.dsic.restfulspring.Models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
