package id.co.QUIZ1_PRG7_040.repository;

import id.co.QUIZ1_PRG7_040.model.Permintaan;
import id.co.QUIZ1_PRG7_040.model.PermintaanPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermintaanRepository extends JpaRepository<Permintaan, PermintaanPK> {
}
