package com.company;

public class NumberService {
    int [] numbers = {10, 2, 3, 85, 23, 491, 23, 412, 42, 41, 22, 25};

    public int getCountNumbers(){
        int count = 0;
        for(int number:numbers){
            count++;
        }

        return count;
    }
    public int countNumbersHigherThan(int x){
        int higher = 0;
        for(int numer:numbers){
            if(numer>x){
                higher++;
            }
        }
        return higher;
    }
    public int sumNumbers(){
        int suma = 0;
        for(int number:numbers){
            suma +=number;
        }
        return suma;
    }

    public void dupa(){


        int element = numbers.length;
        do {
            for(int i = 0; i < element - 1;i++){
                if(numbers[i+1] < numbers[i]){
                    int zmienna = numbers[i];
                    numbers[i]= numbers[i+1];
                    numbers[i+1] = zmienna;
                }
          }
           element--;
       }while(element > 1);



    }
    public void displayNumbers(){
        for( int number:numbers){
            System.out.println(number);
        }
    }

}
