class vehicle{
    String brand,color;
    int wheels,seats;
    
    void brake(){
        System.out.println("Brake is applied");
    }
    void accelerator(){
        System.out.println("Accelerator is applied");
    }
}

class car extends vehicle{
    void airbag(){
        System.out.println("Airbag is applied");
    }
    void ac(){
        System.out.println("AC is applied");
    }
}


class bike extends vehicle{
    void handlebar(){
        System.out.println("Handlebar is available");
    }
    void stand(){
        System.out.println("Stand feature is available");
    }
}
public class Hierarchical_inheritance{
    public static void main(String args[])
    {
        car car1=new car();
        System.out.println("Car details");
        car1.airbag();
        car1.ac();
        car1.brake();
        car1.accelerator();
        car1.brand="Audi";
        car1.color="Black";
        car1.wheels=4;
        car1.seats=5;
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.wheels);
        System.out.println(car1.seats);
        System.out.println();
        
        System.out.println("Bike details");
        bike bike1=new bike();
        bike1.brake();
        bike1.accelerator();
        bike1.handlebar();
        bike1.stand();
        bike1.brand="Yamaha";
        bike1.color="Blue";
        bike1.wheels=2;
        bike1.seats=2;
        System.out.println(bike1.brand);
        System.out.println(bike1.color);
        System.out.println(bike1.wheels);
        System.out.println(bike1.seats);
    }
}