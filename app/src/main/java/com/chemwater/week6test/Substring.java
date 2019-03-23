package com.chemwater.week6test;

public class Substring {
    static String baseString = "tirughkvghtirughkjgvtiru" ;
    static String findString = "tiru" ;
    static int index = 0 ;
    static int finalCount = 0 ;

    public static void main(String[] args) {
       subMethod(baseString, findString, 3) ;
       subMethod(baseString, findString, 4) ;
    }

    public static void subMethod(String baseString, String findString, int guessedNumber){
        while(index != -1){

            index = baseString.indexOf(findString,index);

            if(index != -1){
                finalCount ++;
                index += findString.length();
            }
        }

        System.out.println(finalCount);
        if (finalCount == guessedNumber) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
