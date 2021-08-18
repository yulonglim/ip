import java.util.*;

public class Duke {
    private static String[] list = new String[100];
    private static int listIndex = 0;
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo + "\nWhat can I do for you?");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("bye")) {
                System.out.println("\n_________________________\n" + "Bye. Hope to see you again soon!" + "\n_________________________\n");
                return;
            } else if (str.equalsIgnoreCase("list")){
                for(int i = 0 ; i < listIndex; i++){
                    System.out.println("\n_________________________\n" + (i + 1) + ". " + list[i ] + "\n_________________________\n");
                }
            } else {
                list[listIndex] = str;
                listIndex++;
                System.out.println("\n_________________________\n" + "added: " + str + "\n_________________________\n");
            }
        }
    }
}
