package id.co.asm1_prg7_040.service.impl;

import id.co.asm1_prg7_040.dao.ModulDao;
import id.co.asm1_prg7_040.service.ModulService;
import id.co.asm1_prg7_040.vo.ModulVo;
import id.co.asm1_prg7_040.vo.ModulVoForm;
import org.springframework.stereotype.Service;

@Service
public class ModulServiceImpl implements ModulService {

    private final ModulDao modulDao;

    public ModulServiceImpl(ModulDao modulDao) {
        this.modulDao = modulDao;
    }

    @Override
    public ModulVo getModulById(int id) {
        return modulDao.getModulById(id);
    }

    @Override
    public void editDataModul(int id, ModulVoForm form) {
        modulDao.editDataModul(id, form);
    }

    @Override
    public void removeDataModul(int id) {
        modulDao.removeDataModul(id);
    }
}
