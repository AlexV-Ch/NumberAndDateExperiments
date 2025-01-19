public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Сам
        MoneyCalculator casset1 = new MoneyCalculator();
        System.out.println(casset1.calculateCassetteCount(1999));
        System.out.println(casset1.calculateCassetteCount(2000));
        System.out.println(casset1.calculateCassetteCount(2001));
        System.out.println(casset1.calculateCassetteCount(2500));
        System.out.println(casset1.calculateCassetteCount(4000));
        System.out.println(casset1.calculateCassetteCount(4001));
        // По рекомендации
        System.out.println(MoneyCalculator.calculateCassetteCount(5000));

    }
}
