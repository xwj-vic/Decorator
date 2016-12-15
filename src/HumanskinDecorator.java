/**
 * Created by xuweijie on 2016/9/27.
 */
//人皮装饰者
public class HumanskinDecorator extends SpeciesDecorator {

    public HumanskinDecorator(Wolf wolf) {
        super(wolf);
    }


    @Override
    public void species() {
        super.species();
        System.out.println("披着人皮吃羊");
    }
}
