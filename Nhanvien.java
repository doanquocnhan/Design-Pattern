/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1_01;
public class Nhanvien{
   String name;
   int age;

   double salary;
   String Gender;
   int Hour;
   double gif;

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public void setHour(int Hour) {
        this.Hour = Hour;
    }
     public double SetGif() {
    if (this.Hour >= 200) {
      return this.salary * 0.2;
    } else if (this.Hour >= 100) {
      return this.salary * 0.1;
    }
        return 0;
     }
   // This is the constructor of the class Employee
   public Nhanvien(String name){
      this.name = name;
   }
   // Assign the age of the Employee  to the variable age.
   public void empAge(int empAge){
      age =  empAge;
   }
   /* Assign the salary to the variable salary.*/
   public void empSalary(double empSalary){
      salary = empSalary;
   }
   /* Print the Employee details */
   public void PrintNhanVien(){
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Salary:" + salary);
      System.out.println("Gender:" + Gender );
      System.out.println("Hour word:" + Hour );
   }
}