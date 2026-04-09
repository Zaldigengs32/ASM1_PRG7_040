package id.co.prg7_sertifikasi.service.impl;

import id.co.prg7_sertifikasi.dao.DetailSkemaDao;
import id.co.prg7_sertifikasi.repository.DetailSkemaRepository;
import id.co.prg7_sertifikasi.repository.ProdiRepository;
import id.co.prg7_sertifikasi.repository.SkemaRepository;
import id.co.prg7_sertifikasi.response.DtoResponse;
import id.co.prg7_sertifikasi.service.DetailSkemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import id.co.prg7_sertifikasi.model.DetailSkema;
import id.co.prg7_sertifikasi.model.DetailSkemaPK;
import id.co.prg7_sertifikasi.vo.DetailSkemaVo;
import id.co.prg7_sertifikasi.vo.DetailSkemaVoForm;

import java.util.List;

import static id.co.prg7_sertifikasi.constant.DetailSkemaConstant.mEmptyData;
import static id.co.prg7_sertifikasi.constant.DetailSkemaConstant.mCreateSuccess;
import static id.co.prg7_sertifikasi.constant.DetailSkemaConstant.mCreateFailed;
import static id.co.prg7_sertifikasi.constant.DetailSkemaConstant.mUpdateSuccess;
import static id.co.prg7_sertifikasi.constant.DetailSkemaConstant.mUpdateFailed;
import static id.co.prg7_sertifikasi.constant.DetailSkemaConstant.mNotFound;
import static id.co.prg7_sertifikasi.constant.DetailSkemaConstant.mDeleteSuccess;
import static id.co.prg7_sertifikasi.constant.DetailSkemaConstant.mDeleteFailed;

@Service
@Transactional
public class DetailSkemaServiceImpl implements DetailSkemaService {

    @Autowired
    private DetailSkemaDao detailSkemaDao;

    @Autowired
    private DetailSkemaRepository detailSkemaRepository;

    @Autowired
    private ProdiRepository prodiRepository;

    @Autowired
    private SkemaRepository skemaRepository;

    @Override
    public DtoResponse getAllDetailSkemas() {
        if (detailSkemaDao.getAllDetailSkemas() != null) {
            return new DtoResponse(200, detailSkemaDao.getAllDetailSkemas());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse getDetailSkemaActive() {
        if (detailSkemaDao.getDetailSkemaActive() != null) {
            return new DtoResponse(200, detailSkemaDao.getDetailSkemaActive());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse saveDetailSkema(DetailSkemaVoForm detailSkemaVoForm) {
        try{
            if (detailSkemaVoForm.getSkmId() == null || detailSkemaVoForm.getProId() == null ||
                !skemaRepository.existsById(detailSkemaVoForm.getSkmId()) || 
                !prodiRepository.existsById(detailSkemaVoForm.getProId())) {
                return new DtoResponse(404, null, "Scheme or Study Program is invalid");
            }

            DetailSkemaPK detailSkemaPK = new DetailSkemaPK();
            detailSkemaPK.setPro_id(detailSkemaVoForm.getProId());
            detailSkemaPK.setSkm_id(detailSkemaVoForm.getSkmId());
            List<DetailSkemaVo> listData = detailSkemaDao.getAllDetailSkemas();
            if(listData.isEmpty()) {
                detailSkemaPK.setDsk_id(1);
            } else {
                DetailSkemaVo lastData = listData.get(listData.size() - 1);
                detailSkemaPK.setDsk_id(lastData.getDskId()+1);
            }

            DetailSkema DetailSkema = new DetailSkema();
            DetailSkema.setDetailSkemaPK(detailSkemaPK);
            DetailSkema.setDsk_tanggal_mulai(detailSkemaVoForm.getTanggalMulai());
            DetailSkema.setDsk_tanggal_berakhir(detailSkemaVoForm.getTanggalBerakhir());
            DetailSkema.setDsk_total_peserta(detailSkemaVoForm.getTotalPeserta());
            DetailSkema.setDsk_kompeten(detailSkemaVoForm.getKompeten());
            DetailSkema.setDsk_belum_kompeten(detailSkemaVoForm.getBelumKompeten());
            DetailSkema.setDsk_tidak_hadir(detailSkemaVoForm.getTidakHadir());
            DetailSkema.setDsk_status(detailSkemaVoForm.getStatus());
            DetailSkema.setDsk_creaby(detailSkemaVoForm.getCreaby());
            DetailSkema.setDsk_credate(detailSkemaVoForm.getCreadate());
            DetailSkema.setDsk_modiby(detailSkemaVoForm.getModiby());
            DetailSkema.setDsk_modidate(detailSkemaVoForm.getModidate());

            id.co.prg7_sertifikasi.model.DetailSkema detailSkema = detailSkemaRepository.save(DetailSkema);
            return new DtoResponse(200,detailSkema,mCreateSuccess);

        }catch (Exception e){
            return new DtoResponse(500,detailSkemaVoForm,mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateDetailSkema(DetailSkemaVoForm detailSkemaVoForm) {
        try{
            DetailSkemaPK detailSkemaPK = new DetailSkemaPK();
            detailSkemaPK.setPro_id(detailSkemaVoForm.getProId());
            detailSkemaPK.setSkm_id(detailSkemaVoForm.getSkmId());
            detailSkemaPK.setDsk_id(detailSkemaVoForm.getDskId());

            DetailSkema detailSkema = detailSkemaRepository.findById(detailSkemaPK).orElse(null);
            if(detailSkema != null){
                if(detailSkemaVoForm.getTanggalMulai() != null) detailSkema.setDsk_tanggal_mulai(detailSkemaVoForm.getTanggalMulai());
                if(detailSkemaVoForm.getTanggalBerakhir() != null) detailSkema.setDsk_tanggal_berakhir(detailSkemaVoForm.getTanggalBerakhir());
                if(detailSkemaVoForm.getTotalPeserta() != null) detailSkema.setDsk_total_peserta(detailSkemaVoForm.getTotalPeserta());
                if(detailSkemaVoForm.getKompeten() != null) detailSkema.setDsk_kompeten(detailSkemaVoForm.getKompeten());
                if(detailSkemaVoForm.getBelumKompeten() != null) detailSkema.setDsk_belum_kompeten(detailSkemaVoForm.getBelumKompeten());
                if(detailSkemaVoForm.getTidakHadir() != null) detailSkema.setDsk_tidak_hadir(detailSkemaVoForm.getTidakHadir());
                if(detailSkemaVoForm.getStatus() != null) detailSkema.setDsk_status(detailSkemaVoForm.getStatus());
                if(detailSkemaVoForm.getCreaby() != null) detailSkema.setDsk_creaby(detailSkemaVoForm.getCreaby());
                if(detailSkemaVoForm.getCreadate() != null) detailSkema.setDsk_credate(detailSkemaVoForm.getCreadate());
                if(detailSkemaVoForm.getModiby() != null) detailSkema.setDsk_modiby(detailSkemaVoForm.getModiby());
                if(detailSkemaVoForm.getModidate() != null) detailSkema.setDsk_modidate(detailSkemaVoForm.getModidate());

                DetailSkema updatedDetailskema = detailSkemaRepository.save(detailSkema);
                return new DtoResponse(200,updatedDetailskema, mUpdateSuccess);
            } else {
                return new DtoResponse(404, null,mNotFound);
            }
        }catch (Exception e){
            return new DtoResponse(500, null, mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteDetailSkema(DetailSkemaVoForm detailSkemaVoForm) {
        DetailSkemaPK detailSkemaPK = new DetailSkemaPK();
        detailSkemaPK.setPro_id(detailSkemaVoForm.getProId());
        detailSkemaPK.setSkm_id(detailSkemaVoForm.getSkmId());
        detailSkemaPK.setDsk_id(detailSkemaVoForm.getDskId());

        DetailSkema detailSkemaData = detailSkemaRepository.findById(detailSkemaPK).orElseThrow();
        if(detailSkemaData != null){
            try {
                detailSkemaRepository.delete(detailSkemaData);
                return new DtoResponse(200,detailSkemaVoForm, mDeleteSuccess);
            }catch (Exception e){
                return new DtoResponse(500,detailSkemaVoForm, mDeleteFailed);
            }
        }
        return new DtoResponse(404, null,mNotFound);
    }
}
