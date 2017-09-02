import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Question4 {
    public static void main (String[] args){

        try {
            if (args.length <= 0) {
                System.out.println("There aren't enough arguments. Need a file name");
            } else {
                String filePath = args[0];

                for (int i = 1; i < args.length; i++) {
                    filePath = filePath + args[i];
                }


                File file = new File(filePath);
                FileReader fileReader = new FileReader(file);
                BufferedReader input = new BufferedReader(fileReader);

                String next = input.readLine();

                while (next != null) {
                    System.out.println(next);
                    next = input.readLine();
                }


            }
        }catch (Exception error){
            System.out.println(error);
        }

    }
}
