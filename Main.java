/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1_01;

/**
 *
 * @author Nhan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Nhanvien nv1 = new Nhanvien("Nguyen Van Tien");
      Nhanvien nv2 = new Nhanvien("Pham Thi Bich Thuong");
 
      // Invoking methods for each object created
      nv1.empAge(26);
      nv1.empSalary(1000);
      nv1.setGender("Male");
      nv1.setHour(210);
      nv1.PrintNhanVien();
 
      nv2.empAge(21);
      nv2.empSalary(500);
      nv2.setGender("Female");
      nv2.setHour(100);
      nv2.PrintNhanVien();
   }
    
}
