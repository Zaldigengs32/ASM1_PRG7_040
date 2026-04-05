package id.co.prg7_sertifikasi.repository;

import id.co.prg7_sertifikasi.model.Skema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import static id.co.prg7_sertifikasi.constant.SkemaConstant.qAllDataActive;

@Repository
public interface SkemaRepository extends JpaRepository<Skema, Integer> {

    @Query(value = qAllDataActive, nativeQuery = true)
    List<Skema> findByStatus(int status);
}
