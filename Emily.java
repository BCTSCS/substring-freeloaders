public class Emily {
    private String month;
    private int day;
    private String gift;

    public Emily(String gift, int day, String month) {
        this.gift = gift;
        this.day = day;
        this.month = month;
    }
    public Emily() {
        this.day = 3;
        this.month = "October";
    }
    public String getGift() {
        return gift;
    }
    public void setGift(String gift) {
        this.gift = "Book";
    }
    public String toString() {
        return "Emily:" + month + " " + day + " - " + gift;
    }
}
