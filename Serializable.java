import java.io.*;

class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String contactNo;
    private String address;

    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    // Getters and setters
    // ...

    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", "1234567890", "123 Main St");
        
        try {
            FileOutputStream fileOut = new FileOutputStream("JavaObject.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(customer);
            objectOut.close();
            System.out.println("Customer object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}