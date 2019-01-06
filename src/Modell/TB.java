/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modell;

import Controller.GiaoTiep;
import java.io.Serializable;

/**
 *
 * @author thao
 */
public class TB implements Serializable, GiaoTiep{
    private int ID, namSX;
    private String ten, xuatSu;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getXuatSu() {
        return xuatSu;
    }

    public void setXuatSu(String xuatSu) {
        this.xuatSu = xuatSu;
    }

    @Override
    public Object[] toObjects() {
     return new Object[] {
        this.ID, this.namSX, this.ten, this.xuatSu
    };
    }
    
}
