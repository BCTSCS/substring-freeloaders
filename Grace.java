public class Grace {
    static class Classname {
        private String month;
        private int day;
        private String gift;

        public Classname(String gift) {
            this.gift = gift;
        }

        public String getGift() {
            return gift;
        }

        public void setGift(String gift) {
            this.gift = gift;
        }

        public String toString() {
            return "Grace " + month + " " + day + " and " + gift;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public void setDay(int day) {
            this.day = day;
        }
    }

    public static void main(String[] args) {
        Classname GraceBirthday = new Classname("present");
        GraceBirthday.setMonth("July");
        GraceBirthday.setDay(30);
        
        System.out.println(GraceBirthday.toString());
    }
}
