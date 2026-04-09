package id.co.prg7_sertifikasi.service.impl;

import id.co.prg7_sertifikasi.model.Trsertifikasi;
import id.co.prg7_sertifikasi.model.TrsertifikasiPK;
import id.co.prg7_sertifikasi.repository.TrsertifikasiRepository;
import id.co.prg7_sertifikasi.response.DtoResponse;
import id.co.prg7_sertifikasi.service.TrsertifikasiService;
import id.co.prg7_sertifikasi.vo.TrsertifikasiVoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TrsertifikasiServiceImpl implements TrsertifikasiService {

    @Autowired
    private TrsertifikasiRepository trsertifikasiRepository;

    @Override
    public DtoResponse getAllTrsertifikasi() {
        List<Trsertifikasi> data = trsertifikasiRepository.findAll();
        if (data != null && !data.isEmpty()) {
            return new DtoResponse(200, data);
        }
        return new DtoResponse(200, null, "Data Kosong"); // or mEmptyData
    }

    @Override
    public DtoResponse saveTrsertifikasi(TrsertifikasiVoForm form) {
        try {
            TrsertifikasiPK pk = new TrsertifikasiPK();
            pk.setTsk_id(form.getTsk_id() != null ? form.getTsk_id() : 1); // Or handle auto-increment logic if custom needed
            pk.setUsr_id(form.getUsr_id());
            pk.setDsk_id(form.getDsk_id());

            Trsertifikasi ent = new Trsertifikasi();
            ent.setTrsertifikasiPK(pk);
            ent.setTsk_status(form.getTsk_status());
            ent.setTsk_creaby(form.getTsk_creaby());
            ent.setTsk_creadate(form.getTsk_creadate());
            ent.setTsk_modiby(form.getTsk_modiby());
            ent.setTsk_modidate(form.getTsk_modidate());

            Trsertifikasi saved = trsertifikasiRepository.save(ent);
            return new DtoResponse(200, saved, "Sukses Create Data");
        } catch (Exception e) {
            return new DtoResponse(500, null, "Gagal Create Data");
        }
    }
}
