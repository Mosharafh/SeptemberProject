package homeWork2;

public class MobileHw2 {
    String name;
    double price;

    public MobileHw2(){
        System.out.println("\"I got iphone\"");
    }
    public MobileHw2(String name){
        this.name=name;

        System.out.println("Name is SE :"+name);
    }
    public MobileHw2(String name,double price){
        this.name=name; this.price=price;
        System.out.println("Name is :"+name+" "+"Price is :"+" "+price);
    }
    public static void getinfo(){
        System.out.println("Phone is iPhone 7");
    }
    public static void getinfo1(String name,double price){
        String name1 = "iPhone 6";
        double price1=399.99;

        System.out.println("Phone is :"+name1+"Price is "+price1);
    }


    public static void main(String[] args) {
        MobileHw2 obj=new MobileHw2();
        MobileHw2 obj1=new MobileHw2("iphone");
        MobileHw2 obj2=new MobileHw2("iPhone",399.99);
        MobileHw2.getinfo();
        MobileHw2.getinfo1("iPhonee6",499.99);


    }
}


