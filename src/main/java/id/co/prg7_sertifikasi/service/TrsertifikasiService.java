package id.co.prg7_sertifikasi.service;

import id.co.prg7_sertifikasi.response.DtoResponse;
import id.co.prg7_sertifikasi.vo.TrsertifikasiVoForm;

public interface TrsertifikasiService {
    DtoResponse getAllTrsertifikasi();
    DtoResponse saveTrsertifikasi(TrsertifikasiVoForm form);
}
