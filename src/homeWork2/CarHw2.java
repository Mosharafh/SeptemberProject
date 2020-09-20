package homeWork2;

public class CarHw2 {
        int made;
        String model;
        int mileage;

        public CarHw2() {
            System.out.println("Car Name is BMW");

        }

        public CarHw2(int made) {
            this.made = made;
            System.out.println("Year is :" + made);

        }

        public CarHw2(int made, String model) {
            this.made = made;
            this.model = model;
            System.out.println("Year Made :" + made + " " + "Model is :" + model);

        }

        public static void getcar() {
            System.out.println("My Car is COOL");
        }

        public static void CarInfo() {
            String carname = "HighLander";
            int mileage = 38000;
            System.out.println("My car is :" + carname + " " + "Mileage is :" + mileage);

        }

        public static void Carinfo1(String model1) {
            String model = model1;

            System.out.println("Model is :" + model);

        }

        public static void Carinfo2(String model1, int mileage1) {
            String model = model1;
            int mileage = mileage1;

            System.out.println("Model is :" + model);

        }

        public static void main(String[] args) {
            CarHw2 obj = new CarHw2();
            CarHw2 obj1 = new CarHw2(1920);
            CarHw2 obj2 = new CarHw2(1920, "X6");
            CarHw2.getcar();
            CarHw2.CarInfo();
            Carinfo1("Highlander");
            Carinfo2("Highlander", 38000);


        }

    }


