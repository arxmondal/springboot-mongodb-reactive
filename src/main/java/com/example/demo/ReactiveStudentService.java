package com.example.demo;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReactiveStudentService {

    private final ReactiveStudentRepository reactiveStudentRepository;
    
    public ReactiveStudentService(ReactiveStudentRepository reactiveStudentRepository) {
    	this.reactiveStudentRepository = reactiveStudentRepository;
    }

    public Flux<Student> getAllStudents() {
        return reactiveStudentRepository.findAll();
    }

    public Mono<Student> getStudentById(String id) {
        return reactiveStudentRepository.findById(id);
    }

    public Mono<Student> saveStudent(Student student) {
        return reactiveStudentRepository.save(student);
    }

    public Flux<Student> getStudentsByAge(int age) {
        return reactiveStudentRepository.findByAge(age);
    }

    public Mono<Void> deleteStudent(String id) {
        return reactiveStudentRepository.deleteById(id);
    }
}
