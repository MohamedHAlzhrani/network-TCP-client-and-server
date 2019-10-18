# network-TCP-client-and-server
This is very similar to RDT2.0 channel with bit errors
The server will start in passive mode listening for a transmission from the client. The
client will then start and contact the server (on a given IP address and port number). If the
server is down then the client must display the following message:
“Server is down, please try later.”
If server is running, then the client will ask the user to input the following commands:
B: to convert to binary
H: to convert to hexadecimal
Q: to quit the client program
If the command is not quit, then the user should input a number to be converted to
(Binary/Hexadecimal). The client should display appropriate messages for input errors.
If input is correct, then the client will pass the server a request. The request has two parts,
a letter and number. The letter is either B to convert the number to binary or H to convert
the number to hexadecimal.
On receiving a request from the client, the server should convert the number to the
equivalent value in binary or hexadecimal based on the received request and return it to
the client. Of course the server must check for errors and respond with one of the
following messages:
200 01001100 or 1034AF Ok and the number is based on the request(B/H)
300 Bad request Missing B or H
400 The number is missing Missing the number
500 Request is empty Missing both the letter and number
The server should not output anything on the screen.
Upon receiving the server’s response, the client will display the equivalent value in
binary or hexadecimal if the code is 200. Otherwise if the code is not 200 then an error
message must be displayed. Then the client will continue running to serve next user’s
request.
