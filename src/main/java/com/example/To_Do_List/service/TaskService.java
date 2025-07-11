package com.example.To_Do_List.service;

import com.example.To_Do_List.model.Task;
import com.example.To_Do_List.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TaskService {

    @Autowired
    private TaskRepo taskrepo;
    public List<Task> getAllTask() {
        return taskrepo.findAll();
    }

    public Task addTask(Task task) {
        System.out.println(task.toString());
          return taskrepo.save(task);

    }


    public Task updateTask(int id, Task taskDetials) {
        Task task=taskrepo.findById(id).orElseThrow(()->new RuntimeException("No found"));
        task.setText(taskDetials.getText());
        task.setPriority(taskDetials.getPriority());
        task.setCompleted(taskDetials.getCompleted());
        return task;
    }


    public void deleteTask(int id) {
        Task task=taskrepo.findById(id).orElseThrow();
        taskrepo.delete(task);
    }
}
