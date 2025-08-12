package in.co.nmsworks.week2.day2;

public class Employee{
    public float calculateSalary(int hours , int basePay){
        return  hours * basePay ;
    }
}
 class Contractor extends Employee{
     int hours;
     int basePay = 3;

     public int getHours() {
         return hours;
     }
     public void setHours(int hours){
         this.hours = hours;
     }
 }

 class FullTimeEmployee extends Employee{
     int hours = 8;
     int basePay = 10;
 }

 class PartTimeEmployee extends Employee{
     int hours = 4;
     int basePay = 5;
 }