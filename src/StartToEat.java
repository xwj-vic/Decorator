/**
 * Created by xuweijie on 2016/9/27.
 */
public class StartToEat {
    public static void main(String args[]){
        Wolf wolf=new SheepskinDecorator(new CunningWolf());
        wolf.species();

        Wolf wolf1=new HumanskinDecorator(new CunningWolf());
        wolf1.species();

        Wolf wolf2=new RabbitskinDecorator(new CunningWolf());
        wolf2.species();

    }
}
