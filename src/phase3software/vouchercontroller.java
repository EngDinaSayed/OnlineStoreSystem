package phase3software;
import java.util.ArrayList;
import java.util.Scanner;

public class vouchercontroller {
    
 public ArrayList<Vouchercard> Voucher=new ArrayList<>();
 public Vouchercard v;
 public void createvouchercard() 
 {
           v=new Vouchercard();
 }

 public void addvoucher() 
 {
//    Vouchercard v;
//    v=new Vouchercard();
      v.Id=Voucher.size()+1;
      Voucher.add(v);
      System.out.println("Voucher card you add is "+ v.Id);
  }
    public void removevoucher(int id)
    {
        Voucher.remove(id);
    }
     public int sendvoucherid(int q)
    {
       
        return q;
    }
     
     public boolean checkvoucheravailabilitytobuy(int q) 
    {
         int n;
         n=sendvoucherid(q);
        
         for (int i = 0; i < Voucher.size(); i++) {
            if (Voucher.get(i).Id.equals(n))
            {
                removevoucher(n);
                return true;
            }
            else 
            return false;
        }
        return false;

    }
    public void buyvoucher() 
    {
           System.out.println("your voucher id is bought successfully" );
    }
    public void rejecttobuy()
    {
      System.out.println("sorry not available :( ");  
    } 




}