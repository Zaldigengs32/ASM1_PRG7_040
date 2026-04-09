package id.co.prg7_sertifikasi.rest;

import id.co.prg7_sertifikasi.response.DtoResponse;
import id.co.prg7_sertifikasi.service.TrsertifikasiService;
import id.co.prg7_sertifikasi.vo.TrsertifikasiVoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trsertifikasi")
public class TrsertifikasiRest {

    @Autowired
    private TrsertifikasiService trsertifikasiService;

    @GetMapping("/getAllTrsertifikasi")
    public DtoResponse getAllTrsertifikasi() {
        return trsertifikasiService.getAllTrsertifikasi();
    }

    @PostMapping("/saveTrsertifikasi")
    public DtoResponse saveTrsertifikasi(@RequestBody TrsertifikasiVoForm form) {
        return trsertifikasiService.saveTrsertifikasi(form);
    }
}
