package com.example.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.app.entity.User;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  protected User() {}

  public User(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("{id:%d,name:%s}", id, name);
  }

  @Repository
  public interface UserRepository extends CrudRepository<User, Long> {
  }
}
