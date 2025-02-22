package net.guides.springboot.Admin_User.dto;

public class UserDto {

    private String email;
    private String password;
    private String role;
    private String fullname;
    private String bloodgroup;
    private String gender;
    private String age;
    private String address;
    private String phoneno;
    private String medical;
    private String num;



    public UserDto(String email, String password, String role, String fullname, String bloodgroup, String gender, String age, String address, String phoneno,String medical,String num) {
        super();
        this.email = email;
        this.password = password;
        this.role = role;
        this.fullname = fullname;
        this.bloodgroup = bloodgroup;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phoneno = phoneno;
        this.medical=medical;
        this.num=num;


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    public String getMedical(){return medical;}
    public void setMedical(String medical){this.medical=medical;}
    public String getNum(){return num;}
    public void setNum(String num){this.num=num;}




}







