class A{
    void vehicle(){
        System.out.println("A person has a bike");
        
    }
}

class B extends A{
    void vehicle(){
        System.out.println("A person has a car");
        super.vehicle();
    }
}

class C extends B{
    void vehicle(){
        System.out.println("A person has a ship");
        super.vehicle();
    }
}

public class Method_overriding_with_super{
    public static void main(String args[])
    {
        C obj=new C();
        obj.vehicle();
        
        System.out.println();
        
        B obj1=new B();
        obj1.vehicle();
    }
}