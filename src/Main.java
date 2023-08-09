public class Main {
    public static void main(String[] args) {

        int money = 300; //количество денег вносимых на счет
        int cash = 100;
        if (money < 1000) {
            System.out.println(money + cash);
        } else  {
            System.out.println(money / 100 + money + cash);
        }
    }
}