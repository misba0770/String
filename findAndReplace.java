
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
public class findAndReplace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=s.next();
        }
        String pattern=s.next();
        ArrayList<String> ans=findAndReplace(n,words,pattern);
        for(int i=0;i<ans.size();i++)System.out.print(ans.get(i)+" ");
    }

    private static ArrayList<String> findAndReplace(int n, String[] words, String pattern) {
         //To change body of generated methods, choose Tools | Templates.
         ArrayList<String> ans=new ArrayList<>();
         for(int i=0;i<n;i++){
             if(isMAtching(words[i],pattern))ans.add(words[i]);
         }
         return ans;
    }

    private static boolean isMAtching(String a, String b) {
        if(a.length()!=b.length())return false;
         HashMap<Character,Character> hs=new HashMap<>();
	    HashSet<Character> h=new HashSet<>();
	    for(int i=0;i<a.length();i++){
	        char x=a.charAt(i);
	        char y=b.charAt(i);
	        
	        if(hs.containsKey(x)){
	            char check=hs.get(x);
	            if(check!=y)return false;
	        }
	        else {
	            if(h.contains(y))return false;
	            hs.put(x,y);
	            h.add(y);
	        }
	        
	    }
	    return true;
    }
    
}
