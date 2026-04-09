package id.co.prg7_sertifikasi.repository;

import id.co.prg7_sertifikasi.model.DetailSkema;
import id.co.prg7_sertifikasi.model.DetailSkemaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailSkemaRepository extends JpaRepository<DetailSkema, DetailSkemaPK> {

    @Procedure(procedureName = "get_active_detail_skema")
    List<DetailSkema> findByStatus(int status);
}
