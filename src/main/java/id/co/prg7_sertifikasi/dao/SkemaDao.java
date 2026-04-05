package id.co.prg7_sertifikasi.dao;

import id.co.prg7_sertifikasi.vo.SkemaVo;

import java.util.List;

public interface SkemaDao {
    List<SkemaVo> getAllSkemas();
    List<SkemaVo> getSkemaActive();
}
