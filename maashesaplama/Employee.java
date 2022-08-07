/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maashesaplama;

/**
 *
 * @author Samsung
 */
public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax=0;
    int bonus=0;
    double maasArtirimi=0;

    

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    public void tax(){
        if(this.salary<1000){
            this.tax=0;
        }else{
            this.tax=this.salary*0.03;
        }
        
    }
    
    public void bonus(){
        if(this.workHours<=40){
            this.bonus=0;
        }else{
            this.bonus=(this.workHours-40)*30;
        }
        
    }
    
    public void raiseSalary(){
        int calisilanYil=2021-this.hireYear;
        if(calisilanYil<10){
            this.maasArtirimi=this.salary*0.05;
        }else if(calisilanYil>=10&&calisilanYil<20){
            this.maasArtirimi=this.salary*0.1;
        }else if(calisilanYil>=20){
            this.maasArtirimi=this.salary*0.15;
    }
        
    }

    @Override
    public String toString() {
        return "Adi=" + name + "\nMaasi:" + salary + "\nCalisma Saati:" + workHours + "\nBaslangic Yili:" + hireYear + "\nVergi:"+tax+"\nBonus:"+bonus+"\nMaas Artisi:"+maasArtirimi+"\nVergi ve Bonuslar ile birlikte maas:"+(salary+bonus-tax)+"\nToplam Maas:"+(salary+bonus-tax+maasArtirimi);
    }
    
    
}
