package id.co.asm1_prg7_040.vo;

public class ModulVoForm {

    private String versiModul;
    private Integer statusModul;

    public ModulVoForm() {
    }

    public ModulVoForm(String versiModul, Integer statusModul) {
        this.versiModul = versiModul;
        this.statusModul = statusModul;
    }

    public String getVersiModul() {
        return versiModul;
    }

    public void setVersiModul(String versiModul) {
        this.versiModul = versiModul;
    }

    public Integer getStatusModul() {
        return statusModul;
    }

    public void setStatusModul(Integer statusModul) {
        this.statusModul = statusModul;
    }
}
