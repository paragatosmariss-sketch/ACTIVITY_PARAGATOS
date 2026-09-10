import java.util.Scanner;
import java.util.regex.Pattern;

class UserAccount_Paragatos {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public UserAccount_Paragatos(String firstName, String middleName,
                                 String lastName, String address,
                                 String email, String password) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;

        setEmail(email);
        setPassword(password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String emailPattern =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (Pattern.matches(emailPattern, email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException(
                    "Invalid email format.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[0-9].*")) {

            this.password = password;

        } else {
            throw new IllegalArgumentException(
                    "Password must be at least 8 characters "
                    + "with uppercase, lowercase, and number.");
        }
    }
}

public class Main_Paragatos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== USER REGISTRATION ===");

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Address: ");
        String address = input.nextLine();

        System.out.print("Enter Email: ");
        String email = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        UserAccount_Paragatos user =
                new UserAccount_Paragatos(
                        firstName,
                        middleName,
                        lastName,
                        address,
                        email,
                        password
                );

        System.out.println("\n=== ACCOUNT INFORMATION ===");

        System.out.println("Full Name: "
                + user.getFirstName() + " "
                + user.getMiddleName() + " "
                + user.getLastName());

        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());

        input.close();
    }
}