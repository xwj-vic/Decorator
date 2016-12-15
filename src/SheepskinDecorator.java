/**
 * Created by xuweijie on 2016/9/27.
 */
//羊皮装饰者
public class SheepskinDecorator extends SpeciesDecorator {

    public SheepskinDecorator(Wolf wolf) {
        super(wolf);
    }


    @Override
    public void species() {
        super.species();
        System.out.println("披着羊皮吃羊");
    }
}
