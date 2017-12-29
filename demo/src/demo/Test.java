package demo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//ashok hhfghjyt
public class Test {
	
	
	
	public static int[] getJoinedPipes(int[] input1)
    {
        
        if(input1!=null)
        {
            for(int i = 0; i < input1.length-1; i++)
            {
                for(int j = 1; j < input1.length-1; i++)
                {
                    if(input1[j-1] > input1[j])
                    {
                        int temp = input1[j];
                        input1[j] = input1[j-1];
                        input1[j-1] = temp;
                    }
                }
                System.out.println(Arrays.toString(input1));
            }
        }
	    return new int[1];
    }


    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int[] output = null;
        int ip1_size = 0;
        ip1_size = Integer.parseInt(in.nextLine().trim());
        int[] ip1 = new int[ip1_size];
        int ip1_item;
        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
            ip1_item = Integer.parseInt(in.nextLine().trim());
            ip1[ip1_i] = ip1_item;
        }
        output = getJoinedPipes(ip1);
        for(int output_i=0; output_i < output.length; output_i++) {
	        	System.out.println(String.valueOf(output[output_i]));
	            }
    }


}
