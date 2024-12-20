package model;

// Lớp biểu diễn thông tin lớp học
public class Class {
    private int classId;
    private String className;
    private String description;

    // Constructor
    public Class() {
    }

    public Class(int classId, String className, String description) {
        this.classId = classId;
        this.className = className;
        this.description = description;
    }

    // Getters và Setters
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Override toString() để in thông tin lớp học
    @Override
    public String toString() {
        return "Class [ID = " + classId + ", Tên lớp = " + className + ", Mô tả = " + description + "]";
    }
}