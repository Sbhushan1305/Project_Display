package session.example;

import java.io.FileOutputStream;
public class File_handling {
public static void main(String args[]){
try{
FileOutputStream fout=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\Java-FSD-Project-2022\\src\\session\\example\\Filehandlingtest.txt");
String s="File handling done by Shashi Bhushan.";
byte b[]=s.getBytes();//converting string into byte array
fout.write(b);
fout.close();
System.out.println("success...");
}catch(Exception e){System.out.println(e);}
}
}