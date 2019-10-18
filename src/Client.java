

import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.InetAddress; 
import java.net.Socket; 
import java.net.UnknownHostException; 
import java.nio.Buffer;
import java.util.Scanner; 


public class Client 
{ 
	public static void main(String[] args) throws IOException  
	{ 
            try{
		InetAddress ip = InetAddress.getLocalHost(); // to get my local ip 
		int port = 6985; 
		Scanner sc = new Scanner(System.in); 

		// Step 1: Open the socket connection. 
		Socket s = new Socket(ip, port); 
               
                
           
               
               
		// Step 2: Communication-get the input and output stream 
		DataInputStream dis = new DataInputStream(s.getInputStream());
               
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            
	
            
            
			while (true) {
                                 
                                 
			System.out.print("Enter letter and number \n or enter Q to quit : "); 
			
                       
                        
			String inp = sc.nextLine(); 
       
                  
                       if( inp.equals("Q"))
                           
                           break;
                       
                    // checking of inputs 
              //الخاص بال checking هنا وضعت الكلاينت للتفعيل قم بالغاء علامة جعل الكود كونت (*/) (*/)
                 
                      if(inp.isEmpty()){
                             System.out.println("Detection from client : nothing did inputs");
                            continue;
                        }
                      if(inp.length()<3){
                            System.out.println("Detection from client : forget number");
                            
                            continue;
                        }
                      
			if( inp.charAt(0)!='B'&&inp.charAt(0)!='H'){
                            
                           
                            System.out.println("Detection from client : input error ,the letter did used not defined You must use a letter :B ,H,Q");
                           
                            continue;
                             
                        }
               
			// reqest to server 
                        
			dos.writeUTF(inp); 
                       
                       
			// wait till request is processed and sent back to client 
			String ans = dis.readUTF();
                        System.out.println("ANSWER: \n" + ans);
                        
                       
                        }
                       
                        
			
                         
                        
                        
        }
            catch(IOException ex) {
                 //if the server is down will get this message.
              
                   System.out.println("Server is down, please try later");
                   
             }
    }             
        }

                        
		
	
