
import java.util.ArrayList;
import java.util.Random;

public class Solitare {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        ArrayList<Integer> rand = new ArrayList<Integer>();
        int count = 0;
        while (count < 46) {
            int i = randomGenerator.nextInt(45) + 1;
            count += i;
            if (count > 45) {
                rand.add(45 - (count - i));
            } else {
                rand.add(i);
            }

        }
        count = 0;
        int run = 0;
        boolean check = true;
        while (check){
            run = 0;
            for (int i = 0; i < rand.size(); i++){
                int temp = rand.get(i);
                if (temp == 1){
                    rand.remove(i);
                }
                else{
                    rand.remove(i);
                    rand.add(i, temp - 1);

                }
                run++;
            }
            rand.add(run);
            count++;
            if (rand.size() == 9){
                for (int i = 1; i < 10; i++){
                    if (rand.contains(i)){
                        check = false;
                    }
                    else{
                        check = true;
                        break;
                    }
                }
            }
            System.out.println(rand + " Iteration #:" + count);
            if (count > 50){
                break;
            }
        }
        if (count > 50){
            main(null);
        }
        else {
            System.out.println("You won");
        }
    }
}

