package in.co.nmsworks.week2.day2;

import in.co.nmsworks.week1.day3.CandidateInfo;

public class Candidate {
    public static void main(String[] args) {




        CandidateInfo c21 = new CandidateInfo(21, "Arunkumar M","gajendrans@nmsworks.co.in","QA");
        CandidateInfo c22 = new CandidateInfo(22, "Vasanth S","gajendrans@nmsworks.co.in","Dev");
        CandidateInfo c23 = new CandidateInfo(23, "Nandhakumar M","gajendrans@nmsworks.co.in","QA");
        CandidateInfo c24 = new CandidateInfo(24, "Ramya S","gajendrans@nmsworks.co.in","Dev");
        CandidateInfo c25 = new CandidateInfo(25, "Neha S","gajendrans@nmsworks.co.in","QA");
        CandidateInfo c26 = new CandidateInfo(26, "Sabarishwaran S","gajendrans@nmsworks.co.in","Dev");
        CandidateInfo c27 = new CandidateInfo(27, "Elakkiya S","gajendrans@nmsworks.co.in","QA");
        CandidateInfo c28 = new CandidateInfo(28, "Ellammal","gajendrans@nmsworks.co.in","Dev");
        CandidateInfo c29 = new CandidateInfo(29, "Kavibharathi S","gajendrans@nmsworks.co.in","QA");
        CandidateInfo c30 = new CandidateInfo(30, "Kabilan R","gajendrans@nmsworks.co.in","Dev");
        CandidateInfo c31 = new CandidateInfo(31, "Velmurugan S","gajendrans@nmsworks.co.in","QA");
        CandidateInfo c32 = new CandidateInfo(32, "Amarnath M","gajendrans@nmsworks.co.in","Dev");
        CandidateInfo c33 = new CandidateInfo(33, "Vinothkumar E","gajendrans@nmsworks.co.in","QA");
        CandidateInfo c34 = new CandidateInfo(34, "Kanagavel N","gajendrans@nmsworks.co.in","Dev");

        CandidateInfo[] candidateInfos = new CandidateInfo[]{c21, c22,c23,c24,c25,c26,c26,c27,c28,c29,c30,c31,c32,c33,c34};

        for (CandidateInfo c : candidateInfos) {
            if (c.getDepartment().equals("QA")) {
                System.out.println(c.getName());
            }
        }

        for (CandidateInfo c : candidateInfos) {
            System.out.println(c.getId());
        }

    }

}