import java.lang.reflect.Array;
import java.util.Arrays;

public class Phone {
    int number;
    String model;
    int weight;
    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){

    }
    public void receiveCall(String name){
        System.out.println("Звонит "+ name);
    }
    public void getNumber() {
        System.out.println(this.number);
    }
    public void receiveCall(String name, int number){
        System.out.println("Звонит "+ name + " " + number);
    }
    public static void sendMessage(int ... number){
        System.out.println(Arrays.toString(number));
    }
}