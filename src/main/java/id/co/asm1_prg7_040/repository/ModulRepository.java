package id.co.asm1_prg7_040.repository;

import id.co.asm1_prg7_040.model.Modul;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModulRepository extends JpaRepository<Modul, Integer> {
}
