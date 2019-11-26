package pub;

import internal.ClientDB;

public class Greeter {

    private ClientDB clientDB;

    public Greeter() {
        clientDB = new ClientDB();
    }

    public String greet() {
        return "Hello " + clientDB.getName() + "!";
    }
}
