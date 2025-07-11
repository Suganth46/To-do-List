package com.example.To_Do_List.controller;

import com.example.To_Do_List.model.Task;
import com.example.To_Do_List.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tasks")
public class ToDoController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTask(){
          return taskService.getAllTask();
    }

    @PostMapping
    public Task addTask(@RequestBody Task newTask){
        System.out.println(newTask.toString());
        newTask.setCreatedAt(LocalDateTime.now());
        return taskService.addTask(newTask);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id,@RequestBody Task taskDetials){
        System.out.println(taskDetials.toString());
        return taskService.updateTask(id,taskDetials);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable int id){
        taskService.deleteTask(id);
        return ResponseEntity.ok().build();
    }
}
