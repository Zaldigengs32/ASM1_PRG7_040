package id.co.prg7_sertifikasi.repository;

import id.co.prg7_sertifikasi.model.Prodi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdiRepository extends JpaRepository<Prodi, Integer> {
}
