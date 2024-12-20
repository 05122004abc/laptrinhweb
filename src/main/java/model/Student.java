package model;

public class Student {
    private int id;
    private String name;
    private String email;
    private int classId; // ID lớp học
    private String className; // Tên lớp học

    public Student() {}

    public Student(int id, String name, String email, int classId, String className) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.classId = classId;
        this.className = className;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
