package ru.ryahov.spring.springbootreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ryahov.spring.springbootreact.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}