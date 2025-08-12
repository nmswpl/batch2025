package in.co.nmsworks.week2.day2;

import in.co.nmsworks.week1.day3.Candidate;

public class CandidateArray
{
    public static void main(String[] args)
    {
        arrayTest();
    }

    private static void arrayTest()
    {

        Candidate[] candidates = new Candidate[] {
                new Candidate(21, "Arunkumar M","gajendrans@nmsworks.co.in","QA"),
                new Candidate(22, "Vasanth S","gajendrans@nmsworks.co.in","Dev"),
                new Candidate(23, "Nandhakumar M","gajendrans@nmsworks.co.in","QA"),
                new Candidate(24, "Ramya S","gajendrans@nmsworks.co.in","Dev"),
                new Candidate(25, "Neha S","gajendrans@nmsworks.co.in","QA"),
                new Candidate(26, "Sabarishwaran S","gajendrans@nmsworks.co.in","Dev"),
                new Candidate(27, "Elakkiya S","gajendrans@nmsworks.co.in","QA"),
                new Candidate(28, "Ellammal","gajendrans@nmsworks.co.in","Dev"),
                new Candidate(29, "Kavibharathi S","gajendrans@nmsworks.co.in","QA"),
                new Candidate(30, "Kabilan R","gajendrans@nmsworks.co.in","Dev"),
                new Candidate(31, "Velmurugan S","gajendrans@nmsworks.co.in","Q"),
                new Candidate(32, "Amarnath M","gajendrans@nmsworks.co.in","Dev"),
                new Candidate(33, "Vinothkumar E","gajendrans@nmsworks.co.in","QA"),
                new Candidate(34, "Kanagavel N","gajendrans@nmsworks.co.in","Dev"),
        };

        System.out.println(candidates.length);

        for(int i = 0; i < candidates.length; i++)
        {
            System.out.println(candidates[i]);
        }

        for(Candidate candidate : candidates)
        {
            System.out.println(candidate);
        }

        for(Candidate candidate : candidates)
        {
            System.out.println(candidate.getId());
        }

        for(Candidate candidate : candidates)
        {
            if(candidate.getDept().equals("QA"))
            {
                System.out.println(candidate.getName());
            }
        }


    }


}
