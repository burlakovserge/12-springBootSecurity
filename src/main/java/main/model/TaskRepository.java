package main.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {
}
