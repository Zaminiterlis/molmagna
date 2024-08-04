public class Main {
    public static void main(String[] args) {
        long totalItems = 1000;
        Pager pager = new Pager(totalItems);  // Creating a new Pager object

        // Accessing totalCount after object creation
        System.out.println("Total count of items: " + pager.getTotalCount());
    }
}
