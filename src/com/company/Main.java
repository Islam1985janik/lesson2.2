package com.company;

public class Main {

    public static void main(String[] args) {

   int temperature = 8;
   int numberOfStudents = 20;
   boolean isSnowy = true;

   if (isSnowy && temperature < 15) {// && - оператор И (AND)
       System.out.println("Stay at home");
   }

   if (numberOfStudents < 10 && temperature > 0){
       System.out.println("Go to park");
   }
   if (isSnowy || temperature < 10){// || - оператор ИЛИ (OR)
       System.out.println("It is cold");
   }
   if (temperature > 0 && temperature < 50 || numberOfStudents < 10){


       System.out.println("Go to cinema");
   }










    }
}
