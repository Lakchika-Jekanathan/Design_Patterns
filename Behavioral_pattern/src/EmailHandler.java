abstract class EmailHandler {
    protected EmailHandler nextHandler;
    public void setNextHandler(EmailHandler nextHandler) { this.nextHandler = nextHandler; }
    public void handleRequest(String email) {
        if (nextHandler != null) nextHandler.handleRequest(email);
    }
}

class SpamHandler extends EmailHandler {
    public void handleRequest(String email) {
        if (email.contains("spam")) System.out.println("Handled by Spam Handler");
        else super.handleRequest(email);
    }
}

class SalesHandler extends EmailHandler {
    public void handleRequest(String email) {
        if (email.contains("sales")) System.out.println("Handled by Sales Handler");
        else super.handleRequest(email);
    }
}

