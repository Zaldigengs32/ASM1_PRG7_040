package id.co.prg7_sertifikasi.rest;

import id.co.prg7_sertifikasi.constant.ProdiConstant;
import id.co.prg7_sertifikasi.constant.UserConstant;
import id.co.prg7_sertifikasi.model.Prodi;
import id.co.prg7_sertifikasi.model.User;
import id.co.prg7_sertifikasi.service.ProdiService;
import id.co.prg7_sertifikasi.vo.ProdiVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prodis")
public class ProdiRest {

    private final ProdiService prodiService;

    public ProdiRest(ProdiService prodiService) {
        this.prodiService = prodiService;
    }

    @GetMapping("/getProdis")
    public ResponseEntity<List<ProdiVo>> getProdis() {
        List<ProdiVo> prodis = prodiService.getProdis();
        return new ResponseEntity<>(prodis, HttpStatus.OK);
    }

    @PostMapping("/saveProdi")
    public ResponseEntity<String> createProdi(@RequestBody Prodi prodi) {
        int nextId = ProdiConstant.prodis.size() + 1;
        prodi.setId(nextId);
        prodiService.saveProdi(prodi);
        return new ResponseEntity<>(ProdiConstant.mCreateSuccess, HttpStatus.CREATED);
    }

    @GetMapping("/getProdi/{id}")
    public ResponseEntity<ProdiVo> getProdiById(@PathVariable int id) {
        ProdiVo prodi = prodiService.getProdiById(id);
        if (prodi != null) {
            return new ResponseEntity<>(prodi, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateProdi/{id}")
    public ResponseEntity<String> updateProdi(@PathVariable int id, @RequestBody Prodi updatedProdi) {
        ProdiVo existingProdi = prodiService.getProdiById(id);
        if (existingProdi != null) {
            updatedProdi.setId(id);
            prodiService.updateProdi(updatedProdi);
            return new ResponseEntity<>(ProdiConstant.mUpdateSuccess, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(ProdiConstant.mNotFound, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteProdi/{id}")
    public ResponseEntity<String> deleteProdi(@PathVariable int id) {
        ProdiVo existingProdi = prodiService.getProdiById(id);
        if (existingProdi != null) {
            prodiService.deleteProdi(id);
            return new ResponseEntity<>(ProdiConstant.mDeleteSuccess, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(ProdiConstant.mNotFound, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getByUsername")
    public ResponseEntity<ProdiVo> getProdiByUsername(@RequestParam String username) {
        ProdiVo prodi = prodiService.getProdiByUsername(username);
        if (prodi != null) {
            return new ResponseEntity<>(prodi, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
