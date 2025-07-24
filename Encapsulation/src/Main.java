
    /************************************************************************
     Developer Name : Harshvardhan Vathare
     Developer Content : harsh1234vathare@gmail.com
     Created On : 7/24/2025 3:11 PM
     Project Name : composition
     ************************************************************************/
    public class Main {
        public static void main(String[] args) {
            Laptop laptop = new Laptop();

            System.out.println(laptop.getProcessor().getBrand());
            System.out.println("Graphic Card is : "+ laptop.getGraphicsCard().getBrand());
            System.out.println("Series is : "+ laptop.getGraphicsCard().getSeries());

            System.out.println();
            Processor p1 = new Processor();
            GraphicsCard g1 = new GraphicsCard();
            Laptop l1 = new Laptop(24.5f, p1, "8GB", "250GB", g1, "Multi Layer", "Backlit");
            System.out.println(l1);
        }
    }
}