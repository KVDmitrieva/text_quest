import java.util.Scanner;

public class Game {
    public static Character manager;
    public static Story story;

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Сознание возвращалось медленно, мысли путались в голове.\n "
                    + "Вы не помните ни где вы находитесь, ни как сюда попали, и даже не помните кем являетесь. Единственное, что вы помните - свое имя:(Введите ваше имя):");
            manager = new Character(in.next());
            story = new Story();
            while (true) {
                manager.strength += story.current_situation.dstrength;
                manager.health += story.current_situation.dhealth;
                manager.mind += story.current_situation.dmind;
                System.out.println("=====\n Здоровье:" + manager.health + "\tИнтелект:"
                        + manager.mind + "\tСила:" + manager.strength + "\n=====");
                System.out.println("============="
                        + story.current_situation.subject + "==============");
                System.out.println(story.current_situation.text);
                if (story.isEnd()) {
                    System.out
                            .println("====================the end!===================");
                    return;
                }
                story.go(in.nextInt());
            }

        }

    }

