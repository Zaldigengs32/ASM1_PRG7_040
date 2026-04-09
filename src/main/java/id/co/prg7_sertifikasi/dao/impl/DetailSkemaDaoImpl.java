package id.co.prg7_sertifikasi.dao.impl;

import id.co.prg7_sertifikasi.dao.DetailSkemaDao;
import id.co.prg7_sertifikasi.model.DetailSkema;
import id.co.prg7_sertifikasi.model.Prodi;
import id.co.prg7_sertifikasi.model.Skema;
import id.co.prg7_sertifikasi.repository.DetailSkemaRepository;
import id.co.prg7_sertifikasi.repository.ProdiRepository;
import id.co.prg7_sertifikasi.repository.SkemaRepository;
import id.co.prg7_sertifikasi.vo.DetailSkemaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DetailSkemaDaoImpl implements DetailSkemaDao {

    @Autowired
    private DetailSkemaRepository detailSkemaRepository;

    @Autowired
    private SkemaRepository skemaRepository;

    @Autowired
    private ProdiRepository prodiRepository;

    @Override
    public List<DetailSkemaVo> getAllDetailSkemas() {
        Iterable<DetailSkema> detailSkemas = detailSkemaRepository.findAll();
        List<DetailSkemaVo> detailSkemaVos = new ArrayList<>();
        for (DetailSkema item: detailSkemas) {
            DetailSkemaVo detailSkemaVo = new DetailSkemaVo(item);

            Skema skema = skemaRepository.findById(detailSkemaVo.getSkmId()).orElse(null);
            if (skema != null) {
                detailSkemaVo.setSkmDesc(skema.getSkm_nama());
            }

            Prodi prodi = prodiRepository.findById(detailSkemaVo.getProId()).orElse(null);
            if (prodi != null) {
                detailSkemaVo.setProDesc(prodi.getProdi());
            }

            detailSkemaVos.add(detailSkemaVo);
        }
        return detailSkemaVos;
    }

    @Override
    public List<DetailSkemaVo> getDetailSkemaActive() {
        Iterable<DetailSkema> detailSkemas = detailSkemaRepository.findByStatus(1);
        List<DetailSkemaVo> detailSkemaVos = new ArrayList<>();
        for (DetailSkema item: detailSkemas) {
            DetailSkemaVo detailSkemaVo = new DetailSkemaVo(item);

            Skema skema = skemaRepository.findById(detailSkemaVo.getSkmId()).orElse(null);
            if (skema != null) {
                detailSkemaVo.setSkmDesc(skema.getSkm_nama());
            }

            Prodi prodi = prodiRepository.findById(detailSkemaVo.getProId()).orElse(null);
            if (prodi != null) {
                detailSkemaVo.setProDesc(prodi.getProdi());
            }

            detailSkemaVos.add(detailSkemaVo);
        }
        return detailSkemaVos;
    }
}
