class A{
    void vehicle(){
        System.out.println("A person has a bike");
    }
}

class B extends A{
    void vehicle(){
        System.out.println("A person has a car");
    }
}

class C extends B{
    void vehicle(){
        System.out.println("A person has a ship");
    }
}

public class Method_overriding_wo_super{
    public static void main(String args[])
    {
        C obj=new C();
        obj.vehicle();
    }
}