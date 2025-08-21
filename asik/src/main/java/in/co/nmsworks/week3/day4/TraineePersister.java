package in.co.nmsworks.week3.day4;

import java.util.Objects;

public class TraineePersister implements Comparable<TraineePersister>
{
    private int id;
    private String name;
    private String dept;

    public TraineePersister()
    {}

    public TraineePersister(int id, String name, String dept)
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDept()
    {
        return dept;
    }

    public void setDept(String dept)
    {
        this.dept = dept;
    }


    @Override
    public String toString()
    {
        return "TraineePersister{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public int compareTo(TraineePersister o)
    {
        return id - o.getId();
    }
}
