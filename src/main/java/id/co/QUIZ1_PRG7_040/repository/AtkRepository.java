package id.co.QUIZ1_PRG7_040.repository;

import id.co.QUIZ1_PRG7_040.model.Atk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtkRepository extends JpaRepository<Atk, Integer> {
    @Query("SELECT a FROM Atk a WHERE a.status = 'Aktif'")
    List<Atk> findAllActive();
}
