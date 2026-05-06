package id.co.asm1_prg7_040.rest;

import id.co.asm1_prg7_040.service.ModulService;
import id.co.asm1_prg7_040.vo.ModulVo;
import id.co.asm1_prg7_040.vo.ModulVoForm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/modul")
public class ModulRest {

    private final ModulService modulService;

    public ModulRest(ModulService modulService) {
        this.modulService = modulService;
    }

    @PutMapping("/editDataModul/{id}")
    public ResponseEntity<String> editDataModul(@PathVariable int id, @RequestBody ModulVoForm form) {
        ModulVo existingModul = modulService.getModulById(id);
        if (existingModul != null) {
            modulService.editDataModul(id, form);
            return new ResponseEntity<>("Data Modul berhasil diupdate", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Data Modul tidak ditemukan", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/removeDataModul/{id}")
    public ResponseEntity<String> removeDataModul(@PathVariable int id) {
        ModulVo existingModul = modulService.getModulById(id);
        if (existingModul != null) {
            modulService.removeDataModul(id);
            return new ResponseEntity<>("Status Modul berhasil diubah menjadi Tidak Aktif", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Data Modul tidak ditemukan", HttpStatus.NOT_FOUND);
        }
    }
}
