package ua.edu.ucu;

class Student {

    private double GPA;
    private int year;
    private String name;
    private String surname;

    Student(String name, String surname, double GPA, int year) {
        this.GPA = GPA;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", surname="
        + surname + ", " + "GPA=" + GPA + ", year=" + year + '}';
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Student)) {
            return false;
        }
        Student st = ((Student) other);
        return this.getName().equals(st.getName()) 
            && this.getSurname().equals(st.getSurname())
            && this.getYear() == st.getYear()
            && Math.abs(this.getGPA()- st.getGPA()) < .0000001;
    }

    @Override
    public int hashCode() {
        return this.getYear();
    }

}
