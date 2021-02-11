import java.util.*;
public class StudentDetails{
    public static void main(String[] args)
    {
     int choice;
     System.out.println("1 Data Entry");
     System.out.println("2 Data View");
        
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter your choice");
        choice=sc.nextInt();
         if(choice==1)
    {
             Scanner a=new Scanner(System.in);
             String name;
             int roll_no,ktu_id;
              System.out.println("Enter your name:");
                name=a.nextLine();
             System.out.println("Enter your roll number");
                roll_no=a.nextInt();
              System.out.println("Enter your ktu id");
                ktu_id=a.nextInt();
    }
    }
   
}
