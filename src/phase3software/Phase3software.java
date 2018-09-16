
package phase3software;

import java.util.Scanner;
public class Phase3software {
    public static Usercontroller user=new Usercontroller();
    public static OnlinestoreController online1=new OnlinestoreController();
    public static OnsiteStoreController onsite1=new OnsiteStoreController();
    public static ProductController product1=new ProductController();
    public static BrandController brand1=new BrandController();
    public static vouchercontroller voucher_card=new vouchercontroller();

    public static void main(String[] args) 
    {
        Phase3software s=new Phase3software();
        Scanner in=new Scanner(System.in);
        while(true)
        {
        System.out.println(" please Enter 1 to regist or Enter 2 to login ");
        int choice=in.nextInt();
        if(choice==1)
        {
          user.Register();
        } 
        else if(choice==2)
        {
            int x=user.login();
            User u;
            if(x==1)//administrator
            {
                
                u=new Administrator();
                System.out.println("    if you want to   ");
                System.out.println(" add new product choose 1 ");
                System.out.println(" add new brand choose 2 ");
                System.out.println(" explore products in store choose 3 ");
                System.out.println(" provide voucher card choose 4 ");
                int Choice=in.nextInt();
                if (Choice==1)
                {
                    product1.requesttoexplorproduct();
                    String name=product1.sendproductname();              
                    int check=product1.searchproduct(name);
                    if(check==-1)
                    {
                    product1.AddProduct();
                    System.out.println(" added succefully ;) ");
                    }
                    else
                    {
                        product1.regecttoadd();
                        
                    }
                    System.out.println(" size of product "+product1.product.size());
                
                }
              else if(Choice==2)
                {
                    brand1.createnewbrand();
                    String name=brand1.sendBrandname();              
                    int check=brand1.searchbrand(name);
                    if(check==-1)
                    {
                    brand1.AddnewBrand();
                    System.out.println(" added succefully ;) ");
                    }
                    else
                    {
                        brand1.regecttoadd();
                        
                    }
                    System.out.println(" size of brand  "+brand1.brand.size());
                    
                }
                else if (Choice==3)
                {
                   String storename=product1.getstorename();
                   for (int i=0;i<product1.product.size();i++)
                   {
                   int index=product1.searchstore(storename,i);
                   if (index!=-1)
                    { 
                     product1.exploreproduct(index);
                    }
                   else
                    {
                     product1.rejecttoexplore();
                    }
                    }
                } 
                else if (Choice==4)
                {
                  voucher_card.createvouchercard();
                  voucher_card.addvoucher();
                  System.out.println("added sucessfully");
                }
            }
            else if(x==2)//storeowner
            {
                u=new Storeowner();
                System.out.println("  if you want to ");
                System.out.println(" add store choose 1");
                System.out.println(" explore products in store choose 2 ");
                System.out.println(" if you want to add product to store choose 3 ");
                System.out.println(" explore product's number of views  choose 4");
                System.out.println(" suggest product choose 5 ");
                System.out.println(" Get the most viewed product in a store choose 5 ");
                int Choice=in.nextInt();
                if(Choice==1)
                {
                System.out.println(" Enter store type ");//add store
                String str=in.next();
                if(str.equals(" Online "))
                {
                    online1.addOnlineStore();
                    System.out.println("online store added succefully ;) ");
                    System.out.println("size of online store  "+online1.online.size());
                }
                else if(str.equals(" onsite "))
                {
                    onsite1.addOnsiteStore();
                    System.out.println("onsite store added succefully ;) ");
                    System.out.println("size of onsite store  "+onsite1.Onsite.size());
                }
                }
                else if (Choice==2)
                {
                   String storename=product1.getstorename();
                   for (int i=0;i<product1.product.size();i++)
                   {
                   int index=product1.searchstore(storename,i);
                   if (index!=-1)
                    { 
                     product1.exploreproduct(index);
                    }
                   else
                    {
                     product1.rejecttoexplore();
                    }
                    }
                } 
                else if(Choice==3)
                {
                         product1.requesttoexplorproduct();
                         System.out.println("Enter name of product");
                         product1.prod.Name=in.next();
                         String productname=product1.prod.Name;
                         System.out.println("Enter name of store");
                         product1.prod.storename=in.next();
                         String storename=product1.prod.storename;
                    int i=product1.searchproductandstore(productname,storename);
                    if (i!=-1)
                     { 
                      product1.add_Exist_product(i);
                      System.out.println("added succefully ;)");
                     }
                    else
                     {
                     product1.rejecttoadd_Exist_product();
                     }
                    
                }
                else if (Choice==4)
                {
                   String storename=product1.sendstorename();
                   for (int i=0;i<product1.product.size();i++)
                   {
                   int index=product1.searchstore(storename,i);
                   if (index!=-1)
                    { 
                     product1.Explorenumberofviews(index);
                    }  
                   else
                     {
                     product1.rejecttoExplorenumberofviews();
                     }
                   }
                }
                    else if (Choice==5)
                {
                    product1.createproduct();
                    System.out.println("enter product information");
                    Scanner ok=new Scanner(System.in);
                    System.out.println("Enter store name of product");
                    product1.prod.storename = ok.next();
                    System.out.println("Enter price of product");
                    product1.prod.Price = ok.nextFloat();
                    System.out.println("Enter category of product");
                    product1.prod.category = ok.next();
                    System.out.println("Enter Brand name of product");
                    product1.prod.Brand_Name = ok.next();
                    System.out.println("Enter quantity of product");
                    product1.prod.Quantity = ok.nextInt();
                    System.out.println("Enter market technique of product");
                    product1.prod.marketTech = ok.next();
                    System.out.println("Enter type of product online or onsite ");
                    product1.prod.Type = ok.next();
                    int numeberofexplore = 0;
                    product1.prod.numberofviews = numeberofexplore;
                    product1.suggestproduct();
                    System.out.println(" suggested successfully ");
                   System.out.println(" number of suggested products"+product1.arrayOfsuggProduct.size());  
                }
                 else if(Choice==6)
                    {
                        product1.createproduct();
                        Product p=product1.GetTheMostOrdered();
                        System.out.println("name = " + p.Name);
                        System.out.println("price = " + p.Price);
                        System.out.println("brand name = " + p.Brand_Name);
                        System.out.println("category = " + p.category);
                        System.out.println("quantity = " + p.Quantity);
                    }
                
            }
            else if(x==3)//normaluser
            {
                u=new Normaluser();
                System.out.println("if you want to");
                System.out.println("buy product choose 1");
                System.out.println("buy voucher choose 2");
                System.out.println("explore products in store choose 3");
                System.out.println("suggest product choose 4");
                System.out.println("buy product by voucher choose 5");
                int Choice=in.nextInt();
                if(Choice==1)
                {
                    String n;
                    System.out.println(" Enter name of product ");
                    n=in.next();
                    int q;
                    System.out.println(" Enter the quantity ");
                    q=in.nextInt();
                    boolean d;   
                    d= product1.checkproductavailabilitytobuy(n,q);
                    if(d==true)
                    product1.buyproduct();
                    
                    else
                    product1.rejecttobuy();
                    
                }
                if(Choice==2)
                {
                    System.out.println(" the existing voucher's id");
                    for (int i = 0; i < voucher_card.Voucher.size(); i++) 
                    {
                        System.out.println(voucher_card.Voucher.get(i).Id);
                    }
                    int q;
                    System.out.println("Enter the voucher id");
                    q=in.nextInt();
                    boolean m = voucher_card.checkvoucheravailabilitytobuy(q);
                    if(m==true)
                    {
                    voucher_card.buyvoucher();
                   
                    int l= voucher_card.sendvoucherid(q);
                    int index=user.searchbyemail();
                    System.out.println(index);
                    user.normal.get(index).voucherid=l;  
                     System.out.println(" user voucher id "+user.normal.get(index).voucherid);
                     System.out.println(" user name  "+user.normal.get(index).Name);
                    }
                    else
                    voucher_card.rejecttobuy(); 
                }
                else if (Choice==3)
                {
                   String storename=product1.getstorename();
                   for (int i=0;i<product1.product.size();i++)
                   {
                   int index=product1.searchstore(storename,i);
                   if (index!=-1)
                    { 
                     product1.exploreproduct(index);
                    }
                   else
                    {
                     product1.rejecttoexplore();
                    }
                    }
                } 
                else if (Choice==4)
                {
                    product1.createproduct();
                    System.out.println("enter product information");
                    Scanner ok=new Scanner(System.in);
                    System.out.println("Enter store name of product");
                    product1.prod.storename = ok.next();
                    System.out.println("Enter price of product");
                    product1.prod.Price = ok.nextFloat();
                    System.out.println("Enter category of product");
                    product1.prod.category = ok.next();
                    System.out.println("Enter Brand name of product");
                    product1.prod.Brand_Name = ok.next();
                    System.out.println("Enter quantity of product");
                    product1.prod.Quantity = ok.nextInt();
                    System.out.println("Enter market technique of product");
                    product1.prod.marketTech = ok.next();
                    System.out.println("Enter type of product online or onsite ");
                    product1.prod.Type = ok.next();
                    int numeberofexplore = 0;
                    product1.prod.numberofviews = numeberofexplore;
                    product1.suggestproduct();
                    System.out.println(" suggested successfully ");
                   System.out.println(" number of suggested products"+product1.arrayOfsuggProduct.size());
                }
                else if (Choice==5)
                {
                    int index = user.searchbyemail();
                    if (user.normal.get(index).voucherid != -1) {
                    String n;
                    n=product1.sendproductname();
                    System.out.println(" Enter name of product ");
                    n=in.next();
                    int q;
                    System.out.println(" Enter the quantity ");
                    q=in.nextInt();
                        boolean d;
                     d = product1.checkproductavailabilitytobuy(n,q);
                        if (d == true) {
                            product1.buyproduct();
                        } else {
                            product1.rejecttobuy();
                        }
                    } else {
                        System.out.println("sorry,you have not voucher card please , buy voucher card please");
                    }
                }

         }
        }
    }
    
}
}
