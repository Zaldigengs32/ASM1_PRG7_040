package id.co.QUIZ1_PRG7_040.rest;

import id.co.QUIZ1_PRG7_040.model.Atk;
import id.co.QUIZ1_PRG7_040.service.AtkService;
import id.co.QUIZ1_PRG7_040.vo.AtkVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atk")
public class AtkRest {

    private final AtkService atkService;

    public AtkRest(AtkService atkService) {
        this.atkService = atkService;
    }

    @GetMapping("/getAllDataATK")
    public ResponseEntity<List<AtkVo>> getAllDataATK() {
        List<AtkVo> atkList = atkService.getAllActiveAtk();
        return new ResponseEntity<>(atkList, HttpStatus.OK);
    }

    @PostMapping("/addDataATK")
    public ResponseEntity<String> addDataATK(@RequestBody Atk atk) {
        atkService.saveAtk(atk);
        return new ResponseEntity<>("Data ATK berhasil ditambahkan", HttpStatus.CREATED);
    }

    @PutMapping("/editDataATK/{id}")
    public ResponseEntity<String> editDataATK(@PathVariable int id, @RequestBody Atk atk) {
        AtkVo existingAtk = atkService.getAtkById(id);
        if (existingAtk != null) {
            atk.setIdAtk(id);
            atkService.updateAtk(atk);
            return new ResponseEntity<>("Data ATK berhasil diupdate", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Data ATK tidak ditemukan", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/removeDataATK/{id}")
    public ResponseEntity<String> removeDataATK(@PathVariable int id) {
        AtkVo existingAtk = atkService.getAtkById(id);
        if (existingAtk != null) {
            atkService.removeAtk(id);
            return new ResponseEntity<>("Status ATK berhasil diubah menjadi Tidak Aktif", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Data ATK tidak ditemukan", HttpStatus.NOT_FOUND);
        }
    }
}
