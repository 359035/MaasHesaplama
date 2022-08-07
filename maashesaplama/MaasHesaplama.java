/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maashesaplama;

/**
 *
 * @author Samsung
 */
public class MaasHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1=new Employee("Kemal", 2000, 45, 1985);
        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        System.out.println(e1.toString());
    }
    
}
