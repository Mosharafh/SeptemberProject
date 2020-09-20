package homeWork2;

public class PizzaHw2 {
    String pizzaName = "Regular";
    static char pizza_size='M';
    String address;
    int orderNumber;
    int quantiry;

    public PizzaHw2(){
        System.out.println("Welcome to PizzaIsland");
    }
    public PizzaHw2(String pizzaName){
        this.pizzaName=pizzaName;
        System.out.println("Pizza Name is: " +this.pizzaName);
    }
    public PizzaHw2(String pizzaName,int orderNumber){
        this.pizzaName=pizzaName;
        this.orderNumber=orderNumber;
        System.out.println(this.pizzaName+"Order Number is :"+this.orderNumber);
    }
    public PizzaHw2(String pizzaName,int orderNumber,int quantiry){
        this.pizzaName=pizzaName;
        this.orderNumber=orderNumber;
        this.quantiry=quantiry;
        System.out.println(this.pizzaName+"Order Number is :"+this.orderNumber+"Quantity is :"+quantiry);
    }
    public static void getInfo(){
        String name1="Vege Pizza";
        double qtny=10;
        System.out.println("Pizza Name is:"+name1+" "+"Quantity is :"+qtny);

    }
    public static String getInfo1(String pizzaName){
        String pizzName=pizzaName;
        System.out.println("Pizza Name is:"+pizzaName);
        return pizzaName;
    }




    public static void main(String[] args) {
        double price=10.99;
        PizzaHw2 pz=new PizzaHw2();
        System.out.println("Pizza Name is: "+pz.pizzaName);
        System.out.println("Price is :"+price);
        System.out.println("Pizza Size is :"+PizzaHw2.pizza_size);
        PizzaHw2 pz1=new PizzaHw2("Regular");
        PizzaHw2 pz2=new PizzaHw2("Regular",2);
        PizzaHw2 pz3=new PizzaHw2("Regular",2,3);
        PizzaHw2.getInfo();
        PizzaHw2.getInfo1("Regular");

    }



}

