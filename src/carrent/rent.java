package carrent;
import javax.sql.rowset.CachedRowSet;
import java.util.Scanner;
/**
 * @author Outis
 * @creat 2020-09-23 16:51
 */
public class rent {
    public static void main(String[] args) {
    Car[] cars={new Taxi(1,"奥迪A4",500,4,0),new Taxi(2,"马自达",400,4,0),new Van(3,"皮卡",450,4,450),new Truck(4,"依维柯",500,0,1000)};
        System.out.println("*****欢迎使用租车系统******");
        System.out.println("租车请输入数字1,任意键退出");
        System.out.println("请输入：");
        Scanner scan=new Scanner(System.in);
        if(!scan.hasNextInt()||scan.nextInt()!=1){
            System.out.println("再见，欢迎下次使用");
        }
        System.out.println("可租车型及价目表");
        System.out.println("序号\t\t型号\t\t租金\t\t\t容量");
        for (Car car:cars){
            car.print();
        }
        System.out.println("请输入租车数量：");
        int n=scan.nextInt();
        int totalperson=0,totalgoods=0,totalmoney=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("请输入第"+i+"量车的序号：");
            int id=scan.nextInt();
            totalperson+=cars[id-1].personcapacity;
            totalgoods+=cars[id-1].goodscapacity;
            System.out.println("请输入租车天数：");
            int day=scan.nextInt();
            totalmoney+=cars[id-1].money*day;
        }
        System.out.println("共可载人："+totalperson+"位");
        System.out.println("共可载货："+totalgoods+"吨");
        System.out.println("共需支付："+totalmoney+"元");
    }
}
