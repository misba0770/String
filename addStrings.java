
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class addStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String num1=s.next();
        String num2=s.next();
        String res="";
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0||j>=0||carry!=0){
            int ival=i>=0?num1.charAt(i)-'0':0;
            int jval=j>=0?num2.charAt(j)-'0':0;
            i--;j--;
            int sum=ival+jval+carry;
            res=sum%10+res;
            carry=sum/10;
            
            
        }
        System.out.print(res);
    }
    
}
