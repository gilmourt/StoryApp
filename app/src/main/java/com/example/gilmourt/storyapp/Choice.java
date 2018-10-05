package com.example.gilmourt.storyapp;

public class Choice {
    private String ctext;
    private int nextstep;
    public Choice(String text, int next)
    {
        ctext=text;
        nextstep=next;
    }
    public String getCtext() {
        return ctext;
    }

    public void setCtext(String ctext) {
        this.ctext = ctext;
    }
    public int getNextstep() {
        return nextstep;
    }

    public void setNextstep(int nextstep) {
        this.nextstep = nextstep;
    }
}
