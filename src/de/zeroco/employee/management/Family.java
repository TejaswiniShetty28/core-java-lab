package de.zeroco.employee.management;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Family {

    public final static String FILE_NAME = "family.csv";
    public final static String[] HEADERS = {"nick_name", "name", "earning", "role", "gender", "dob"};
    private String nickName;
    private String name;
    private String earning;
    private String role;
    private String gender;
    private LocalDate dob;

    public Family(String name, String earning, String role, String gender, String dob) {
        this.name = name;
        this.earning = earning;
        this.role = role;
        this.gender = gender;
        this.dob = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String getNickName() {
        return nickName;
    }

    public String setNickName(String nickName) {
        return this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getEarning() {
        return earning;
    }

    public String setEarning(String earning) {
        return this.earning = earning;
    }

    public String getRole() {
        return role;
    }

    public String setRole(String role) {
        return this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public String setGender(String gender) {
        return this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public LocalDate setDob(String dob) {
        return this.dob = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Override
    public String toString() {
        return getNickName() + "," + getName() + "," + getEarning() + "," + getRole() + "," + getGender() + "," + getDob();
    }

    public static Family toObject(String csvRow) {
        String[] values = csvRow.split(",");
        String name = values[1];
        String earning = values[2];
        String role = values[3];
        String gender = values[4];
        String dob = values[5];
        return new Family(name, earning, role, gender, dob);
    }

    public static String getFilePath() {
        return Configuration.FILE_DIRECTORY_PATH + FILE_NAME;
    }

    static {
        if (!Utility.ifFileExist(getFilePath())) {
            try {
                Utility.writeHeadersInCsv(HEADERS, Configuration.FILE_DIRECTORY_PATH, FILE_NAME);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Utility.validateCSVHeaders(getFilePath(), HEADERS);
        }
    }
    
}
