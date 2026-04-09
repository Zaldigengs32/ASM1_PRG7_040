package id.co.prg7_sertifikasi.repository;

import id.co.prg7_sertifikasi.model.Trsertifikasi;
import id.co.prg7_sertifikasi.model.TrsertifikasiPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrsertifikasiRepository extends JpaRepository<Trsertifikasi, TrsertifikasiPK> {
}
