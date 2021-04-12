public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        // подготавливаемданные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        // вызываемцелевойметод:
        long actual = service.calculate(amount, registered);
        // производимпроверку (сравниваеможидаемыйифактический):
        // если true — то PASS// если false — то FAIL
        boolean passed = expected == actual;
        // выводимрезультат
        System.out.println(passed);
    }
}