package id.co.prg7_sertifikasi.service;

import id.co.prg7_sertifikasi.model.Skema;
import id.co.prg7_sertifikasi.response.DtoResponse;

public interface SkemaService {
    DtoResponse getAllSkemas();
    DtoResponse getSkemaActive();
    DtoResponse saveSkema(Skema skema);
    DtoResponse updateSkema(Skema skema);
    DtoResponse deleteSkema(Skema skema);
}
