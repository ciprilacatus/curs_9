
public class Profesor extends User {

    private String disciplina;
    private String grad;
    private String phoneNumber;
    private String program;

    public Profesor(String name, int age, String email, String grupa, char sex, String disciplina,
                    String grad, String phoneNumber, String program) {
        super(name, age, email, grupa, sex);
        this.disciplina = disciplina;
        this.grad = grad;
        this.phoneNumber = phoneNumber;
        this.program = program;


    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }


    @Override //anotari    ///suprascriere
    public String toString() {
        return "Profesor{" +
                "disciplina='" + disciplina + '\'' +
                "name='" + getName() + '\'' +
                "age='" + getAge() + '\'' +
                "email='"+ getEmail() + '\'' +
                "grupa='"+ getGrupa() + '\'' +
                "sex='"+ getSex() + '\'' +
                ", grad='" + grad + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", program='" + program + '\'' +
                '}';
    }



}
