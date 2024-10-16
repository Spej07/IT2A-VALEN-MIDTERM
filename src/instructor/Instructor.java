
package instructor;

import java.util.Scanner;

public class Instructor {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String resp;
        do{

            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");

            System.out.print("Enter Action: ");
            int action = sc.nextInt();
            Instructor test = new Instructor();
            switch(action){
                case 1:
                    test.addInstrutor();
                break;
                case 2:
                    test.viewInstructor();
                break;
                case 3:
                    test.viewInstructor();
                    test.updateInstructor();
                break;
                case 4:
                    test.viewInstructor();
                    test.deleteInstructor();
                    test.viewInstructor();
                break;
            }
             System.out.print("Continue? ");
            resp = sc.next();

        }while(resp.equalsIgnoreCase("yes"));
            System.out.println("Thank You!");

            
        }
         public void addInstrutor(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("Instructor First Name: ");
        String fname = sc.nextLine();
        System.out.print("Intructor Last Name: ");
        String lname = sc.nextLine();
        System.out.print("Instructor Email: ");
        String email = sc.nextLine();
        System.out.print("Department : ");
        String department = sc.nextLine();
        System.out.print("Phone : ");
        String phone = sc.nextLine();
        System.out.print("Date : ");
        String date = sc.nextLine();
        

        String sql = "INSERT INTO instructor (e_fname, e_lname, e_email, e_department, e_phone, e_date) VALUES (?, ?, ?, ?, ?, ?)";


        conf.addRecord(sql, fname, lname, email, department, phone, date);
    }
          private void viewInstructor() {
        
        String qry = "SELECT * FROM instructor";
        String[] hdrs = {"ID", "First Name", "Last Name", "Email", "Department", " Phone", "Date"};
        String[] clms = {"e_id", "e_fname", "e_lname", "e_email", "e_department", "e_phone", "e_date"};

        config conf = new config();
        conf.viewRecords(qry, hdrs, clms);
    }
         private void updateInstructor() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the ID to Update: ");
    int id = sc.nextInt();
    
    System.out.print("Enter new First Name: ");
    String nfname = sc.next();
    System.out.print("Enter new Last Name: ");
    String nlname = sc.next();
    System.out.print("Enter new Email: ");
    String nemail = sc.next();
    System.out.print("Enter new Department: ");
    String ndepartment = sc.next();
    System.out.print("Enter new Phone: ");
    String nphone = sc.next();
    System.out.print("Enter new Date: ");
    String ndate = sc.next();
    
    String qry = "UPDATE instructor SET e_fname = ?, e_lname = ?, e_email = ?, e_department = ?, e_phone = ?, e_date = ? WHERE e_id = ?";
    
    config conf = new config();
    conf.updateRecord(qry, nfname, nlname, nemail, ndepartment, nphone, ndate, id);
}

          private void deleteInstructor(){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the ID to Delete: ");
        int id = sc.nextInt();
        
        String qry = "DELETE FROM instructor WHERE e_id = ?";
        
        config conf = new config();
        conf.deleteRecord(qry, id);
}

    private void addInstruto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
        
