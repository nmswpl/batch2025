package in.co.nmsworks.week1.day3;

public class Runner
{
    public static void main(String[] args) {

        Candidate candidate1 = new Candidate();
        candidate1.setId(1);
        candidate1.setName("kabilkumar");
        candidate1.setEmail("abc@gmail.com");
        candidate1.setDepartment("IT");

        Candidate candidate2 = new Candidate();
        candidate2.setId(2);
        candidate2.setName("harish");
        candidate2.setEmail("hh");
        candidate2.setDepartment("hh");

        Candidate candidate3 = new Candidate();
        candidate3.setId(3);
        candidate3.setName("harish");
        candidate3.setEmail("hh");
        candidate3.setDepartment("hh");

        Candidate candidate4 = new Candidate();
        candidate4.setId(4);
        candidate4.setName("harish");
        candidate4.setEmail("hh");
        candidate4.setDepartment("hh");

        Candidate candidate5 = new Candidate();
        candidate5.setId(5);
        candidate5.setName("harish");
        candidate5.setEmail("hh");
        candidate5.setDepartment("hh");

        Candidate candidate6 = new Candidate();
        candidate6.setId(6);
        candidate6.setName("harish");
        candidate6.setEmail("hh");
        candidate6.setDepartment("hh");



        Candidate candidate7 = new Candidate(7,"jjjj","jjj@gmail","developer");
        Candidate candidate8 = new Candidate(8,"jjjj","jjj@gmail","developer");
        Candidate candidate9 = new Candidate(9,"jjjj","jjj@gmail","developer");
        Candidate candidate10 = new Candidate(10,"jjjj","jjj@gmail","developer");
        Candidate candidate11 = new Candidate(11,"jjjj","jjj@gmail","developer");

        print(candidate1);

    }
    public  static  void  print(Candidate candidate)

    {
        System.out.println("ID: " + candidate.getId()+ " Name :"+candidate.getName() + " email :" + candidate.getEmail() +" depart " +candidate.getDepartment() );
    }
}
