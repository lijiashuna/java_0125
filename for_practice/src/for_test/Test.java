package for_test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String strs="12+33*24-20/5";
        List<Character>strsarr1=new ArrayList<>();
        strsarr1.add('+');
        strsarr1.add('-');
        strsarr1.add('*');
        strsarr1.add('/');
        List<Integer>strsarr=new ArrayList<>();
        List<Character> op=new ArrayList<>();
        int left=0;
        int right=0;
        for(int i=0;i<strs.length();i++){
            //System.out.print(strsarr1.contains(strs.charAt(i)));
            if(strsarr1.contains(strs.charAt(i))){
                //System.out.println(i);
                op.add(strs.charAt(i));
                strsarr.add(Integer.parseInt(strs.substring(left,right)));
                right++;
                left=right;
            }
            else{
                right++;
            }
        }
        strsarr.add(Integer.parseInt(strs.substring(left,right)));
        System.out.println(strsarr1);
        System.out.println(strsarr);
        System.out.println(op);
        for(int k=0;k<op.size();k++){
            if(op.get(k) =='*'){
                strsarr.set(k,strsarr.get(k)*strsarr.get(k+1));
                strsarr.set(k+1,0);
            }
            else if(op.get(k) =='/'){
                strsarr.set(k,strsarr.get(k)/strsarr.get(k+1));
                strsarr.set(k+1,0);
            }
        }

        for (int j = 0; j <strsarr1.size() ; j++) {
            if(op.get(j)=='+'){
                strsarr.set(0,strsarr.get(0)+strsarr.get(j+1));
            }
            else if(op.get(j)=='-'){
                strsarr.set(0,strsarr.get(0)-strsarr.get(j+1));
            }
        }
        System.out.println(strsarr.get(0));

    }
}
