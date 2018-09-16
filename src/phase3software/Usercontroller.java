package phase3software;

import java.util.*;
import static phase3software.Phase3software.user;
public class Usercontroller {

  public List<Administrator> admin=new ArrayList<>();

  public List<Normaluser> normal=new ArrayList<>();

  public List<Storeowner> storeowner=new ArrayList<>();

    public Normaluser n ;
 public void Register()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user type");
        String s;
        s=sc.next();
        if(s.equals("administrator"))
        {
            Administrator u = new Administrator();
            System.out.println("Enter name");
            u.Name=sc.next();
            System.out.println("Enter Email");
            u.Email=sc.next();
            System.out.println("Enter password");
            u.Password=sc.next();
            u.Salary=1000;
            user.admin.add(u);
        }
        else if(s.equals("storeowner"))
        {
            Storeowner u=new Storeowner();
            System.out.println("Enter name");
            u.Name=sc.next();
            System.out.println("Enter Email");
            u.Email=sc.next();
            System.out.println("Enter password");
            u.Password=sc.next();
            u.ID=user.storeowner.size();
            user.storeowner.add(u);
        }
        else if(s.equals("normaluser"))
        {
            Normaluser u=new Normaluser();
            System.out.println("Enter name");
            u.Name=sc.next();
            System.out.println("Enter Email");
            u.Email=sc.next();
            System.out.println("Enter password");
            u.Password=sc.next();
            System.out.println("Enter address");
            u.Address=sc.next();
            u.voucherid=-1;
            user.normal.add(u);
        }
        else
        {
            System.out.println("try again");
        }
        
    }
    public int check_arrays(String e,String p)
    {
        for(int i=0;i<user.admin.size();i++)
        {
            if(user.admin.get(i).Email.equals(e) && user.admin.get(i).Password.equals(p))
                return 1;
        }
        for(int i=0;i<user.storeowner.size();i++)
        {
            if(user.storeowner.get(i).Email.equals(e) && user.storeowner.get(i).Password.equals(p))
                return 2;
        }
            for(int i=0;i<user.normal.size();i++)
        {
            if(user.normal.get(i).Email.equals(e) && user.normal.get(i).Password.equals(p))
                return 3;
        }
            return -1;
    }
    public int login()
    {
        Scanner sc=new Scanner(System.in);
        String email;
        System.out.println("Enter Email");
        email=sc.next();
        String pass;
        System.out.println(" Enter Password");
        pass=sc.next();
        int x=check_arrays(email, pass);
        if(x==1)
        {
            System.out.println("welcome :D Admin ");
        }
        else if(x==2)
        {
            System.out.println("welcome :D store owner");
        }
        else if(x==3)
        {
            System.out.println("welcome :D  Normal user");
        }
        else
        {
           System.out.println("oops :( , try again");
        }
        return x;
    }
     int searchbyemail()
    {
        n = new Normaluser();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter email");
        String s=in.next();
        for(int i=0;i<normal.size();i++)
        {
            if(s.equals(normal.get(i).Email))
                return i;
        }
        return -1;
        }


}