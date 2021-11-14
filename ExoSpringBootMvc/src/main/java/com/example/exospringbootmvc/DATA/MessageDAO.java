package com.example.exospringbootmvc.DATA;

import com.example.exospringbootmvc.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface MessageDAO extends JpaRepository<Message, Long> {
}
