package kosariev.cs22m.nosql.lab3.repository;

import kosariev.cs22m.nosql.lab3.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
