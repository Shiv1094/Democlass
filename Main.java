package comparator.product;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Product p1=new Product(101,"Mobile",10000,5);
        Product p2=new Product(108,"Laptop",70000,8);
        Product p3=new Product(102,"TV",30000,7);
        Product p4=new Product(107,"AC",9000,1);
        List<Product> listofproduct=new ArrayList<Product>();

        Collections.addAll(listofproduct, p1,p2,p3,p4);

        for (Product product : listofproduct)
        {
            System.out.println(product);
        }

        System.out.println("----- Sort by id ------");
        Collections.sort(listofproduct, new SortById());
        for (Product product : listofproduct)
        {
            System.out.println(product);
        }

        System.out.println("----- Sort by name ------");
        Collections.sort(listofproduct, new SortByName());
        for (Product product : listofproduct)
        {
            System.out.println(product);
        }

        System.out.println("----- Sort by price ------");
        Collections.sort(listofproduct, new SortByPrice());
        for (Product product : listofproduct)
        {
            System.out.println(product);
        }

        System.out.println("----- Sort by rating ");
        Collections.sort(listofproduct,new SortByRating().reversed());
        for (Product product : listofproduct)
        {
            System.out.println(product);
        }
          }
}
