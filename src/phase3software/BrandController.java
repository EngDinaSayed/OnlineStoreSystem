package phase3software;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class BrandController {

  public ArrayList<Brand> brand=new ArrayList<>();
  public Brand br ;
     int searchbrand(String s)
    {
        for(int i=0;i<brand.size();i++)
        {
            if(s.equals(brand.get(i).Name))
                return i;
        }
        return -1;
    }
    public void createnewbrand()
    {
          br = new Brand();
    }
    public String sendBrandname()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name of Brand");
        br.Name=in.next();
        String s=br.Name;
        return s;
    }
    public void regecttoadd()
    {
         System.out.println("brand already exist");
    }
  public void AddnewBrand()
  {   
        br.Most_Oredered=0;
        brand.add(br); 
  }


}