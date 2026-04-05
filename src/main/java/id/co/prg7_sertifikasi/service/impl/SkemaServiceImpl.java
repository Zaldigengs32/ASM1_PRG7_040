package id.co.prg7_sertifikasi.service.impl;

import id.co.prg7_sertifikasi.dao.SkemaDao;
import id.co.prg7_sertifikasi.repository.SkemaRepository;
import id.co.prg7_sertifikasi.response.DtoResponse;
import id.co.prg7_sertifikasi.service.SkemaService;
import id.co.prg7_sertifikasi.model.Skema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static id.co.prg7_sertifikasi.constant.SkemaConstant.*;

@Service
@Transactional
public class SkemaServiceImpl implements SkemaService {

    @Autowired
    private SkemaDao skemaDao;

    @Autowired
    private SkemaRepository skemaRepository;

    @Override
    public DtoResponse getAllSkemas() {
        if(skemaDao.getAllSkemas() != null) {
            return new DtoResponse(200, skemaDao.getAllSkemas());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse getSkemaActive() {
        if(skemaDao.getSkemaActive() != null) {
            return new DtoResponse(200, skemaDao.getSkemaActive());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse saveSkema(Skema skema) {
        try {
            skema.setSkm_creadate(new java.util.Date());
            if (skema.getSkm_creaby() == null) {
                skema.setSkm_creaby(1);
            }
            skemaRepository.save(skema);
            return new DtoResponse(200, skema, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, skema, mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateSkema(Skema skema) {
        try {
            java.util.Optional<Skema> existingOpt = skemaRepository.findById(skema.getSkm_id());
            if (existingOpt.isPresent()) {
                Skema existing = existingOpt.get();
                if (skema.getSkm_nama() == null) skema.setSkm_nama(existing.getSkm_nama());
                if (skema.getSkm_deskripsi() == null) skema.setSkm_deskripsi(existing.getSkm_deskripsi());
                if (skema.getSkm_prasyarat() == null) skema.setSkm_prasyarat(existing.getSkm_prasyarat());
                if (skema.getSkm_kontak() == null) skema.setSkm_kontak(existing.getSkm_kontak());
                if (skema.getSkm_biaya() == null) skema.setSkm_biaya(existing.getSkm_biaya());
                if (skema.getSkm_status() == null) skema.setSkm_status(existing.getSkm_status());
                if (skema.getSkm_creaby() == null) skema.setSkm_creaby(existing.getSkm_creaby());
                if (skema.getSkm_creadate() == null) skema.setSkm_creadate(existing.getSkm_creadate());
            }
            skema.setSkm_modidate(new java.util.Date());
            if (skema.getSkm_modiby() == null) {
                skema.setSkm_modiby(1);
            }
            Skema updatedSkema = skemaRepository.save(skema);
            if (updatedSkema != null) {
                return new DtoResponse(200, updatedSkema, mUpdateSuccess);
            } else {
                return new DtoResponse(404, null, mNotFound);
            }
        } catch (Exception e) {
            return new DtoResponse(500, null, mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteSkema(Skema skema) {
        Skema skemaData = skemaRepository.findById(skema.getSkm_id()).orElseThrow();
        if(skemaData != null) {
            try {
                skemaRepository.delete(skema);
                return new DtoResponse(200, skemaData, mDeleteSuccess);
            } catch (Exception e) {
                return new DtoResponse(500, skemaData, mDeleteFailed);
            }
        }
        return new DtoResponse(404, null, mNotFound);
    }
}
