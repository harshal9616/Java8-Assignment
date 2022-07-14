package assignment;
import java.util.*;
import java.util.stream.Collectors;

public class ItemMainQue16 {

	
	public static void main(String[] args) {
        List<ItemQue16> items=new ArrayList<ItemQue16>();

        items.add(new ItemQue16(1,"Keyboard","Computer",3000,"22/12/2022","22/12/2026"));
        items.add(new ItemQue16(2,"Mouse","Computer",4500,"12/12/2020","12/12/2025"));
        items.add(new ItemQue16(3,"Iphone","Mobile",90000,"01/01/2022","01/01/2027"));
        items.add(new ItemQue16(4,"Luggage Bag","Travel",15000,"15/04/2022","15/04/2027"));
        items.add(new ItemQue16(5,"Table","Furniture",6000,"05/04/2022","05/04/2025"));    
        items.add(new ItemQue16(6,"Chair","Furniture",5000,"03/11/2021","03/11/2023"));    

        Scanner scan=new Scanner(System.in);
        System.out.println(" \nEnter 1 to find item by Cateory Name\n Enter 2 to find item by Starting Name \n Enter 3 to find item by Date of Expiry\n Enter 4 to find item by Price Range ");
        int ch=scan.nextInt();
        while(true) {
        switch(ch) {
        case 1:
            System.out.println("Enter Category Name");
            String category=scan.next();
            List<ItemQue16> cn=items.stream().filter(e->e.category_name.contains(category)).collect(Collectors.toList());
            cn.stream().forEach(System.out::println);
            break;

        case 2:
            System.out.println("Enter item Starting Name");
            String itemname=scan.next();
            List<ItemQue16> in=items.stream().filter(e->e.item_name.startsWith(itemname)).collect(Collectors.toList());
            in.stream().forEach(System.out::println);
            break;
        case 3:
            System.out.println("Enter Date Of Expiry");
            String date=scan.next();
            List<ItemQue16> doe=items.stream().filter(e->e.date_of_expiry.contains(date)||e.date_of_manufacturing.contains(date)).collect(Collectors.toList());
            doe.stream().forEach(System.out::println);
            break;
        case 4:
            System.out.println("Enter  max range");
            int maxrange=scan.nextInt();
            System.out.println("Enter  min range");
            int minrange=scan.nextInt();
            List<ItemQue16> p=items.stream().filter(m->m.price >minrange && m.price<maxrange).collect(Collectors.toList());
            p.stream().forEach(System.out::println);
            break;

        }
        System.out.println(" Enter 1 to find item by Cateory Name\n Enter 2 to find item by Starting Name \n Enter 3 to find item by Date of Expiry"
        		+ "\n Enter 4 to find item by Price Range ");
        System.out.println("If want to exit press 5");
        ch=scan.nextInt();
        if(ch==5) {
            break;
        }

        }
	}
}