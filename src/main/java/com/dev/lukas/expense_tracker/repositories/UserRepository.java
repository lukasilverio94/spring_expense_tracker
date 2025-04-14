package com.dev.lukas.expense_tracker.repositories;

import com.dev.lukas.expense_tracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
