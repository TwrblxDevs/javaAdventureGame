package secondary;

import java.util.ArrayList;

public class Monsters {
    private static ArrayList<Monster> monsterList = new ArrayList<>();

    public static void addMonster(Monster monster) {
        monsterList.add(monster);
    }

    public static void displayMonsters() {
        for (Monster monster : monsterList) {
            monster.displayInfo();
            System.out.println("---------");
        }
    }

    public static Monster getMonsterByName(String name) {
        for (Monster monster : monsterList) {
            if (monster.getName().equalsIgnoreCase(name)) {
                return monster;
            }
        }
        return null;
    }

    static {
        addMonster(new Monster("Goblin", 15, 50));
        addMonster(new Monster("Dragon", 50, 200));
        addMonster(new Monster("Zombie", 10, 30));
    }
}
