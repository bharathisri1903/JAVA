public class Method_overloading{
    void add(int val1,int val2){
        System.out.println(val1+val2);
    }
    void add(int val1,float val2){
        System.out.println(val1+val2);
    }
    void add(float val1,float val2){
        System.out.println(val1+val2);
    }
    void add(int val1,int val2,int val3){
        System.out.println(val1+val2+val3);
    }
    
    public static void main(String args[])
    {
        Method_overloading obj=new Method_overloading();
        obj.add(2,3);//first method 
        obj.add(2,3.5f);//second method
        obj.add(2.6f,3.9f);//third method
        obj.add(2,3,4);//fourth method 
        obj.add(10,15.5f);//if there is no second method,then third method is used
    }
}