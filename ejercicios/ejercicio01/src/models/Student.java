package models;

public class Student {
    private String name;
    private String career;
    private String id;

    public Student(String name, String career, String id) {
        this.name = name;
        this.career = career;
        this.id = id;
        setId(id); // Valida al momento de cargar.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && id.length() == 8) {
            this.id = id;
        } else {
            this.id = "Id Invalido";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", career='" + career + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
