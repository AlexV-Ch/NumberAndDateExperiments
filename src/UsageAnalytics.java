
// Задание 8.3 Инкремент и декремент
public class UsageAnalytics {
    private int visitsCount;

    public UsageAnalytics() {
        visitsCount = 0;
    }

    public int countVisit() {
        visitsCount++;  //  или просто - return ++visitsCount;
        return visitsCount;
    }

}
