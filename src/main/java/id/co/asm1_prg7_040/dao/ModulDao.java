package id.co.asm1_prg7_040.dao;

import id.co.asm1_prg7_040.vo.ModulVo;
import id.co.asm1_prg7_040.vo.ModulVoForm;

public interface ModulDao {

    ModulVo getModulById(int id);

    void editDataModul(int id, ModulVoForm form);

    void removeDataModul(int id);
}
