/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

/**
 *
 * @author hp
 */
public class UserDetails {
    private String name;
    private String Surname;
    private String studNo;
    private String gender;
    private String moreInfo;

    public UserDetails(String name, String Surname, String studNo, String gender, String moreInfo) {
        this.name = name;
        this.Surname = Surname;
        this.studNo = studNo;
        this.gender = gender;
        this.moreInfo = moreInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getStudNo() {
        return studNo;
    }

    public void setStudNo(String studNo) {
        this.studNo = studNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nSurname=" + Surname + "\nstudNo=" + studNo + "\ngender=" + gender + "\nmoreInfo=" + moreInfo ;
    }
    
    
}
