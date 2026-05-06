package id.co.asm1_prg7_040.dao.impl;

import id.co.asm1_prg7_040.dao.ModulDao;
import id.co.asm1_prg7_040.model.Modul;
import id.co.asm1_prg7_040.repository.ModulRepository;
import id.co.asm1_prg7_040.vo.ModulVo;
import id.co.asm1_prg7_040.vo.ModulVoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ModulDaoImpl implements ModulDao {

    @Autowired
    private ModulRepository modulRepository;

    @Override
    public ModulVo getModulById(int id) {
        Optional<Modul> modulOpt = modulRepository.findById(id);
        return modulOpt.map(ModulVo::new).orElse(null);
    }

    @Override
    public void editDataModul(int id, ModulVoForm form) {
        Optional<Modul> modulOpt = modulRepository.findById(id);
        if (modulOpt.isPresent()) {
            Modul modul = modulOpt.get();
            if (form.getVersiModul() != null) {
                modul.setVersiModul(form.getVersiModul());
            }
            if (form.getStatusModul() != null) {
                modul.setStatusModul(form.getStatusModul());
            }
            modulRepository.save(modul);
        }
    }

    @Override
    public void removeDataModul(int id) {
        Optional<Modul> modulOpt = modulRepository.findById(id);
        if (modulOpt.isPresent()) {
            Modul modul = modulOpt.get();
            // status_modul: 0 = Tidak Aktif, 1 = Aktif
            modul.setStatusModul(0);
            modulRepository.save(modul);
        }
    }
}
