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
public class hoGiaDinh{
    private String maHo;
    private String tenHo;
    private String sdt;
    private String maDongHo;
    private String diaChi;
    private int tongSoHoaDonThanhToan;
    private double soTienConNo;
    public hoGiaDinh() {
    }

    public hoGiaDinh(String maHo, String tenHo, String sdt, String maDongHo, String diaChi) {
        this.maHo = maHo;
        this.tenHo = tenHo;
        this.sdt = sdt;
        this.maDongHo = maDongHo;
        this.diaChi = diaChi;
    }
    public int getTongSoHoaDonThanhToan() {
        return tongSoHoaDonThanhToan;
    }

    public void setTongSoHoaDonThanhToan(int tongSoHoaDonThanhToan) {
        this.tongSoHoaDonThanhToan = tongSoHoaDonThanhToan;
    }

    public double getSoTienConNo() {
        return soTienConNo;
    }

    public void setSoTienConNo(double soTienConNo) {
        this.soTienConNo = soTienConNo;
    }
    
    

    public String getMaHo() {
        return maHo;
    }

    public void setMaHo(String maHo) {
        this.maHo = maHo;
    }

    public String getTenHo() {
        return tenHo;
    }

    public void setTenHo(String tenHo) {
        this.tenHo = tenHo;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMaDongHo() {
        return maDongHo;
    }

    public void setMaDongHo(String maDongHo) {
        this.maDongHo = maDongHo;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
