import java.security.KeyStore;
import java.util.*;

public class Passport {

    private String name;
    private String city;
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    Passport(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport [name :" + name + " ,city :" + city + " ,country : " + country + "]";
    }
}
    class LaunchMap{
        public static void main(String[] args) {
            Passport pp1 = new Passport("Shivam","Nashik","India");
            Passport pp2 = new Passport("Ram","Akola","India");
            Passport pp3 = new Passport("Nakul","Akola","India");

            Integer id1 = Integer.valueOf(101);
            Integer id2 = Integer.valueOf(201);
            Integer id3 = Integer.valueOf(301);

            HashMap<Integer,Passport> hm1 = new HashMap<>();
            hm1.put(id1,pp1);
            hm1.put(id2,pp2);
            hm1.put(id3,pp3);

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter PassportNumber");
            int userNum = sc.nextInt();

           Set entry= hm1.entrySet();
           Iterator itr = entry.iterator();
           boolean flag = false;
           while (itr.hasNext()){
               Map.Entry keyvalue  = (Map.Entry) itr.next();
               Integer key =( Integer)keyvalue.getKey();
               if(userNum == key){
                   System.out.println("please find your passport detail below");
                   System.out.println(keyvalue.getValue());
                   flag = true;

               }
               }
           if(flag == false){
               System.out.println("passport not found");
           }
        }
    }

