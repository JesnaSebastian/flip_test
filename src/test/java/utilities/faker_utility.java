package utilities;

import com.github.javafaker.Faker;

public class faker_utility {
    public static String generetefirstname()
    {
        Faker faker=new Faker()  ;
        String Firstname=faker.name().firstName();
        return Firstname;
    }
    public static String generetelastname()
    {
        Faker faker=new Faker()  ;
        String Lastname=faker.name().lastName();
        return Lastname;
    }
    public static String genereteemail()
    {
        Faker faker=new Faker()  ;
        String email=faker.name().lastName()+"@gmail.com";
        return email;
    }
    public static String phonenum()
    {
        Faker faker=new Faker()  ;
        String phonenumber= String.valueOf(faker.phoneNumber());
        return phonenumber;
    }
    public static String Street1()
    {
        Faker faker=new Faker()  ;
        String s1= faker.address().city();
        return s1;
    }
    public static String Street2()
    {
        Faker faker=new Faker()  ;
        String s2= faker.address().city();
        return s2;
    }

    public static String postalcode()
    {
        Faker faker=new Faker()  ;
        String sp= faker.address().zipCode();
        return sp;
    }
    public static String country()
    {
        Faker faker=new Faker()  ;
        String coun= faker.address().country();
        return coun;
    }
}

