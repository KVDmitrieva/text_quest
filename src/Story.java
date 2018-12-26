public class Story {
    private Situation start_story;
    public Situation current_situation;
    Story() {
        start_story = new Situation("Вы очнулись в темной комнате. В очень темной комнате.", "Ваши действия: \n" +
                "(1) Позвать на помощь \n" +
                "(2) Включить фонарик на телефоне\n" +
                "(3) Не двигаться", 3, 0, 0, 0);

        start_story.direction[0] = new Situation("Вы слышите приблежающиеся шаги. Сзади открывается дверь но вы не успеваете обернуться. Кто-то ударил вас по голове.",
                "Кажется, позвать на помощь было не лучшей идеей, не так ли?",
                0, -10, -10, -10);
        start_story.direction[1] = new Situation("Вы достаете из кармана телефон. к счастью, он не разряжен. Включаете фонарик",
                "К несчастью, в тот момент, когда вы его включили, на вас с потолка набросилось огромное существо. Похоже, вы умерли",
                0, -10, -10, -10);
        start_story.direction[2] = new Situation("Вы прислушиваетесь к звукам: снаружи доносятся приглушенные голоса, над вами что-то рычит. У вас нет идей, как отсюда выбраться",
                "По крайней мере, вы все еще живы. Ура?", 0, 0, 0, 0);
        current_situation = start_story;
    }
    public void go(int num){
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd(){
        return current_situation.direction.length == 0;
    }


}