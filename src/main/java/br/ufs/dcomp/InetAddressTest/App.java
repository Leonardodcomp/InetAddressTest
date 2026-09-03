package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "tiktok.com";
            InetAddress address[] = InetAddress.getAllByName(name); 
            System.out.println( "Name:      "+ name);
            for(int i=0; i<address.length; i++){
                System.out.println("Address: " + address[i].getHostAddress());
            }
            //System.out.println( "Address:   "+ address.getHostAddress());
        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
