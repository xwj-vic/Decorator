/**
 * Created by xuweijie on 2016/9/27.
 */
//兔皮装饰者
public class RabbitskinDecorator extends SpeciesDecorator {

    public RabbitskinDecorator(Wolf wolf) {
        super(wolf);
    }


    @Override
    public void species() {
        super.species();
        System.out.println("披着兔皮吃羊");
    }
}
