package in.co.nmsworks.week2.test.even;

abstract class ReturnArray {
    public String display(){
        System.out.println();
        return "complete";
    }
    public String para="hello logeswari welcome";

}
class ZerothPos extends ReturnArray{

    public void zerothArray(String para){
        String[] line=para.split("\\s");
        System.out.println(line);
    }
}
class FirstPos extends ReturnArray{
    String wordCount=para.toLowerCase();
    int count=0;
}
class Letter extends ReturnArray{
    int count=0;
    String[] len;


}
class Runner{
    public static void main(String[] args) {
        ZerothPos ob=new ZerothPos();
        ob.display();

    }
}
