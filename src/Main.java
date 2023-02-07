public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        System.out.println(phone1.number + phone1.model + phone1.weight);
        System.out.println(phone2.number + phone2.model + phone2.weight);
        System.out.println(phone3.number + phone3.model + phone3.weight);
    }
    public static class Phone {
        int number;
        String model;
        int weight;
    }
}