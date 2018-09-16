package phase3software;

import java.util.ArrayList;
import java.util.Scanner;

public class OnsiteStoreController 
{
public ArrayList<Onsitestore> Onsite=new ArrayList<>();
  public Onsitestore on;
  public void createNewOnsitestore() 
  {
      on = new Onsitestore();
  }
  public Onsitestore sendInformation() {
      createNewOnsitestore();
      Scanner in=new Scanner(System.in);
      System.out.println("enter name of the store");
      on.Name=in.next();
      System.out.println("enter address of the store");
      on.Address=in.next();
      on.Id=Onsite.size();     
      return on;
  }

  public void addToDB()
  {
      Onsite.add(sendInformation());
  }
 public void addOnsiteStore()
 { 
    addToDB();
 }

}