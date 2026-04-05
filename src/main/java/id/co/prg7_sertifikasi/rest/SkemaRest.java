package id.co.prg7_sertifikasi.rest;

import id.co.prg7_sertifikasi.model.Skema;
import id.co.prg7_sertifikasi.response.DtoResponse;
import id.co.prg7_sertifikasi.service.SkemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skemas")
public class SkemaRest {

    @Autowired
    private SkemaService skemaService;

    public SkemaRest(SkemaService skemaService) {
        this.skemaService = skemaService;
    }

    @GetMapping("/getSkemas")
    public DtoResponse getSkemas() {
        return skemaService.getAllSkemas();
    }

    @GetMapping("/getSkemaActive")
    public DtoResponse getSkemaActive() {
        return skemaService.getSkemaActive();
    }

    @PostMapping("/saveSkema")
    public DtoResponse createSkema(@RequestBody Skema skema) {
        return skemaService.saveSkema(skema);
    }

    @PostMapping("/updateSkema")
    public DtoResponse updateSkema(@RequestBody Skema skema) {
        return skemaService.updateSkema(skema);
    }

    @PostMapping("/deleteSkema")
    public DtoResponse deleteSkema(@RequestBody Skema skema) {
        return skemaService.deleteSkema(skema);
    }
}
