package id.co.asm1_prg7_040.rest;

import id.co.asm1_prg7_040.model.AksesModul;
import id.co.asm1_prg7_040.service.AksesModulService;
import id.co.asm1_prg7_040.vo.AksesModulVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aksesmodul")
public class AksesModulRest {

    private final AksesModulService aksesModulService;

    public AksesModulRest(AksesModulService aksesModulService) {
        this.aksesModulService = aksesModulService;
    }

    @PostMapping("/addDataAksesModul")
    public ResponseEntity<String> addDataAksesModul(@RequestBody AksesModul aksesModul) {
        String validationMessage = aksesModulService.validateAksesModul(
                aksesModul.getIdKaryawan(), aksesModul.getIdModul());

        if (validationMessage != null) {
            return new ResponseEntity<>(validationMessage, HttpStatus.BAD_REQUEST);
        }

        aksesModulService.saveAksesModul(aksesModul);
        return new ResponseEntity<>("Data Akses Modul berhasil ditambahkan", HttpStatus.CREATED);
    }

    @GetMapping("/getAllDataAksesModul")
    public ResponseEntity<List<AksesModulVo>> getAllDataAksesModul() {
        List<AksesModulVo> aksesModulList = aksesModulService.getAllDataAksesModul();
        return new ResponseEntity<>(aksesModulList, HttpStatus.OK);
    }
}
