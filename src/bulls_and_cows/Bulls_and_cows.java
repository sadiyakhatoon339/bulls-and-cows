/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulls_and_cows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Bulls_and_cows {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String s="1123";

          String g="0111";
          Bulls_and_cows  ob=new  Bulls_and_cows ();
          String f=ob.getHint(s,g);
          System.out.println(f);
        // TODO code application logic here
    }
    public String getHint(String secret,String guess)
    {
        char k;
        int x=0;
        int y=0,z=0;
    HashMap <Character,Integer> map=new HashMap<>();
    HashMap <Character,Integer> map1=new HashMap<>();
    for(int i=0;i<secret.length();i++)
    {
        
    map.put( secret.charAt(i),i);
    }
     for(int j=0;j<guess.length();j++)
    {
        
    map1.put(guess.charAt(j),j);
    }
     
     
    for(Map.Entry<Character,Integer> e:map.entrySet())
    { 
        k=e.getKey();
     
         
              
     if((Objects.equals(map.get(k), map1.get(k)))&& map1.containsKey(k))
     { 
              x++;   
     }
     else 
         if(map1.containsKey(k) && !(Objects.equals(map.get(k), map1.get(k))))
     {
          y++;
     }
     else
         z++;
     
          
    }
          
         
       
  
         return x+"A"+y+"B"+z;
         
       
    }
       
       
    }
    

