package in.co.nmsworks.week1.day2.patterns;
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
 */
public class PatternOne {
    public static void main(String[] args) {
        int a = 7;
        findPattern(a);
    }
    public static void findPattern(int x){
        for(int i = 1; i<=x;i++){
            for(int j =1; j<i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
    }
}

