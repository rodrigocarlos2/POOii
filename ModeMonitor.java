

import java.io.*;
import java.util.Scanner;

public class ModeMonitor{

  // Attention: It is ONLY for Linux!
	
	public static void main(String args[]){
		
		int stages = 0;
		
		Runtime run = Runtime.getRuntime();
		
		String interfaceWlan0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Write the interface name: ");
		interfaceWlan0 = teclado.nextLine();
		
		try{
			
			String exec = "ifconfig "+interfaceWlan0+" down";
			
			run.exec(exec);
			
			stages++;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		if(stages==1){
			
			String exec = "iwconfig "+interfaceWlan0+" mode monitor";
			
			try {
				run.exec(exec);
				stages++;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		if(stages==2){
			
			String exec = "ifconfig "+interfaceWlan0+ " up";
			
			try{
				
				run.exec(exec);
				
			}catch(Exception e){
				
				e.printStackTrace();
				
			}
			
		}
		
		System.out.println("Finalized configurantion");
		
	}
	
}
