package id.co.QUIZ1_PRG7_040.repository;

import id.co.QUIZ1_PRG7_040.model.Skema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SkemaRepository extends JpaRepository<Skema, Integer> {
    @Query("SELECT s FROM Skema s WHERE s.status = 1")
    List<Skema> findAllActive();
}
