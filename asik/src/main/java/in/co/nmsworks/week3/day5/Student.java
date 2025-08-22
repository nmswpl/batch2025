package in.co.nmsworks.week3.day5;

public class Student
{
    private String name;
    private int[] grades;
    private double avgGrade;

    public Student(String name, int[] grades)
    {
        this.name = name;
        this.grades = grades;
        this.avgGrade = calculateAverageGrade();
    }

    public String getName()
    {
        return name;
    }

    public int[] getGrades()
    {
        return grades;
    }

    public double getAvgGrade()
    {
        return avgGrade;
    }

    private double calculateAverageGrade()
    {
        int totalMarks = 0;
        for (int grade : grades)
        {
            totalMarks += grade;
        }

        return (double) totalMarks/grades.length;
    }
}
