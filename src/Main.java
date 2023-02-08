public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        System.out.println(phone1.number + phone1.model + phone1.weight);
        System.out.println(phone2.number + phone2.model + phone2.weight);
        System.out.println(phone3.number + phone3.model + phone3.weight);
        phone1.receiveCall("Паша");
        phone2.receiveCall("Саша");
        phone3.receiveCall("Наташа");
        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();
        phone1.receiveCall("Паша", 2654);
        phone2.receiveCall("Саша", 7954);
        phone3.receiveCall("Наташа", 4125);
        phone1.sendMessage(5258,6741,5123);
        phone2.sendMessage(2459,7541,2654);
        phone3.sendMessage(1895,9641,8225);
    }
}