package com.example.contacts_app;

public class Contacts {
    private String Names;
    private String Number;
    private int photo;

public Contacts(String n,String num)
{
 Names=n;
 Number=num;

}
    public String getNames(){
    return Names;

    }

    public String getNumber(){
    return Number;
    }





    public void setNames(String names) {
        Names = names;
    }

    public void setNumber(String number) {
        Number = number;
    }


}
