package bagautdinov_amir.homework.task_62;

/**
 * Created by Amir on 11.12.2016.
 */
public abstract class Furniture {
    protected String model;

    public Furniture(String name) {
        this.model = name;
    }

    public abstract void create();

    public void setName(String name) {
        this.model = model;
    }

    public String getNameModel() {
        return model;
    }
}
