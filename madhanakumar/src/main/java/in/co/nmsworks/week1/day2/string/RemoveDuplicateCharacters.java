package in.co.nmsworks.week1.day2.string;

public class RemoveDuplicateCharacters {
    //Write program to remove duplicate characters
    public void removerDuplicateCharacter(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (!result.contains(c)) {
                result += c;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        RemoveDuplicateCharacters rd = new RemoveDuplicateCharacters();
        rd.removerDuplicateCharacter("aabbcc");
        rd.removerDuplicateCharacter("level");
    }
}
