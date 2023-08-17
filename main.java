public class main{
    public static void main(String[] args) {

        Product p = new Product();
        p.Name = "chair";
        p.Price = 500.5 ;
        p.showDetails();
        
        System.out.println("*******************************************");
        Electronic e  = new Electronic();
        e.Name = "Television";
        e.Price = 2000.0;
        e.Brand = "Samsung";
        e.Model = "Neo QLED"; 
        e.showDetails();
         
        System.out.println("*******************************************");
        Book b = new Book();
        b.Name = "OOP Programing";
        b.Price = 250.0;
        b.Author = "John Doe";
        b.Number = 300;

        System.out.println("*******************************************");
        Iphone i = new Iphone();
        i.Name = "Iphone";
        i.Price = 20000.0;
        i.Brand = "Apple";
        i.Model = "Iphone 99";
        i.system = "ios";

        
    }
}
class Product{
   String Name ;
   double Price  ;
    public void setName(String name){
        this.Name = name;
    }
   public void showDetails(){
    System.out.println("Product Name : " + this.Name);
    System.out.println("Product Price : " + this.Price);

   }

}

class Electronic{
    String Name ;
    double Price ;
    String Brand ;
    String Model ;

    

    public void showDetails(){
        System.out.println("Product Name : " + this.Name);
        System.out.println("Product Price "+ this.Price);
        System.out.println("Brand : " + this.Brand);
        System.out.println("Model : " + this.Model );
       
    }


}

class Iphone extends Electronic{
    String system ;
    

    public void showDetails(){
        System.out.println("Product Name : " + this.Name);
        System.out.println("Product Price "+ this.Price);
        System.out.println("Brand : " + this.Brand);
        System.out.println("Model : " + this.Model );
        System.out.println("Operating System : " + this.system );
    }
     
    
 

}

class Book{
    String Name ;
    double Price ;
    String Author ;
    int Number;

    public void showDetails(){
        System.out.println("Product Name : " + this.Name);
        System.out.println("Product Price "+ this.Price);
        System.out.println("Author : " + this.Author);
        System.out.println("Number of Pages : " + this.Number);
    }


}