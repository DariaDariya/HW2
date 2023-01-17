public class Main {
    public static void main(String[] args) {
        int ticket = 15000; // Стоимость авиабилета
        int amount = 20; // за какую сумму начисляется 1 балл
        int bonus = ticket / amount;



        System.out.println("Количество начисленных миль: " + bonus);
    }
}