package it.develhope.ifstatement04;

public class Person {

    Integer age;

    public Person() {
        double provDouble=Math.floor(Math.random()*(80-5+1)+5);;
        int provint=(int) provDouble;
        this.age=(Integer) provint;
    }

    public String getLifeStage(Integer age){
        String returnString="";
        if(age<=12){
            returnString="Child";
        }if(age>=13&&age<=19){
            returnString="Teen";
        }if(age>=20&&age<=59){
            returnString="Adult";
        }if(age>=60){
            returnString="Senior Adult";
        }
        return returnString;
    }
}
