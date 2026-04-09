package id.co.prg7_sertifikasi.vo;

import id.co.prg7_sertifikasi.model.DetailSkema;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Date;

@JsonPropertyOrder({
        "dskId",
        "skmId",
        "skmDesc",
        "proId",
        "proDesc",
        "tanggalMulai",
        "tanggalBerakhir",
        "totalPeserta",
        "kompeten",
        "belumKompeten",
        "tidakHadir",
        "status"
})
public class DetailSkemaVo implements Serializable {

    private Integer dskId;
    private Integer skmId;
    private String skmDesc;
    private Integer proId;
    private String proDesc;
    private Date tanggalMulai;
    private Date tanggalBerakhir;
    private Integer totalPeserta;
    private Integer kompeten;
    private Integer belumKompeten;
    private Integer tidakHadir;
    private Integer status;

    public DetailSkemaVo() {
    }

    public DetailSkemaVo(DetailSkema detailSkema) {
        this.dskId = detailSkema.getDetailSkemaPK().getDsk_id();
        this.skmId = detailSkema.getDetailSkemaPK().getSkm_id();
        this.proId = detailSkema.getDetailSkemaPK().getPro_id();
        this.tanggalMulai = detailSkema.getDsk_tanggal_mulai();
        this.tanggalBerakhir = detailSkema.getDsk_tanggal_berakhir();
        this.totalPeserta = detailSkema.getDsk_total_peserta();
        this.kompeten = detailSkema.getDsk_kompeten();
        this.belumKompeten = detailSkema.getDsk_belum_kompeten();
        this.tidakHadir = detailSkema.getDsk_tidak_hadir();
        this.status = detailSkema.getDsk_status();
    }

    public Integer getDskId() {
        return dskId;
    }

    public void setDskId(Integer dskId) {
        this.dskId = dskId;
    }

    public Integer getSkmId() {
        return skmId;
    }

    public void setSkmId(Integer skmId) {
        this.skmId = skmId;
    }

    public String getSkmDesc() {
        return skmDesc;
    }

    public void setSkmDesc(String skmDesc) {
        this.skmDesc = skmDesc;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public Date getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public Date getTanggalBerakhir() {
        return tanggalBerakhir;
    }

    public void setTanggalBerakhir(Date tanggalBerakhir) {
        this.tanggalBerakhir = tanggalBerakhir;
    }

    public Integer getTotalPeserta() {
        return totalPeserta;
    }

    public void setTotalPeserta(Integer totalPeserta) {
        this.totalPeserta = totalPeserta;
    }

    public Integer getKompeten() {
        return kompeten;
    }

    public void setKompeten(Integer kompeten) {
        this.kompeten = kompeten;
    }

    public Integer getBelumKompeten() {
        return belumKompeten;
    }

    public void setBelumKompeten(Integer belumKompeten) {
        this.belumKompeten = belumKompeten;
    }

    public Integer getTidakHadir() {
        return tidakHadir;
    }

    public void setTidakHadir(Integer tidakHadir) {
        this.tidakHadir = tidakHadir;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
