
import java.util.HashMap;
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
public class longestKUniqueChars {

    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       String str=s.next();
       int k=s.nextInt();
       System.out.print(longestUniqChars(str,k));
       
    }

    private static int longestUniqChars(String s, int k) {
       HashMap<Character,Integer> map=new HashMap<>();
       int i=0,j=0;int max=0;
       while(j<s.length()){
           char ch=s.charAt(j);
           if(!map.containsKey(ch))map.put(ch,0);
           map.put(ch,map.get(ch)+1);
            if(map.size()<k)j++;
            else if(map.size()==k){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(map.size()>k){
                while(map.size()>k&&i<s.length()){
                    char x=s.charAt(i);
                    if(map.containsKey(x)){
                        map.put(x, map.get(x)-1);
                    }
                    if(map.get(x)==0)map.remove(x);
                    i++;
                }
                j++;
            }
       }
       return max;
    }
    
}
