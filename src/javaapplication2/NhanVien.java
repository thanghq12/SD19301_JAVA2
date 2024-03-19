/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author hoangquangthang
 */
public class NhanVien {
    public String tenNV; //đây là thuộc tính (Biến trong class )
    public int luong; 
    //phường thức khởi tạo không tham số truyền vào 
    public NhanVien() {
    }
    //phương thức là Hàm trong class 
    //phương thức khởi tạo có tham số truyền vào 
    public NhanVien(String tenNV, int luong) {
        this.tenNV = tenNV;
        this.luong = luong;
    }
    // phương thức get và phương thức set 
    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
    
}
