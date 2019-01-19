import java.util.Scanner;

public class Game {
    public static Character player;
    public static Story story;

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Сознание возвращалось медленно, мысли путались в голове.\n "
                    + "Вы не помните ни где вы находитесь, ни как сюда попали, и даже не помните кем являетесь. Единственное, что вы помните - свое имя:(Введите ваше имя):");
        player = new Character(in.next());
            story = new Story();
            while (true) {
                player.health += story.current_situation.dhealth;
                if (player.health<0) player.health=0;
                player.strength += story.current_situation.dstrength;
                if (player.strength<0) player.strength=0;
                if (player.strength>100) player.strength=100;
                if (player.mind>100) player.mind=100;
                player.mind += story.current_situation.dmind;
                System.out.println("=====\n Здоровье:" + player.health + " \tРасследование:"
                        + player.mind + " \tВыносливость: " + player.strength + "\n=====");
                System.out.println("============="
                        + story.current_situation.subject + "==============");
                System.out.println(story.current_situation.text);
                if (story.isEnd()) {
                    System.out.println(" ");
                    if (player.health==0){
                        if(player.mind==0) System.out.println("Вы умерли так и не поняв, что здесь вообще происходит"); else
                            if(player.mind<50) System.out.println("По крайней мере вы знаете, что погибли во имя науки"); else
                                if (player.mind>=50) System.out.println("Вы знали слишком много, но умерли так рано");
                    } else  if (player.health<=100){
                        if (player.mind%10==5) System.out.println("К тому моменту, как вы подошли к выходу, все в лаборатории были мертвы. Это определенно был не лучший поступок в вашей жизни, однако теперь можно быть уверенным в том, что вас точно никто не будет преследовать."); else
                        if (player.mind<50) System.out.println("В лаборатории не сразу заметили, что вы сбежали, и вы смогли добраться до ближайшего населенного пункта, где остановились в гостинице. Вы позвонили в полицию и сообщили обо всем, что с вами случилось, однако вам не поверили. К сожалению, ваш звонок не остался незамеченным. Вечером к вам в номер постучались. Последнее, что вы услышали был выстрел.");
                    else System.out.println("Вы сумели сбежать и добраться до города. Вы передали все собранные материалы в полицию. Улик оказалось достаточно и в отношении лаборатории возбудили проверку, по итогу которой ее закрыли, а большую часть сотрудников приговорили к лишению свободы. ");
                    }else if(player.health==1000) System.out.println("Мир продержался не долго.");
                    System.out.println("====================the end!===================");
                    return;
                }

                story.go(in.nextInt());
            }

        }

    }

