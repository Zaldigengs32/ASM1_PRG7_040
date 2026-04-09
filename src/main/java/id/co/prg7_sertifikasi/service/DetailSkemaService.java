package id.co.prg7_sertifikasi.service;

import id.co.prg7_sertifikasi.response.DtoResponse;

import id.co.prg7_sertifikasi.vo.DetailSkemaVoForm;

public interface DetailSkemaService {
    DtoResponse getAllDetailSkemas();
    DtoResponse getDetailSkemaActive();

    DtoResponse saveDetailSkema(DetailSkemaVoForm detailSkemaVoForm);
    
    DtoResponse updateDetailSkema(DetailSkemaVoForm detailSkemaVoForm);
    
    DtoResponse deleteDetailSkema(DetailSkemaVoForm detailSkemaVoForm);
}
