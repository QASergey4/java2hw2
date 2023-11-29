public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int paymentAmount = 1300;
        int bonusAmount = 0;
        int startGivingBonusAmount = 1000;
        int bonusCoefficient = 100;

        balance = balance + paymentAmount;
        if (paymentAmount > startGivingBonusAmount) {
            bonusAmount = paymentAmount / bonusCoefficient;
        }
        balance = balance + bonusAmount;

        System.out.printf("Вы пополнили баланс на %d руб и получили %d руб бонусов. %nИтоговый баланс %d руб.",
                paymentAmount, bonusAmount, balance);

    }
}