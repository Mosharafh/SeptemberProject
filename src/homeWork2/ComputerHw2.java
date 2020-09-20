package homeWork2;

public class ComputerHw2 {

        String name;
        int price;
        String color;
        public ComputerHw2(){                                                          // Constructor without Perameter/signature

            System.out.println("My Computer");
        }
        public ComputerHw2(String name){                                                // Constructor with Parameter/Signature
            this.name=name;
            System.out.println(this.name);
        }
        public ComputerHw2(String name, int price){                                      // Constructor with Signature
            this.name=name;
            this.price=price;
            System.out.println("Name is"+" "+name+","+" "+"Price is"+" "+price);
        }
        public static void computerInfo(){                                           // Method without Signature
            String name="IBM";
            int price=1000;
            System.out.println("Name is :"+" "+name+"Price is :"+" "+price);

        }
        public static void computerInfo1(String name1,int price1,String color1){      // Method with Signature
            String name=name1;
            int price=price1;
            String color=color1;
            System.out.println("Name is :"+" "+name+"Price is :"+" "+price+" "+"Color is:"+" "+color);

        }


        public static void main(String[] args) {
            ComputerHw2 obj=new ComputerHw2();
            ComputerHw2 obj1=new ComputerHw2("IBM");
            ComputerHw2 obj2=new ComputerHw2("IBM",150);
            ComputerHw2.computerInfo();
            ComputerHw2.computerInfo1("IBM",1500,"Blue");
        }

    }



