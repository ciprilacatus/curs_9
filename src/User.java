import java.nio.file.attribute.UserPrincipal;

public class User {
    private String name;
    private int age;
    private String email;
    private String grupa;
    private char sex;

    public User(String name, int age, String email, String grupa, char sex) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.grupa = grupa;
        this.sex = sex;
    }

    public User (String name, int age){
        this.name = name;
        this.age=age;
        //supraincarcare
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", grupa='" + grupa + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}