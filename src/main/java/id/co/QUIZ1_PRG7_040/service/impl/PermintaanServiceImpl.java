package id.co.QUIZ1_PRG7_040.service.impl;

import id.co.QUIZ1_PRG7_040.dao.PermintaanDao;
import id.co.QUIZ1_PRG7_040.model.Permintaan;
import id.co.QUIZ1_PRG7_040.service.PermintaanService;
import id.co.QUIZ1_PRG7_040.vo.PermintaanVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermintaanServiceImpl implements PermintaanService {

    private final PermintaanDao permintaanDao;

    public PermintaanServiceImpl(PermintaanDao permintaanDao) {
        this.permintaanDao = permintaanDao;
    }

    @Override
    public List<PermintaanVo> getAllPermintaan() {
        return permintaanDao.getAllPermintaan();
    }

    @Override
    public void savePermintaan(Permintaan permintaan) {
        permintaanDao.savePermintaan(permintaan);
    }
}
