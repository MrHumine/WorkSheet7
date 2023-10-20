package org.example;

public class Checkks {


    public Checkks(){
    };


    public Boolean isPrime(int number){
        if (number == 1){
            return false;
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
                ;

            }
            ;
            return true;
        }
    };

    public Boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        };
        return false;
    };

    public String isMultiple(int number, int multiplier){
        if(number%multiplier==0){
            return "Number is multiplier of second number";
        };
        return "Number is not multiplier of second number";
    };
}
