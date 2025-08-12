package in.co.nmsworks.week2.day2;

import in.co.nmsworks.week1.day2.string.Candidate;

public class CandidateArray
{
    public static void main(String[] args) {
        printCandidate();
    }
    public static void printCandidate() {
        Candidate c21 = new Candidate(21, "Arunkumar M", "gajendrans@nmsworks.co.in", "QA");
        Candidate c22 = new Candidate(22, "Vasanth S", "gajendrans@nmsworks.co.in", "Dev");
        Candidate c23 = new Candidate(23, "Nandhakumar M", "gajendrans@nmsworks.co.in", "QA");
        Candidate c24 = new Candidate(24, "Ramya S", "gajendrans@nmsworks.co.in", "Dev");
        Candidate c25 = new Candidate(25, "Neha S", "gajendrans@nmsworks.co.in", "QA");
        Candidate c26 = new Candidate(26, "Sabarishwaran S", "gajendrans@nmsworks.co.in", "Dev");
        Candidate c27 = new Candidate(27, "Elakkiya S", "gajendrans@nmsworks.co.in", "QA");
        Candidate c28 = new Candidate(28, "Ellammal", "gajendrans@nmsworks.co.in", "Dev");
        Candidate c29 = new Candidate(29, "Kavibharathi S", "gajendrans@nmsworks.co.in", "QA");
        Candidate c30 = new Candidate(30, "Kabilan R", "gajendrans@nmsworks.co.in", "Dev");
        Candidate c31 = new Candidate(31, "Velmurugan S", "gajendrans@nmsworks.co.in", "QA");
        Candidate c32 = new Candidate(32, "Amarnath M", "gajendrans@nmsworks.co.in", "Dev");
        Candidate c33 = new Candidate(33, "Vinothkumar E", "gajendrans@nmsworks.co.in", "QA");
        Candidate c34 = new Candidate(34, "Kanagavel N", "gajendrans@nmsworks.co.in", "Dev");
        Candidate[] candidates = new Candidate[] {c21 , c22 , c23, c24 , c25, c26, c27 ,c28 , c29, c30, c31 , c32, c33,c34};
        System.out.println(candidates.length);



        for(Candidate var : candidates){
            System.out.println(var);
        }

        System.out.println(" ");

        for(int i=0;i<candidates.length;i++){
            if(candidates[i].getDept().equals("QA"))
            {
                System.out.println(candidates[i].getName());
            }
        }



    }
}
