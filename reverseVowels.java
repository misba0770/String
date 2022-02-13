
import java.util.Arrays;
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
public class reverseVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String x=s.next();
        String ans=reverse(x);
        System.out.print(ans);
    }

    private static String reverse(String x) {
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        char[] arr=x.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right&&isVowel(arr,left)==false){left++;}
            while(left<right&&isVowel(arr,right)==false)right--;
            swap(arr,left,right);
            left++;
            right--;
        }
        String ans="";
        for(char ch:arr){
            ans+=ch;
        }return ans;
    }

    private static boolean isVowel(char[] arr, int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        char a=arr[i];
        return a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
            
           
    }

    private static void swap(char[] arr, int left, int right) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       char temp=arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
    }
    
}
