package com.abiproject.taskmanager.repository;

import com.abiproject.taskmanager.Entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {


}
