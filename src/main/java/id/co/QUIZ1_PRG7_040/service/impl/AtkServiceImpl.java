package id.co.QUIZ1_PRG7_040.service.impl;

import id.co.QUIZ1_PRG7_040.dao.AtkDao;
import id.co.QUIZ1_PRG7_040.model.Atk;
import id.co.QUIZ1_PRG7_040.service.AtkService;
import id.co.QUIZ1_PRG7_040.vo.AtkVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtkServiceImpl implements AtkService {

    private final AtkDao atkDao;

    public AtkServiceImpl(AtkDao atkDao) {
        this.atkDao = atkDao;
    }

    @Override
    public List<AtkVo> getAllActiveAtk() {
        return atkDao.getAllActiveAtk();
    }

    @Override
    public AtkVo getAtkById(int id) {
        return atkDao.getAtkById(id);
    }

    @Override
    public void saveAtk(Atk atk) {
        atkDao.saveAtk(atk);
    }

    @Override
    public void updateAtk(Atk atk) {
        atkDao.updateAtk(atk);
    }

    @Override
    public void removeAtk(int id) {
        atkDao.removeAtk(id);
    }
}
