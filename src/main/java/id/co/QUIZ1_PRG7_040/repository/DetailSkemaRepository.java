package id.co.QUIZ1_PRG7_040.repository;

import id.co.QUIZ1_PRG7_040.model.DetailSkema;
import id.co.QUIZ1_PRG7_040.model.DetailSkemaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailSkemaRepository extends JpaRepository<DetailSkema, DetailSkemaPK> {
}
