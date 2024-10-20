public class EmailFilterSystem {
    public static void main(String[] args) {
        EmailHandler spam = new SpamHandler();
        EmailHandler sales = new SalesHandler();
        spam.setNextHandler(sales);


        spam.handleRequest("This is a spam email");
        sales.handleRequest("This is a sales email");
    }
}