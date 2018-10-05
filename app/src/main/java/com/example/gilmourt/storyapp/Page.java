package com.example.gilmourt.storyapp;

public class Page {
    Choice c1;
    Choice c2;
    String storytext;
    public Page(String stext, Choice choice1, Choice choice2)
    {
        storytext=stext;
        c1=choice1;
        c2=choice2;
    }

    public Choice getC1() {
        return c1;
    }

    public void setC1(Choice c1) {
        this.c1 = c1;
    }

    public Choice getC2() {
        return c2;
    }

    public void setC2(Choice c2) {
        this.c2 = c2;
    }

    public String getStorytext() {
        return storytext;
    }

    public void setStorytext(String storytext) {
        this.storytext = storytext;
    }
}
