package phase3software;

import java.util.ArrayList;
import java.util.Scanner;
public class OnlinestoreController {

  public ArrayList<Onlinestore> online=new ArrayList<>();
  public Onlinestore on;
  public void createNewOnlineSore() {
      on = new Onlinestore();
  }

  public Onlinestore sendInformation() {
      createNewOnlineSore();
      Scanner in=new Scanner(System.in);
      System.out.println("enter name of the store");
      on.Name=in.next();
      on.Id=online.size();
      return on;
  }

  public void addToDB()
  {
      online.add(sendInformation());
  }
 public void addOnlineStore()
 { 
    addToDB();
 }
}