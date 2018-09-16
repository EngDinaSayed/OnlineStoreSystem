package phase3software;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController 
{
    public ArrayList<Product> product=new ArrayList<>();
    public ArrayList<Product>arrayOfsuggProduct=new ArrayList<Product>();
    public Product prod ;
    int searchproduct(String s)
    {
        for(int i=0;i<product.size();i++)
        {
            if(s.equals(product.get(i).Name))
                return i;
        }
        return -1;
    }
    public void requesttoexplorproduct()
    {
          prod = new Product();
    }
    public String sendproductname()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name of product");
        prod.Name=in.next();
        String s=prod.Name;
        return s;
    }
    public String getstorename()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name of store");
        String x=in.next();
        return x;
    }
    public String sendstorename()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name of store");
        prod.storename=in.next();
        String x=prod.storename;
        return x;
    }
    public void AddProduct() 
    {     

        Scanner in=new Scanner(System.in);
        System.out.println("Enter price of product");
        prod.Price=in.nextFloat();
        System.out.println("Enter category of product");
        prod.category=in.next();
        System.out.println("Enter Brand name of product");
        prod.Brand_Name=in.next();
        System.out.println("Enter quantity of product");
        prod.Quantity=in.nextInt();
        System.out.println("Enter market technique of product");
        prod.marketTech=in.next();
        System.out.println("Enter store name of product");
        prod.storename=in.next();
        System.out.println("Enter type of product online or onsite ");
        prod.Type=in.next();
        int numeberofexplore=0;
        prod.numberofviews=numeberofexplore;
        product.add(prod);      
    }
    public void regecttoadd()
    {
         System.out.println("product already exist");
    }
    public void exploreproduct(int i)
    {      
             System.out.println("the product Name is "+ product.get(i).Name);
             System.out.println("the product Brand name is "+ product.get(i).Brand_Name);
             System.out.println("the product category  is "+ product.get(i).category);
             System.out.println("the product price is "+ product.get(i).Price);
             System.out.println("the product Quantity is "+ product.get(i).Quantity);
             System.out.println("the product type is "+ product.get(i).Type);
             System.out.println("the product number of exploration for "+product.get(i).numberofviews);
             int order;
             order=product.get(i).numberofviews; 
             product.get(i).numberofviews=order+1;
    }
    public void rejecttoexplore()
    {
        System.out.println(" oops,product does not exist");
    }
    public void rejecttobuy()
    {
      System.out.println("sorry not available :( ");  
    }    
    public void buyproduct() 
    {
           System.out.println("the product will be shipped in few dayes :D ");
    }
    public int sendquantitytobuy()
    {
       Scanner in = new Scanner(System.in); 
        int q;
        System.out.println("Enter the quantity");
        q=in.nextInt();
        return q;
    }
    public boolean checkproductavailabilitytobuy(String n ,int q) 
    {
         for (int i = 0; i < product.size(); i++) {
            if (product.get(i).Name.equals(n) &&product.get(i).Quantity>=q)
            {
                product.get(i).Quantity-=q;
                return true;
            }
            else 
            return false;
        }
        return false;

    }
    int searchproductandstore(String s,String store)
    {
        for(int i=0;i<product.size();i++)
        {
            if(s.equals(product.get(i).Name)&&store.equals(product.get(i).storename))
                return i;
        }
        return -1;
    }
    public void add_Exist_product(int index)
    {
       int q;
       q= sendquantitytobuy();
       product.get(index).Quantity+=q;  
       System.out.println("Quantity is "+product.get(index).Quantity); 
    }
    
    public void rejecttoadd_Exist_product()
    {
         System.out.println("Sorry!!product not found");
    }
    
    public void Explorenumberofviews(int i)
    {
            int y=product.get(i).numberofviews;   
            System.out.println("the number of views of "+product.get(i).Name+y);           
    }
    int searchstore(String store,int i)
    {
            if(store.equals(product.get(i).storename))
                return i;
              
 
        return -1;   
    }
    public void rejecttoExplorenumberofviews ()
    {
         System.out.println(" Sorry !! there is no products in this store ");
    }
     public void createproduct()
    {
          prod = new Product();
    }
    public void suggestproduct()
    {
        
        arrayOfsuggProduct.add(prod);
       
    }
    public Product GetTheMostOrdered()
    {
        int max=product.get(0).numberofviews;
        for(int i=0;i<product.size();i++)
        {
            if(product.get(i).numberofviews>=max)
            {
                max=product.get(i).numberofviews;
                prod=product.get(i);
            }
        }
        return prod;
    }
    

}
