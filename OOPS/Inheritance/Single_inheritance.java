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


public class Single_inheritance{
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
    }
}