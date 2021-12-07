package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активный: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        defaultError.printInfo();
        Error notAuthError = new Error(false, 400, "Not Authorise");
        notAuthError.printInfo();
        Error enternalError = new Error(true, 500, "Internal Error");
        enternalError.printInfo();
    }
}
