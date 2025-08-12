package in.co.nmsworks.week2.day2;

import in.co.nmsworks.week1.day3.Candidate;

public class CandidateArray {

    public static void enterCandidateDetails(){
    }
    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[14];
        Candidate c21 = new Candidate(21, "Arunkumar M","gajendrans@nmsworks.co.in","QA");
        Candidate c22 = new Candidate(22, "Vasanth S","gajendrans@nmsworks.co.in","Dev");
        Candidate c23 = new Candidate(23, "Nandhakumar M","gajendrans@nmsworks.co.in","QA");
        Candidate c24 = new Candidate(24, "Ramya S","gajendrans@nmsworks.co.in","Dev");
        Candidate c25 = new Candidate(25, "Neha S","gajendrans@nmsworks.co.in","QA");
        Candidate c26 = new Candidate(26, "Sabarishwaran S","gajendrans@nmsworks.co.in","Dev");
        Candidate c27 = new Candidate(27, "Elakkiya S","gajendrans@nmsworks.co.in","QA");
        Candidate c28 = new Candidate(28, "Ellammal","gajendrans@nmsworks.co.in","Dev");
        Candidate c29 = new Candidate(29, "Kavibharathi S","gajendrans@nmsworks.co.in","QA");
        Candidate c30 = new Candidate(30, "Kabilan R","gajendrans@nmsworks.co.in","Dev");
        Candidate c31 = new Candidate(31, "Velmurugan S","gajendrans@nmsworks.co.in","QA");
        Candidate c32 = new Candidate(32, "Amarnath M","gajendrans@nmsworks.co.in","Dev");
        Candidate c33 = new Candidate(33, "Vinothkumar E","gajendrans@nmsworks.co.in","QA");
        Candidate c34 = new Candidate(34, "Kanagavel N","gajendrans@nmsworks.co.in","Dev");

        candidates[0] = c21;
        candidates[1] = c22;
        candidates[2] = c23;
        candidates[3] = c24;
        candidates[4] = c25;
        candidates[5] = c26;
        candidates[6] = c27;
        candidates[7] = c28;
        candidates[8] = c29;
        candidates[9] = c30;
        candidates[10] = c31;
        candidates[11] = c32;
        candidates[12] = c33;
        candidates[13] = c34;

        //Candidate[] = new Candidate[] {c21,...,c34}

        System.out.println("Length: " + candidates.length);

        for(int i=0; i<= candidates.length-1;i++){
            System.out.println(candidates[i].toString());
        }


        for(Candidate c: candidates){
            System.out.println(c.toString());
        }

        for(int i=0; i<= candidates.length-1;i++){
            System.out.println(candidates[i].getId());
        }

        for(int i=0; i<= candidates.length-1;i++){
            if(candidates[i].getDepartment()=="QA"){
                System.out.println(candidates[i].getName());
            }
        }







    }
}
