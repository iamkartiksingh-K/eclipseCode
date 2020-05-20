package que6;
import java.io.*;
public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
	           FileWriter fw=new FileWriter(args[0]);    
	           fw.write("This is the content of File 1");    
	           fw.close();    
	          }
		 catch(Exception e){
	           System.out.println(e);
	          }    
	          System.out.println("Successfully Written First File.....");    
	     
        try(FileInputStream in = new FileInputStream(args[0]);
        		FileOutputStream out = new FileOutputStream(args[1])){
        	
        	int i;
        	do {
        		i = in.read();
        		if(i != -1)
        		out.write(i);
        	}while(i != -1);
        }
        catch(IOException e) {
        	System.out.println(e);
        }
        System.out.println("Copied the content of File1 to File 2.....");
        System.out.println("");
        System.out.println("Content of File 2 : ");
        try(FileInputStream f = new FileInputStream(args[1])) {
        	int i;
        	do {
        		
        		i = f.read();
        		if(i != -1)
        		System.out.print((char)i);
        	}while(i != -1);
        }
        catch(IOException e) {
        	System.out.println(e);
        }
	}

}
