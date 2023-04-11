package vn.longbien.SpringTutorial;

public class ExampleBean {
    private  String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Your Message: " + message);
    }
}
