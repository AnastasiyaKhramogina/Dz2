public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676;
        int mile = 20;
        int bonusMiles = ticketPrice / mile;
        if (bonusMiles > 1) {
            System.out.println(bonusMiles);
        } else {
            System.out.println(0);
        }
    }
}