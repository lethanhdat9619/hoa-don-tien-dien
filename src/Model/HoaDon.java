/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lenovo
 */
public class HoaDon {
    private String maHoaDon;
    private String ngayTao;
    private boolean  trangThai;
    private int chiSoDien;
    private double  thanhTien;
    private int thueVAT;
    private double  tongTien;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String ngayTao, boolean trangThai, int chiSoDien, double thanhTien, int thueVAT, double tongTien) {
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.chiSoDien = chiSoDien;
        this.thanhTien = thanhTien;
        this.thueVAT = thueVAT;
        this.tongTien = tongTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getChiSoDien() {
        return chiSoDien;
    }

    public void setChiSoDien(int chiSoDien) {
        this.chiSoDien = chiSoDien;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getThueVAT() {
        return thueVAT;
    }

    public void setThueVAT(int thueVAT) {
        this.thueVAT = thueVAT;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
