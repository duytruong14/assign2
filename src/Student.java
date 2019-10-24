import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Student {
    private String PeopleSsoft; private String First; private String Last;
    private String Classes; private String Email;
    private String line1;private String City;private String State; private String zipcode;
    private static Pattern p = Pattern.compile("^[a-zA-Z]*$"); //check for alphabet only
    private static Pattern p1 = Pattern.compile("^[0-9]*$");//check for number only
    private static Pattern p2 = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9.-]+$");//check for email
    private static Pattern p3 = Pattern.compile("^\\d+\\s[a-zA-Z]+(\\s[a-zA-Z-]*)?$");//check for address
    private static Pattern p4 = Pattern.compile("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$");//check for city name
    private static Scanner input=new Scanner(System.in);
    private static int count;






    public void getInfo(){
        System.out.println("Enter the student first name: ");
        String firstname=input.nextLine();
        boolean check1=p.matcher(firstname).find();
        while (check1==false){
            System.out.println("First name can only contain alphabet letter, try again: ");
            firstname=input.nextLine();
            check1=p.matcher(firstname).find();}
        First=firstname;

        System.out.println("Enter the student last name: ");
        String lastname=input.nextLine();
        boolean check2=p.matcher(lastname).find();
        while (check2==false){
            System.out.println("Last name can only contain alphabet letter, try again: ");
            lastname=input.nextLine();
            check2=p.matcher(lastname).find();
        }
        Last=lastname;

        System.out.println("Enter the student PeopleSoft id, make sure it contain only numbers and less than or equal to 7 digit: ");
        String id=input.nextLine();
        boolean check4=p1.matcher(id).find();
        while ((check4==false)||(id.length()>7)){
            System.out.println("Cannot contain a letter or bigger than 7 digit.Try again ");
            id=input.nextLine();
            check4=p1.matcher(id).find();
        }
        PeopleSsoft=id;

        System.out.println("Enter class standing, make sure it only freshman,sophomore,junior, or senior: ");
        String Class=input.nextLine().toLowerCase();
        while ((!Class.contains("freshman"))&&(!Class.contains("sophomore"))&&(!Class.contains("junior"))&&(!Class.contains("senior"))){
            System.out.println("Incorrect, class have to be only freshman,sophomore,junior, or senior .Try again: ");
            Class=input.nextLine().toLowerCase();}
        Classes=Class;

        System.out.println("Enter email address: ");
        String email=input.nextLine();

        boolean check5=p2.matcher(email).find();
       while ((check5==false)||((!email.contains("edu"))&&(!email.contains("com"))&&(!email.contains("org")))||(!email.contains("."))){
            System.out.println("Wrong format, try again: ");
            email=input.nextLine();
            check5=p2.matcher(email).find();}
        Email=email;

        String[] list={"AK","AL","AR","AZ","CA","CO","CT","DC","DE","FL","GA","HI","IA","ID","IL","IN","KS","KY","LA","MA","MD","ME","MI","MN","MO","MS","MT","NC","ND","NE","NH","NJ","NM","NV","NY","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VA","VT","WA","WI","WV","WY"};


        System.out.println("Enter address line: ");
        String line=input.nextLine();
        boolean check6=p3.matcher(line).find();
        while (check6==false){
            System.out.println("Wrong format for address, try again: ");
            line=input.nextLine();
            check6=p3.matcher(line).find();
        }

        System.out.println("Enter city name: ");
        String city=input.nextLine();
        boolean check=p4.matcher(city).find();
        while (check==false){
            System.out.println("City can only contain alphabet letter, try again: ");
            city=input.nextLine();
            check=p4.matcher(city).find();}

        System.out.println("Enter state's initials (2 letter only): ");
        String states=input.nextLine().toUpperCase();
        boolean contains = Arrays.stream(list).anyMatch(states::equals);
        while (contains==false){
            System.out.println("Not apart of the 50 state,try again: ");
             states=input.nextLine().toUpperCase();
            contains = Arrays.stream(list).anyMatch(states::equals);
        }
        System.out.println("Enter zip code, note that zip code should be 9 digit ");
        String zip=input.nextLine();
        boolean check3=p1.matcher(zip).find();
        while ((check3==false)||(zip.length()!=9)){
            System.out.println("Cannot contain a letter and have to be 9 digit.Try again ");
            zip=input.nextLine();
            check3=p1.matcher(zip).find();

        }

    line1=line;City=city;State=states;zipcode=zip;
    }
    public void displayInfo(){
    System.out.println("First name: "+First);
    System.out.println("Last name: "+Last);
    System.out.println("PeopleSoft id: "+PeopleSsoft);
    System.out.println("Class: "+Classes);
    System.out.println("Email: "+Email);
    System.out.println("Address: "+line1+". "+City+", "+State+" "+zipcode);
    System.out.println("\t");
    }
    public void studentNumber(int a){
    count=a;
    System.out.println("The number of student is "+count);
    }

}
