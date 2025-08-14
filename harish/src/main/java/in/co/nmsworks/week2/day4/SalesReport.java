package in.co.nmsworks.week2.day4;

public class SalesReport extends Report{

    private String head;
    private String body;
    private String foot;

    @Override
    public void generateReport() {
        System.out.println(head +"\n"+ body +"\n"+foot );
    }

    @Override
    public void header(String head) {
        this.head = head;
    }

    @Override
    public void body(String body) {
        this.body = body;
    }

    @Override
    public void footer(String foot) {
        this.foot = foot;
    }
    //    @Override
//    public void body(String body) {
//        this.body = body;
//    }
//
//    @Override
//    public void header(String head) {
//        this.head = head;
//    }
//
//    @Override
//    public void footer(String foot) {
//        this.foot = foot;
//    }
//
//    @Override
//    public void generateReport() {
//        System.out.println(head + body + foot );
//    }
}
