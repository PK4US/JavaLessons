package Section_3.Lesson6;

public class Worker extends Person{
    private int salery = 0;

    public void setSalery(int salery){ this.salery = salery; }
    public int getSalery(){
        return salery;
    }

    public String getTextInfo(){
        String s = super.getTextInfo();
        s+="; Зарплата: " + this.salery + " рублей";
        return s;
    }
}
