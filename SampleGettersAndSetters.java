public class SampleGettersAndSetters {

    private long idnumber;
    private String name;
    private String Department;

    public long getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(long idnumber) {
        this.idnumber = idnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "SampleGettersAndSetters [idnumber=" + idnumber + ", name=" + name + ", Department=" + Department + "]";
    }

}