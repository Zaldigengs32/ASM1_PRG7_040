package id.co.prg7_sertifikasi.constant;

public class SkemaConstant {
    public static final String mNotFound = "Scema not found";
    public static final String mEmptyData = "No data available";
    public static final String mCreateSuccess = "Scema created successfully";
    public static final String mCreateFailed = "Failed to create Scema";
    public static final String mUpdateSuccess = "Scema updated successfully";
    public static final String mUpdateFailed = "Failed to update Scema";
    public static final String mDeleteSuccess = "Scema deleted successfully";
    public static final String mDeleteFailed = "Failed to delete Scema";

    public static final String qAllDataActive = "SELECT * FROM stf_msskema WHERE skm_status = ?1";
}
