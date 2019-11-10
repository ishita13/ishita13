package com.example.contacts_app;

public class Models
{
    private String name,number,duration;
    public Models(String n,String num, String du)
    {
        name=n;
        number=num;
        duration=du;

    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getDuration() {
        return duration;
    }

   public String getName() {
       return name;
    }
}
