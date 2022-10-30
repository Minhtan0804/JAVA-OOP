package Relationship_Between_Class.J06005;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String clientID;
    private String clientName;
    private String gender;
    private Date dateOfBirth;
    private String address;

    public Client(String clientName, String gender, String dateOfBirth, String address) throws Exception {
        this.clientID = String.format("KH%03d", count.incrementAndGet());
        this.clientName = clientName;
        this.gender = gender;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfBirth = dateFormat.parse(dateOfBirth);
        this.address = address;
    }

    public String getClientID() {
        return clientID;
    }

    @Override
    public String toString() {
        return this.clientName + " " + this.address + " ";
    }
}
