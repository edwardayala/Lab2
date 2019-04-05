import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab2 {
    public static void main(String [] args) throws FileNotFoundException {
        // Input file
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name: (string.txt)");
//        String inputFileName = input.nextLine();
        String inputFileName = "string.txt";
        File file = new File(inputFileName);
        input.close();

        // Insert file contents into array
        Scanner reader = new Scanner(file);         // create reader
        String fileText = reader.nextLine();        // create string - contains single line from file
        String [] stringArr = fileText.split(" ");    // split string into array of strings
                                                              // separated by space or any other delimiter
        int [] virtualDisk = new int[stringArr.length];      // create int array - copy of string array (might be useless)


        for (int i = 0; i < stringArr.length; i++) {      // copy string array to int array
            virtualDisk[i] = Integer.parseInt(stringArr[i]);
            System.out.print(virtualDisk[i]);
        }
        
        // Create memory spaces (3 page | 4 page)
        int [] memorySpace3 = new int[3];
        int [] memorySpace4 = new int[4];
        
        int pageFaults3 = 3;
        int pageFaults4 = 4;

        // FIFO
        for (int i = 0; i < virtualDisk.length; i++) {

            if (i > memorySpace3.length){
                pageFaults3++;
                System.out.println("\npagefault3++");
            }
//            memorySpace3[i] = virtualDisk[i];

        }
    }
}

