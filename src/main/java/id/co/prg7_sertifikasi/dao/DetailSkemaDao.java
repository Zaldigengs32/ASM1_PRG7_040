package id.co.prg7_sertifikasi.dao;

import id.co.prg7_sertifikasi.vo.DetailSkemaVo;

import java.util.List;

public interface DetailSkemaDao {
    List<DetailSkemaVo> getAllDetailSkemas();
    List<DetailSkemaVo> getDetailSkemaActive();
}
