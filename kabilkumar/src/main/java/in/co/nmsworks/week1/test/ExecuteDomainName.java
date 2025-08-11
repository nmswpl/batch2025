package in.co.nmsworks.week1.test;

public class ExecuteDomainName
{
    public static void main(String[] args) {
        String getData="abc@gmail.com";
        findDomainName(getData);
    }

    public static void findDomainName(String sentense)
    {

        String[] word=sentense.split("@",2);
        System.out.println("DomainNmae :" + word[1]);
    }
}
