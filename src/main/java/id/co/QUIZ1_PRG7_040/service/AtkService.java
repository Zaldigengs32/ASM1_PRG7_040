package id.co.QUIZ1_PRG7_040.service;

import id.co.QUIZ1_PRG7_040.model.Atk;
import id.co.QUIZ1_PRG7_040.vo.AtkVo;

import java.util.List;

public interface AtkService {

    List<AtkVo> getAllActiveAtk();

    AtkVo getAtkById(int id);

    void saveAtk(Atk atk);

    void updateAtk(Atk atk);

    void removeAtk(int id);
}
