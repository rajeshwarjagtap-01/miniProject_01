package com.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.plan;
@Repository
public interface planRepo extends JpaRepository <plan,Integer> {

}
