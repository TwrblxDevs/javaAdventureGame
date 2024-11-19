import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import secondary.colors;
import functions.consoleFunctions;

public class App {
    private static HashMap<String, HashMap<String, Object>> playersData = new HashMap<>();

    public static void main(String[] args) {
        try {
            System.out.println(colors.CYAN + "Welcome to the Java Adventure Game" + colors.RESET);
            Thread.sleep(1000);  // 1 second delay before next message

            System.out.println(colors.YELLOW + "Coded by twrblx" + colors.RESET);
            Thread.sleep(1000);

            System.out.println(colors.GREEN + "Coded using Java" + colors.RESET);
            Thread.sleep(1000);

            System.out.println(colors.PURPLE + "To start type: Play or play" + colors.RESET);
            Thread.sleep(1000); // Adding a delay to simulate a more natural flow

            String playersName = "";

            int dayNumber = 0;

            Scanner startObj = new Scanner(System.in);
            String input = startObj.nextLine();

            if (input.equalsIgnoreCase("play")) {
                System.out.println(colors.GREEN + "Starting..." + colors.RESET);
                Thread.sleep(1000);
                System.out.print("\033[H\033[2J");
                consoleFunctions.loadingBar(20, 600);  // Simulate loading
                System.out.print("\033[H\033[2J");

                Scanner playerNameObj = new Scanner(System.in);
                System.out.println("[NARRATOR] Ah you've finally woken up. What's your name my friend?");
                Thread.sleep(1500);  // Adding a slight pause before name input
                playersName = playerNameObj.nextLine();
                System.out.print("\033[H\033[2J");

                addPlayer(playersName);

                System.out.print("\033[H\033[2J");
                System.out.println("[NARRATOR] Welcome " + playersName + " to the Java Adventure Game");
                Thread.sleep(1000); // Pause before next message
                System.out.println("[NARRATOR] We've got a big day tomorrow, get some rest.");
                Thread.sleep(1500);  // Longer pause before showing day info

                System.out.print("\033[H\033[2J");

                System.out.println("You are sleeping, the current day number is: " + dayNumber);
                consoleFunctions.loadingBar(30, 600);  // Simulate loading day change
                Thread.sleep(1000);  // Pause after loading
                System.out.print("\033[H\033[2J");
                Thread.sleep(1000);
                


                playerNameObj.close();

            } else {
                System.out.println(colors.RED + "Invalid input. Please type 'Play' or 'play' to start." + colors.RESET);
                Thread.sleep(1000);  // Slight delay before closing the program
            }

            startObj.close();
        } catch (InterruptedException e) {
            System.err.println("[ERROR] The game was interrupted.");
        }
    }

    private static void addPlayer(String playerName) {
        HashMap<String, Object> playerData = new HashMap<>();
        playerData.put("Health", 100);
        playerData.put("Inventory", new ArrayList<String>());

        playersData.put(playerName, playerData);
    }

    @SuppressWarnings({ "unused", "unchecked" })
    private static void addItemToInventory(String playerName, String item) {
        if (playersData.containsKey(playerName)) {
            ArrayList<String> inventory = (ArrayList<String>) playersData.get(playerName).get("Inventory");
            inventory.add(item);
            System.out.println("[NARRATOR] Added " + item + " to " + playerName + "'s inventory.");
        } else {
            System.out.println("[NARRATOR] Player not found. Cannot add item.");
        }
    }

    @SuppressWarnings({ "unused", "unchecked" })
    private static void removeItemFromInventory(String playerName, String item) {
        if (playersData.containsKey(playerName)) {
            ArrayList<String> inventory = (ArrayList<String>) playersData.get(playerName).get("Inventory");
            if (inventory.contains(item)) {
                inventory.remove(item);
                System.out.println("[NARRATOR] Removed " + item + " from " + playerName + "'s inventory.");
            } else {
                System.out.println("[NARRATOR] Item " + item + " not found in " + playerName + "'s inventory.");
            }
        } else {
            System.out.println("[NARRATOR] Player not found. Cannot remove item.");
        }
    }
}
