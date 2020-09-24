package carrent;

/**
 * @author Outis
 * @creat 2020-09-22 20:50
 */
public class Car {
    int id;
    String name;
    int money;
    int personcapacity;
    int goodscapacity;
    public Car(int id,String name,int money,int personcapacity,int goodscapacity){
        this.id=id;
        this.goodscapacity=goodscapacity;
        this.money=money;
        this.name=name;
        this.personcapacity=personcapacity;
    }
    public void print(){
        if(personcapacity==0){
            System.out.println(id+".\t\t"+name+"\t"+money+"元/天\t\t"+"载货："+goodscapacity+"吨");
        }
        else if(goodscapacity==0) {
            System.out.println(id + ".\t\t" + name + "\t" + money + "元/天\t\t" + "载客：" + personcapacity + "位");
        }
            else{
                System.out.println(id+".\t\t"+name+"\t\t"+money+"元/天\t\t"+"载货："+goodscapacity+"吨"+"\t"+"载客："+personcapacity+"位");
            }
        }
}
