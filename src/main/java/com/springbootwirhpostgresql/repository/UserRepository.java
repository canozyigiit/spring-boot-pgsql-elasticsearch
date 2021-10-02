package com.springbootwirhpostgresql.repository;

import com.springbootwirhpostgresql.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, Integer> {
}
