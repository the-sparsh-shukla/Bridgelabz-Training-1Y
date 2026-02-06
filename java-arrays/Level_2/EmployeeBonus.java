package com.gla.arrays.level02;
import java.util.*;
public class EmployeeBonus {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] salary=new double[10];
        double[] years=new double[10];
        double[] bonus=new double[10];
        double[] newSalary=new double[10];
        double tBonus=0.0;
        double oSalary=0.0;
        double nSalary=0.0;
        for(int i=0;i<10;i++){
            System.out.println("Enter salary  of employee ");
            salary[i]=sc.nextDouble();
            System.out.println("Enter Years  of employee working for ");
            years[i]=sc.nextDouble();
            if(salary[i]<=0||years[i]<=0){
                System.out.println("Invalid Input");
                i--;
            }
        }
        for(int i=0;i<10;i++){
            oSalary+=salary[i];
            if(years[i]>5){
                bonus[i]=salary[i]*0.05;
            }else {
                bonus[i]=salary[i]*0.02;
            }
            newSalary[i]=salary[i]+bonus[i];
            tBonus+=bonus[i];
            nSalary+=newSalary[i];

        }
        System.out.println("Total old salary = "+oSalary);
        System.out.println("Total bonus payout = "+tBonus);
        System.out.println("Total new salary = "+nSalary);
    }
}
