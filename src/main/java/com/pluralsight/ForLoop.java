package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for(int j = 10; j >= 0; j--){
            if(j == 0 )
                System.out.println("Launch!");
            else{
                System.out.println(j);
                Thread.sleep(1000);
            }
        }
    }
}
