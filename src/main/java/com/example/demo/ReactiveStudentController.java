package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/students/reactive")
public class ReactiveStudentController {

    @Autowired
    private ReactiveStudentService reactiveStudentService;

    @GetMapping
    public Flux<Student> getAllStudents() {
        return reactiveStudentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Mono<Student> getStudentById(@PathVariable String id) {
        return reactiveStudentService.getStudentById(id);
    }

    @PostMapping
    public Mono<Student> saveStudent(@RequestBody Student student) {
        return reactiveStudentService.saveStudent(student);
    }

    @GetMapping("/age/{age}")
    public Flux<Student> getStudentsByAge(@PathVariable int age) {
        return reactiveStudentService.getStudentsByAge(age);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteStudent(@PathVariable String id) {
        return reactiveStudentService.deleteStudent(id);
    }
}