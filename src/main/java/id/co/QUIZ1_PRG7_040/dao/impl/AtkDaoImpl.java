package id.co.QUIZ1_PRG7_040.dao.impl;

import id.co.QUIZ1_PRG7_040.dao.AtkDao;
import id.co.QUIZ1_PRG7_040.model.Atk;
import id.co.QUIZ1_PRG7_040.repository.AtkRepository;
import id.co.QUIZ1_PRG7_040.vo.AtkVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AtkDaoImpl implements AtkDao {

    @Autowired
    private AtkRepository atkRepository;

    @Override
    public List<AtkVo> getAllActiveAtk() {
        List<Atk> atkList = atkRepository.findAllActive();
        List<AtkVo> atkVos = new ArrayList<>();
        for (Atk atk : atkList) {
            atkVos.add(new AtkVo(atk));
        }
        return atkVos;
    }

    @Override
    public AtkVo getAtkById(int id) {
        Optional<Atk> atkOpt = atkRepository.findById(id);
        if (atkOpt.isPresent()) {
            return new AtkVo(atkOpt.get());
        }
        return null;
    }

    @Override
    public void saveAtk(Atk atk) {
        atkRepository.save(atk);
    }

    @Override
    public void updateAtk(Atk atk) {
        Optional<Atk> existingOpt = atkRepository.findById(atk.getIdAtk());
        if (existingOpt.isPresent()) {
            Atk existing = existingOpt.get();
            if (atk.getAtk() == null) atk.setAtk(existing.getAtk());
            if (atk.getStok() == null) atk.setStok(existing.getStok());
            if (atk.getStatus() == null) atk.setStatus(existing.getStatus());
            atkRepository.save(atk);
        } else {
            atkRepository.save(atk);
        }
    }

    @Override
    public void removeAtk(int id) {
        Optional<Atk> atkOpt = atkRepository.findById(id);
        if (atkOpt.isPresent()) {
            Atk atk = atkOpt.get();
            atk.setStatus("Tidak Aktif");
            atkRepository.save(atk);
        }
    }
}
