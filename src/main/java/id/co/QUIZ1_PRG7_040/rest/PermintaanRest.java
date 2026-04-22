package id.co.QUIZ1_PRG7_040.rest;

import id.co.QUIZ1_PRG7_040.model.Permintaan;
import id.co.QUIZ1_PRG7_040.service.PermintaanService;
import id.co.QUIZ1_PRG7_040.vo.PermintaanVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permintaan")
public class PermintaanRest {

    private final PermintaanService permintaanService;

    public PermintaanRest(PermintaanService permintaanService) {
        this.permintaanService = permintaanService;
    }

    @PostMapping("/addDataPermintaan")
    public ResponseEntity<String> addDataPermintaan(@RequestBody Permintaan permintaan) {
        permintaanService.savePermintaan(permintaan);
        return new ResponseEntity<>("Data Permintaan berhasil ditambahkan", HttpStatus.CREATED);
    }

    @GetMapping("/getAllDataPermintaan")
    public ResponseEntity<List<PermintaanVo>> getAllDataPermintaan() {
        List<PermintaanVo> permintaanList = permintaanService.getAllPermintaan();
        return new ResponseEntity<>(permintaanList, HttpStatus.OK);
    }
}
