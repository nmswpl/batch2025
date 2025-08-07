package in.co.nmsworks.week1.day2.patterns;
/*
1 1 1 1 1 1 1
2 2 2 2 2 2
3 3 3 3 3
4 4 4 4
5 5 5
6 6
7
 */
public class PatternTwo {
    public static void main(String[] args) {
        int a = 7;
        findPattern(a);
    }
    public static void findPattern(int x){
        int c = x;
        for(int i = 1; i<=x;i++){
            for(int j = c; j>0; j--){
                System.out.print(i + " ");
            }
            c=c-1;
            System.out.println("\n");
        }
    }
}

