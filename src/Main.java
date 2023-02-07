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
    }
    public static class Phone {
        int number;
        String model;
        int weight;
        public void receiveCall(String name){
            System.out.println("Звонит "+ name);
        }
        public void getNumber() {
            System.out.println(this.number);
        }
    }
}