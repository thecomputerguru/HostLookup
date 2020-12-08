import java.util.Scanner;
import java.net.InetAddress;
public class HostLookup{
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);  //Create object for Scanner class
    boolean running = true;
    while(running == true){  //Start program
      System.out.print("Enter a hostname or website URL: ");
      String stream = inp.nextLine();  //Enter a hostname or website URL
      if(stream.equals("exit")){  //If user types "exit", program will quit
        System.exit(0);
      } else{
        try{
          InetAddress ip = InetAddress.getByName(stream); //Get IP from hostname
          System.out.println("IP Address: "+ip.getHostAddress());
          System.out.println("");
        } catch(Exception e){
          System.out.println("Hostname or website not found.");
          System.out.println("");
        }
      }
    }
  }
}
