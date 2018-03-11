package mysql.working.with.java;

import string.builder.MyStringBuilder;

import java.util.Scanner;

public class Students {
    // create the student object
    private int id;
    private String rollNumber;
    private String name;
    private long birthday;
    private String email;
    private String phone;
    private String address;
    private long createdAt;
    private long updatedAt;
    private int status;

    private Scanner sc = new Scanner(System.in);

    // add new student method
    public void inputStudent() {
        this.setRollNumber();
        this.setName();
        this.setBirthday();
        this.setEmail();
        this.setPhone();
        this.setAddress();
    }

    public void addNewStudent() {
        // require package

        MyStringBuilder myStringBuilder = new MyStringBuilder();
        DatabaseConnection databaseConnection = new DatabaseConnection();

        String[] attrs = new String[]{"rollNumber", "name", "birthday", "email", "phone", "address", "createdAt", "updatedAt"};

        // build a insert into string with myStringBuilder package, the params is table name and the array of attributes
        String insertStudentString = myStringBuilder.mySqlInsertBuilder("students", attrs);

        // create and set value to prepared statement of my SQL
        databaseConnection.getConnect();
        databaseConnection.createPrepareStatement(insertStudentString);
        databaseConnection.pstmtSetString(1, this.rollNumber);
        databaseConnection.pstmtSetString(2, this.name);
        databaseConnection.pstmtSetLong(3, this.birthday);
        databaseConnection.pstmtSetString(4, this.email);
        databaseConnection.pstmtSetString(5, this.phone);
        databaseConnection.pstmtSetString(6, this.address);
        databaseConnection.pstmtSetLong(7, System.currentTimeMillis());
        databaseConnection.pstmtSetLong(8, System.currentTimeMillis());

        // execute the statement
        databaseConnection.execPrepareStatement();
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber() {
        System.out.println("Please insert student's Roll Number: ");
        this.rollNumber = this.sc.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Please enter student's Name: ");
        this.name = this.sc.nextLine();
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday() {
        System.out.println("Please enter student's Birthday: ");
        this.birthday = this.sc.nextLong();
        sc.nextLine();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        System.out.println("Please enter student's Email: ");
        this.email = this.sc.nextLine();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        System.out.println("Please enter student's Phone Number: ");
        this.phone = this.sc.nextLine();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        System.out.println("Please enter student's Address: ");
        this.address = this.sc.nextLine();
    }
}
