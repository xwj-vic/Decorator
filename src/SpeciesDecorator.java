/**
 * Created by xuweijie on 2016/9/27.
 */
//装饰者类
public  abstract class SpeciesDecorator extends Wolf {



   protected Wolf wolf;

    public SpeciesDecorator(Wolf wolf) {
        this.wolf = wolf;
    }

    @Override
    public void species() {
        wolf.species();
    }
}
