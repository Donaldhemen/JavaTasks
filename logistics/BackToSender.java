public class BackToSender {
    public int calculateDailyPay(int successfulDelivery) {
        int basePay = 5000;
        int ridersDailyWage = 0;
        
        if (successfulDelivery < 50) {
            ridersDailyWage = successfulDelivery * 160 + basePay;
        }
        else if (successfulDelivery < 59) {
            ridersDailyWage = successfulDelivery * 200 + basePay;
        }
        else if (successfulDelivery < 69) {
            ridersDailyWage = successfulDelivery * 250 + basePay;
        }
        else {
            ridersDailyWage = successfulDelivery * 500 + basePay;
        }
        return ridersDailyWage;
    }
}
