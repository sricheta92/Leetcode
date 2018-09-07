package com.String;

public class BackspaceSTringCompare {

	public static void main(String[] args) {
		backspaceCompare("y#fo##f","y#f#o##f");
	}
	
public static  void  backspaceCompare(String S, String T) {
        
        char[] arrs = S.toCharArray();
        char[] arrt = T.toCharArray();
        
        String ss = "";
        String st = "";
        
        for(int i =0;i<arrs.length;i++){
            if(arrs[i] == '#' && ss.length()>0){
                ss = ss.substring(0, ss.length()-1);
            }else if(arrs[i] != '#'){
                ss=ss+arrs[i];
            }
        }
        
         for(int i =0;i<arrt.length;i++){
            if(arrt[i] == '#' && st.length()>0){
                st = st.substring(0, st.length()-1);
            }else if(arrt[i] != '#'){
                st=st+arrt[i];
            }
        }
        
        System.out.println( ss.equals(st));
    }
}
