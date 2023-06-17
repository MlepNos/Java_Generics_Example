import java.util.Arrays;

public interface Mappable {
    void render();

    static double[] stringToXY(String location){
        var splits = location.split(",");
        double x = Double.valueOf(splits[0]);
        double y = Double.valueOf(splits[1]);
        return new double[]{x,y};
    }
}


abstract class Point implements Mappable {

    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToXY(location);
    }

    @Override
    public void render() {
        System.out.println("Render " +  this + " as POINT (" +  location() + ")" );
    }

    private String location(){
        return Arrays.toString(location);
    }
}


abstract class Line implements Mappable{
    private double[][] locations;

    public Line(String... locations){
        this.locations = new double[locations.length][];
        int index =0;
        for (var l : locations){
            this.locations[index++] = Mappable.stringToXY(l);
        }
    }

    private String locations(){
        return Arrays.deepToString(locations);
    }
    @Override
    public void render() {
        System.out.println("Render " +  this + " as LINE (" +  locations() + ")" );
    }
}

