package in.co.nmsworks.week1.test;

public class ExtractTheDomainName {

    public String getDomainName (String email){
        String[] splitDomain = email.split("@");
        String result = splitDomain[1];
        return result;

    }

}
