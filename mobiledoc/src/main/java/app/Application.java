package app;

import internal.ClientDB;
import pub.Greeter;

public class Application {
    public static void main(String[] args) {
        // good usage
        System.out.println(new Greeter().greet());

        // bad usage
        System.out.println(new ClientDB().getName());
    }
}
