package personClass;

import java.time.LocalDateTime;

public class Person {
    String uniqueID;
    LocalDateTime contactDate;
    String name;

    public Person(String name, String id) {
        this.uniqueID = id;
        this.contactDate = LocalDateTime.now();
        this.name = name;
    }

    public String toString() {
        return String.format("%s\nid:: %s\nContact Date: %s", name, uniqueID, contactDate);
    }

    public String getID() {
        return this.uniqueID;
    }

    public LocalDateTime getContactDate() {
        return this.contactDate;
    }

}