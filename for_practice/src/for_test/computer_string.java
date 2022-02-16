package for_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class computer_string {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input your string to computer: ");
        String input_str= scanner.nextLine();
        List<Character> op_list = new ArrayList<>(Arrays.asList('+', '-', '*', '/'));
        //一次性加入多个元素
        //将字符串中的数字和运算符号分开储存在两个ArrayList中
        int left=0;
        int right=0;
        List<Integer> num_list=new ArrayList<>();
        List<Character> oprator_list=new ArrayList<>();
        for(int i=0;i<input_str.length();i++){
            if(op_list.contains(input_str.charAt(i))){
                oprator_list.add(input_str.charAt(i));
                num_list.add(Integer.valueOf(input_str.substring(left,right)));
                right++;
                left=right;
            }
            else{
                right++;
            }
        }
        num_list.add(Integer.valueOf(input_str.substring(left,right)));
        //先进行乘除运算
        for (int j = 0; j <oprator_list.size() ; j++) {
            if(oprator_list.get(j)=='*'){
                num_list.set(j+1,num_list.get(j)*num_list.get(j+1));
                num_list.set(j,0);
            }
            else if(oprator_list.get(j)=='/'){
                num_list.set(j+1,num_list.get(j)/num_list.get(j+1));
                num_list.set(j,0);
            }
        }
        //System.out.println(num_list);
        //再进行加减于运算
        for (int k = 0; k <oprator_list.size() ; k++) {
            if(oprator_list.get(k)=='-'){
                num_list.set(k+1,num_list.get(k)-num_list.get(k+1));
            }
            else{
                num_list.set(k+1,num_list.get(k)+num_list.get(k+1));
            }
        }
        //System.out.println(num_list);
        System.out.println(num_list.get(num_list.size()-1));
        //System.out.println(num_list);


    }
}
