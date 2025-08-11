package in.co.nmsworks.week2.day1;

public class Teacher
{
    private  int idname;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  Teacher()
    {
    }

    public  Teacher(int idname, String name)
    {
        this.idname=idname;
        this.name=name;
    }

    public int getId() {
        return idname;
    }

    public void setId(int idname) {
        this.idname = idname;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
