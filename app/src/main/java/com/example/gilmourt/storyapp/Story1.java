package com.example.gilmourt.storyapp;

public class Story1 {
    private Page[] pages;
    public Story1()
    {
        pages = new Page[10];

        pages[0]= new Page("It's Monday morning. You're lying in your bed, fast asleep, when your alarm goes off. " +
                            "You must have been dreaming!",
                new Choice("hit snooze", 1),
                new Choice("get up", 6));

        pages[1]= new Page("Your alarm goes off again, when you look at the clock it says 11:30, " +
                            "three and a half hours after you were supposed to be at school",
                new Choice("Run to school",2),
                new Choice("Screw school, stay home",3));

        pages[2]= new Page("While running to school you didn't pay attention crossing a street and were hit by a bus." +
                            " You're Dead",
                new Choice("continue",0),
                new Choice("continue",0));

        pages[3]= new Page("You get out of bed and head downstairs to the kitchen. You see a box of cereal and a bottle " +
                            "of milk and pancake mix",
                new Choice("Eat cereal",4),
                new Choice("Make pancakes",5));

        pages[4]= new Page("You eat the cereal and think to yourself, \"does this milk taste weird?\" As you run to the " +
                            "bathroom to empty your stomache you can't see straight, fall, and hit your head on the floor",
                new Choice("continue",0),
                new Choice("continue",0));

        pages[5]= new Page("After following the instructions on the pancake mix box you turn on the stove. You hear a faint " +
                            "hissing sound but dismiss it as your imagination. Ten minutes later, the last thing you see is a " +
                            "fireball rushing towards you when the air and the gas leaking from the stove reach a combustible mixture",
                new Choice("continue",0),
                new Choice("continue",0));

        pages[6]= new Page("You get up, eat breakfast, and get ready to go to school. How do you want to get to school today?",
                new Choice("Running",2),
                new Choice("The bus",7));

        pages[7]= new Page("You get to school on time and crowd into the hallways with your peers. You're in the bathroom during " +
                            "first period when the fire alarm goes off.",
                new Choice("Go outside",8),
                new Choice("Stay inside",9));

        pages[8]= new Page("You get outside and notice thick, billowing smoke rising from the school behind you. You can hear" +
                            "the wail of firetrucks in the distance. People are whispering about an accident in the Chemistry lab",
                new Choice("continue",0),
                new Choice("continue",0));

        pages[9]= new Page("\"Good thing this is just a drill\" you think to yourself as you wash your hands in the bathroom " +
                            "You walk to the door but notice a strange heat from the door knob as you reach down to open it. Smoke" +
                            "pouring in beneath the door is your last sight before darkness consumes your vision",
                new Choice("continue",0),
                new Choice("continue",0));
    }

    public Page getPage(int pagenum) {
        return pages[pagenum];
    }
}
