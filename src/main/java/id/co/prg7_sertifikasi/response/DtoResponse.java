package id.co.prg7_sertifikasi.response;

public class DtoResponse {
    
    private Integer status;
    private Object data;
    private String message;

    public DtoResponse() {
    }

    public DtoResponse(Integer status, Object data) {
        this.status = status;
        this.data = data;
    }

    public DtoResponse(Integer status, Object data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
