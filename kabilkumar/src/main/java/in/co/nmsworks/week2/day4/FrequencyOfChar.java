package in.co.nmsworks.week2.day4;

public class FrequencyOfChar
{
    public static void main(String[] args) {


        String name = "this website is awseome";
     int count = 0;
        for (int i =0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {
                count++;

            }
        }
            System.out.println(count);

        }

    }
