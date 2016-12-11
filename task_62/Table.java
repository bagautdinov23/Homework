package bagautdinov_amir.homework.task_62;

/**
 * Created by Amir on 11.12.2016.
 */
public class Table extends Furniture {
    private String model;

    public Table(String name) {
        super(name);
    }
    @Override
    public void create() {
        System.out.println("Теперь я собран");
    }


}
