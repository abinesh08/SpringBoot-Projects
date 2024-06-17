package com.abiproject.taskmanager.Service;

import com.abiproject.taskmanager.Entity.Task;
import com.abiproject.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);

    }
    public Task createTask(Task task){

        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task edit){
        Task task=taskRepository.findById(id).orElseThrow(()-> new RuntimeException("task not available"));
        task.setTitle(edit.getTitle());
        task.setDescription(edit.getDescription());
        task.setCompleted(edit.getCompleted());

        return taskRepository.save(task);
    }

    public void deleteTask(Long id){
        Task task=taskRepository.findById(id).orElseThrow(()->new RuntimeException("task not available"));
        taskRepository.delete(task);
    }

}
