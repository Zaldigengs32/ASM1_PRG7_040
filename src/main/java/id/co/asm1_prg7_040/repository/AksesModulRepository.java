package id.co.asm1_prg7_040.repository;

import id.co.asm1_prg7_040.model.AksesModul;
import id.co.asm1_prg7_040.model.AksesModulPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AksesModulRepository extends JpaRepository<AksesModul, AksesModulPK> {
}
