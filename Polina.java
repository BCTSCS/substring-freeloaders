public class Polina {
    private String month;
    private int day;
    private String gift;
    
    public Polina(String gift) {
        this.month = "July"; 
        this.day = 22;
        this.gift = gift;
    }
    
    public String getGift() {
        return gift;
    }
    
    public void setGift(String gift) {
        this.gift = gift;
    }
    
    public String toString() {
        return "Polina Birth Month: " + month + ", Day: " + day + ", Gift: " + gift;
    }
    
    public static void main(String[] args) {
        Polina myGift = new Polina("Laptop");
        System.out.println(myGift.toString());
    }
}