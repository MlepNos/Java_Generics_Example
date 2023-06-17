public class Parks extends Point{
    String name;

    public Parks( String name,String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " National Park ";
    }
}
