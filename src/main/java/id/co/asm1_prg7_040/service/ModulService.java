package id.co.asm1_prg7_040.service;

import id.co.asm1_prg7_040.vo.ModulVo;
import id.co.asm1_prg7_040.vo.ModulVoForm;

public interface ModulService {

    ModulVo getModulById(int id);

    void editDataModul(int id, ModulVoForm form);

    void removeDataModul(int id);
}
