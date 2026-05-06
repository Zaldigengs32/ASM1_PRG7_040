package id.co.asm1_prg7_040.rest;

import id.co.asm1_prg7_040.model.Karyawan;
import id.co.asm1_prg7_040.service.KaryawanService;
import id.co.asm1_prg7_040.vo.KaryawanVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/karyawan")
public class KaryawanRest {

    private final KaryawanService karyawanService;

    public KaryawanRest(KaryawanService karyawanService) {
        this.karyawanService = karyawanService;
    }

    @GetMapping("/getAllDataKaryawan")
    public ResponseEntity<List<KaryawanVo>> getAllDataKaryawan() {
        List<KaryawanVo> karyawanList = karyawanService.getAllDataKaryawan();
        return new ResponseEntity<>(karyawanList, HttpStatus.OK);
    }

    @PostMapping("/addDataKaryawan")
    public ResponseEntity<String> addDataKaryawan(@RequestBody Karyawan karyawan) {
        karyawanService.saveKaryawan(karyawan);
        return new ResponseEntity<>("Data Karyawan berhasil ditambahkan", HttpStatus.CREATED);
    }
}
