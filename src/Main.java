public class Main {
    public static void main(String[] args) {

        int money = 1100; //количество денег вносимых на счет
        if (money < 1000) {
            System.out.println(money + 100);
        } else  {
            System.out.println(money / 100 + money + 100);
        }
    }
}