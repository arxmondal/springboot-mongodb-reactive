package com.example.demo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ReactiveStudentRepository extends ReactiveMongoRepository<Student, String> {
    Flux<Student> findByAge(int age);
}