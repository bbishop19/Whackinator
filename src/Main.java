import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String string = "";
        try {
            string = new String(Files.readAllBytes(Paths.get(Main.class.getClassLoader().getResource("CerealTree.txt").getPath())), "UTF-8");
        }catch(IOException e){}
        //copied/modified from stack overflow
        //https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file

        LinkedList<String> serializedTree = new LinkedList<>(Arrays.asList(string.trim().split(", ")));

        BTNode curr = BinaryTreeHelper.deserialize(serializedTree);
        Scanner Systemdotin = new Scanner(System.in);

        help();

        while(curr.getLeftChild() != null & curr.getRightChild() != null){
            System.out.println(curr.getData());

            String response = Systemdotin.nextLine();

            switch(response) {
                case "y":
                    curr = curr.getLeftChild();
                    break;
                case "n":
                    curr = curr.getRightChild();
                    break;
                case "--help":
                    help();
                    break;
                default:
                    System.out.println("\nUnexpected response, please try again");
            }
            System.out.println();


        }

        boolean eternalPrison = true;
        while(eternalPrison) {
            System.out.println("Are you thinking of " + curr.getData() + "?");

            String response = Systemdotin.nextLine();

            switch (response) {
                case "y":
                    eternalPrison = false;
                    System.out.println("\nThank you for playing Wackinator");
                    break;
                case "n":
                    eternalPrison = false;
                    System.out.println("\nWho are you thinking of?");
                    response = Systemdotin.nextLine();
                    try {//TODO This doesnt work, please fix
                        Files.write(Paths.get(Main.class.getClassLoader().getResource("NewNames.txt").getPath()), (response+"\n").getBytes(), StandardOpenOption.APPEND);
                    } catch (IOException e) { }
                    System.out.println("\nThank you for playing Wackinator");
                    break;
                case "--help":
                    help();
                    break;
                default:
                    System.out.println("\nUnexpected response, please try again\n");
            }
        }

    }


    static void help(){
        System.out.println("Welcome to Wackinator (Windward Akinator)");
        System.out.println("To use this program, first think of a Windward teacher");
        System.out.println("Then, respond to questions with either \"y\" for yes, \"n\" for no");
        System.out.println("If you need help, just type \"--help\"");
        System.out.println("Good luck!\n");
    }
}

