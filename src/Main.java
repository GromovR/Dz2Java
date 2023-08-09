public class Main {
    public static void main(String[] args) {

        int money = 300; //количество денег вносимых на счет
        int bonus = 100;
        if (money < 1000) {
            System.out.println(money + bonus);
        } else  {
            System.out.println(money / 100 + money + bonus);
        }
    }
}