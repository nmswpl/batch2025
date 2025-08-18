package in.co.nmsworks.week3.set2;

public class TestRunnerNew {
    public static void main(String[] args) {
        String str = "The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.";
        int[] arr = getSentenceAndWordAndLetterCount(str);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        InternNew Hari = new InternNew("Harish",50000);
        InternNew Gokul = new InternNew("Gokul", 60000);
        InternNew Aravind = new InternNew("Aravind", 75000);
        InternNew Devi = new InternNew("Devi", 45000);
        InternNew Radha = new InternNew("Radha", 40000);
        System.out.println();
        InternNew [] interns = new InternNew[] {Hari, Gokul, Aravind, Devi, Radha};
        System.out.println("Average Salary: " + getAvgSalary(interns));
    }
    public static int [] getSentenceAndWordAndLetterCount(String str){
        int arr[] = new int[3];
        String sentence [] = str.split("\\.");
        arr[0] = sentence.length;
        String word [] = str.split(" ");
        arr[1] = word.length;
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            String ele = String.valueOf(str.charAt(i));
            if(ele.equals(".") && ele.equals(" ")){
            }
            else{
                count++;
            }
        }
        arr[2] = count;
        return arr;
    }
    public static int getAvgSalary(InternNew[] in){
        int sumval = 0;
        for(int i = 0; i < in.length; i++){
            sumval = sumval + in[i].getSalary();
        }
        return sumval/in.length;
    }
}
