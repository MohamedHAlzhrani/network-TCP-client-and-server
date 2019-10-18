
import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.ServerSocket; 
import java.net.Socket; 


public class Server 
{ 
	public static void main(String args[]) throws IOException 
	{ 

		// Step 1: Establish the socket connection. 
		ServerSocket ss = new ServerSocket(6985); 
		Socket s = ss.accept(); 

		// Step 2: Processing the request. 
		DataInputStream dis = new DataInputStream(s.getInputStream()); 
		DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 

              //  DataOutputStream dos1 = new DataOutputStream(s.getOutputStream());
               
		 while (true) 
        { 
            
			// wait for input 
			String input = dis.readUTF(); 

			
 
                        
                        if(input.equals("Q"))
                            break;
                        
			        String result = null;

                               
			
			

			
// perform the required checking inputs.
                                   
                        if(input.isEmpty()){
                             String sd ="Detection from server: 500 Request is empty";
                             
                            dos.writeUTF(sd);
                           continue;
                        }
                        if( input.charAt(0)!='B'&&input.charAt(0)!='H'){
                            String sd =" Detection from server: 300 Bad request";
                           dos.writeUTF(sd);
                           continue;
                        }
           
                       
                        if(input.length()<3)
                            
                            
                         {
                             String sd =" Detection from server: 400 The number is missing ";
                             dos.writeUTF(sd);
                            continue;
                        }
                        
			if (input.charAt(0)=='B') 
			{ 
                       
                            
                           int w  = Integer.parseInt(input.replaceAll("[\\D]", ""));    
                              result=Integer.toBinaryString(w); 
                           //convirt to binary
 
                         //  String sd = " 200 done";
                              
                            //  dos1.writeUTF(sd);
                             
             
            
			} 

			else if (input.charAt(0)=='H')
			{ 
                         
                          int w  = Integer.parseInt(input.replaceAll("[\\D]", ""));    
                              result=Integer.toHexString(w);
                             // String sd = " 200 ";
                              
                             // dos1.writeUTF(sd);
                             

                             //convirt to hex
                          
                               
                                
			} 
                       
			
			 dos.writeUTF(result);
                       

			// send the result back to the client. 
			
                        
        }
                        
       
		}
        
	} 
           
