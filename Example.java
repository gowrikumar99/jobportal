
import java.util.*;

class Job {
    private String companyname;
    private int jobid;
    private String jobrole;
    private String qualification;
    private String keyskill;
    private String location;
    private float experience;
    private String postdate;
    private String type_of_job;
    private String domain;

    public Job(int jobid,String companyname, String jobrole, String qualification, String keyskill, String location,
            float experience, String postdate, String type_of_job, String domain) {
        this.jobid = jobid;
        this.companyname = companyname;
        this.jobrole = jobrole;
        this.qualification = qualification;
        this.keyskill = keyskill;
        this.location = location;
        this.experience = experience;
        this.postdate = postdate;
        this.type_of_job = type_of_job;
        this.domain = domain;
    }

    public String getCompanyname() {
        return companyname;
    }

    public int getJobid() {
        return jobid;
    }

    public String getJobrole() {
        return jobrole;
    }

    public String getQualification() {
        return qualification;
    }

    public String getKeyskill() {
        return keyskill;
    }

    public String getLocation() {
        return location;
    }

    public float getExperience() {
        return experience;
    }

    public String getPostdate() {
        return postdate;
    }

    public String getType_of_job() {
        return type_of_job;
    }

    public String getDomain() {
        return domain;
    }

    public String toString() {
        return "Company Name: " + companyname + "\nJob ID: " + jobid + "\nJob Role: " + jobrole + "\nQualification: "
                + qualification + "\nKey Skill: " + keyskill + "\nLocation: " + location + "\nExperience: "
                + experience + "\nPost Date: " + postdate + "\nType of Job: " + type_of_job + "\nDomain: " + domain;
    }
}

class Employee {
    private int empid;
    private String empname;
    private String companyname;
    private String designation;
    private HashMap<Integer, Job> post;

    Employee(int empid, String empname, String companyname, String designation) {
        this.empid = empid;
        this.empname = empname;
        this.companyname = companyname;
        this.designation = designation;
        this.post = new HashMap<Integer, Job>();
    }

    public int getEmpId() {
        return empid;
    }

    public String getEmpName() {
        return empname;
    }

    public String getCompanyName() {
        return companyname;
    }

    public String getDesignation() {
        return designation;
    }

    public HashMap<Integer, Job> getPost() {
        return post;
    }

public void add()
{

    String companyname;
    int jobid;
    String jobrole;
    String qualification;
    String keyskill;
    String location;
    float experience;
    String postdate;
    String type_of_job;
    String domain;
Scanner sc=new Scanner(Sytem.in)
System.out.println("job id");
jobid=sc.nextInt();
System.out.println("company name");
companyname=sc.nextLine();
System.out.println();
System.out.println("jobrole");
jobrole=sc.nextLine();
System.out.println();
System.out.println("qualification");
qualification=sc.nextLine();
System.out.println();
System.out.println("keyskill");
keyskill=sc.nextLine();
System.out.println();
System.out.println("location");
location=sc.nextLine();
System.out.println();
System.out.println("experience");
experience=sc.nextFloat();
System.out.println();
System.out.println("postdate");
postdate=sc.nextLine();
System.out.println();
System.out.println("type_of_job (part time/full time)");
type_of_job=sc.nextLine();
System.out.println();
System.out.println("domain");
domain=sc.nextLine();
    post.put(jobid, new Job(jobid,companyname,jobrole,qualification,keyskill,location,experience,postdate,typy_of_job,domain));
}
    public String toString() {
        return "Employee ID: " + empid + "\nEmployee Name: " + empname + "\nCompany Name: " + companyname
                + "\nDesignation: " + designation + "\nPosts: " + post;
    }
}


class Main {
public void madd()
{
int id;
String name;
String companyname;
String designation;
Scanner sc=new Scanner(Sytem.in)
System.out.println("employee id");
id=sc.nextInt();
System.out.println("employee name");
name=sc.nextLine();
System.out.println("employee company name");
companyname=sc.nextLine();
System.out.println("employee designation");
designation=sc.nextLine();
Employee e = new Employee(id,name,companyname,designation);
        e.add();
        System.out.println(e);
}
   public static void main(String args[]) { 
Main m=new Main();
m.madd();
}    
}