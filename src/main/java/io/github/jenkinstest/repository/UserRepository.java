package io.github.jenkinstest.repository;

import io.github.jenkinstest.model.JenkinsUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<JenkinsUser, Integer> {
}