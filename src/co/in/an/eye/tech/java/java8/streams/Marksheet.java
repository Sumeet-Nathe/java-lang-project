package co.in.an.eye.tech.java.java8.streams;

import java.util.Objects;

public class Marksheet {
    private int subjectId;
    private int maximumMarks;
    private int marksObtainByStudent;

    public Marksheet(int subjectId, int marksObtainByStudent, int maximumMarks) {
        this.subjectId = subjectId;
        this.maximumMarks = maximumMarks;
        this.marksObtainByStudent = marksObtainByStudent;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getMaximumMarks() {
        return maximumMarks;
    }

    public void setMaximumMarks(int maximumMarks) {
        this.maximumMarks = maximumMarks;
    }

    public int getMarksObtainByStudent() {
        return marksObtainByStudent;
    }

    public void setMarksObtainByStudent(int marksObtainByStudent) {
        this.marksObtainByStudent = marksObtainByStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marksheet marksheet = (Marksheet) o;
        return subjectId == marksheet.subjectId && maximumMarks == marksheet.maximumMarks && marksObtainByStudent == marksheet.marksObtainByStudent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectId, maximumMarks, marksObtainByStudent);
    }

    @Override
    public String toString() {
        return "Marksheet{" +
                "subjectId=" + subjectId +
                ", maximumMarks=" + maximumMarks +
                ", marksObtainByStudent=" + marksObtainByStudent +
                '}';
    }
}
