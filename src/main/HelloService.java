package main;

public class HelloService{
    public String getMessage(){
        return "Hello World!";
    }

    public static void main(String[] args){
        HelloService service = new HelloService();
        System.out.println(service.getMessage());
    }
}