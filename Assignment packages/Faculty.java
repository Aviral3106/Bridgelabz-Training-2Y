package college.faculty;

public class Faculty {
    private String name;
    private String subject;
    
    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
    
    @Override
    public String toString() {
        return "Faculty{name='" + name + "', subject='" + subject + "'}";
    }
}
