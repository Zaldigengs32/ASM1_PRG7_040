package id.co.prg7_sertifikasi.rest;

import id.co.prg7_sertifikasi.response.DtoResponse;
import id.co.prg7_sertifikasi.service.DetailSkemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import id.co.prg7_sertifikasi.vo.DetailSkemaVoForm;

@RestController
@RequestMapping("/detailskemas")
public class DetailSkemaRest {

    @Autowired
    private DetailSkemaService detailSkemaService;

    public DetailSkemaRest(DetailSkemaService detailSkemaService) {
        this.detailSkemaService = detailSkemaService;
    }

    @GetMapping("/getDetailSkemas")
    public DtoResponse getDetailSkemas() {
        return detailSkemaService.getAllDetailSkemas();
    }

    @GetMapping("/getDetailSkemaActive")
    public DtoResponse getDetailSkemaActive() {
        return detailSkemaService.getDetailSkemaActive();
    }

    @PostMapping("/saveDetailSkema")
    public DtoResponse createDetailSkema(@RequestBody DetailSkemaVoForm detailSkemaVoForm) {
        return detailSkemaService.saveDetailSkema(detailSkemaVoForm);
    }

    @PostMapping("/updateDetailSkema")
    public DtoResponse updateProdi(@RequestBody DetailSkemaVoForm detailSkemaVoForm) {
        return detailSkemaService.updateDetailSkema(detailSkemaVoForm);
    }

    @PostMapping("/deleteDetailSkema")
    public DtoResponse deleteDetailSkema(@RequestBody DetailSkemaVoForm detailSkemaVoForm) {
        return detailSkemaService.deleteDetailSkema(detailSkemaVoForm);
    }
}
