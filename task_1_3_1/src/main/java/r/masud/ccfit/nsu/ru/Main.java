package r.masud.ccfit.nsu.ru;

import java.util.List;
import java.util.Scanner;

import static r.masud.ccfit.nsu.ru.SubStringFinder.findSubString;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input_file_name = scan.nextLine();       //"input.txt"
        String substring = scan.nextLine();             //"пирог"

        List<Integer> answer = findSubString(input_file_name, substring);

        System.out.println(answer);
    }
}