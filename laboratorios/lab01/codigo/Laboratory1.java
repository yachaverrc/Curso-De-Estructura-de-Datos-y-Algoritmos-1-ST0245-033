/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Isabella Quintero, Sofia Vega
 * This class contains the methods that solve points 1.1 and 1.2 of laboratory 
 * practice 1
 */
public class Laboratory1 {
    
    /**
     * This method calculates the longest common sequence between two strings
     * @param string1 First string
     * @param string2 Second string
     * @return length of the largest common sequence between cadena
     */
    public static int lcsDNA(String string1, String string2){
        return lcsDNAAux(string1,string2,string1.length(),string2.length());
    }
    /**
     * This method is an auxiliar for lcsDNA
     * @param string1 first characters string
     * @param string2 second characters string
     * @param m length of cadena1
     * @param n length of cadena 2
     * @return length of the largest common sequence between two strings
     */
    private static int lcsDNAAux(String string1, String string2, int m, int n) {
        if (m ==0 || n == 0){
            return 0; 
        }else if(string1.charAt(m-1) == string2.charAt(n-1)){
            return 1 + lcsDNAAux(string1,string2,m-1,n-1);
        }else{
            return Math.max(lcsDNAAux(string1,string2,m-1,n),lcsDNAAux(string1,string2,m,n-1));
        }
    }
    /**
     * This method calculates how many ways there are for organizing rectangles
     * of 1x2 in a rectangle of 2xn
     * @param n side n of the rectangle 2xn
     * @return number of ways that rectangles of 1x2 can be organized 
     * in a rectangle of 2xn
     */
    public static int ways(int n){
        if(n<=2){
            return n;
        }else{
            return ways(n-1) + ways(n-2);   
        } 
    }

}