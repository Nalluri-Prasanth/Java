
public class CallGettersAndSetters {

    public static void main(String[] args) {

        SampleGettersAndSetters gs = new SampleGettersAndSetters();

        gs.setIdnumber(2000030695);
        gs.setName("Prasanth");
        gs.setDepartment("Computer Science and Engineering");
        System.out.println(gs.toString());

        SampleGettersAndSetters student2 = new SampleGettersAndSetters();
        student2.setName("nithin");
        student2.setIdnumber(2000030420);
        student2.setDepartment("Information Technology");
        System.out.println(student2.toString());

    }
}
