package com.poscafe;

public class NguoiDung {
    protected String maNguoiDung;
    protected String tenNguoiDung;
    protected String email;
    protected String soDienThoai;
    protected String diaChi;

    public NguoiDung(String maNguoDung, String tenNguoiDung, String email, String soDienThoai) {
        this.maNguoiDung = maNguoiDung;
        this.tenNguoiDung = tenNguoiDung;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }
    public void hienThiThongTin(){
        System.out.println("Mã người dùng: " + maNguoiDung);
        System.out.println("Tên người dùng: " + tenNguoiDung);
        System,out.println("Email: " + email);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + soDienThoai);
    }
    public String getMaNguoiDung(){
        return maNguoiDung;
    }
    public void setMaNguoiDung(String maNguoiDung){
        this.maNguoiDung = maNguoiDung;
    }
    public String getTenNguoiDung(){
        return tenNguoiDung;
    }
    public void setTenNguoiDung(String tenNguoiDung){
        this.tenNguoiDung = tenNguoiDung;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSoDienThoai(){
        return soDienThoai;
    }
}
