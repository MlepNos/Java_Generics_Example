// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var USparks = new Parks[]{
                new Parks("Yellowstone","44.4882, -110.5916"),
                new Parks("Central Park","40.7831, -73.9655"),
                new Parks("Grand Canyon","36.1085, -119.5360")
        };
        Layer<Parks> parkLayer = new Layer<>(USparks);
        parkLayer.RenderLayer();

        System.out.println("~".repeat(50));

        parkLayer.AddElements(new Parks("Canyon","18.4882, -120.5916"),
                              new Parks("stone","42.7831, -76.9655"));
        parkLayer.RenderLayer();

        System.out.println("~".repeat(50));

        var USrivers = new Rivers[]{
                new Rivers("Mississippi","47.2160, -95.2348","29.1566, -89.2495"),
                new Rivers("Missorui","45.9239, -111.4983","38.8146, -90.1218")
        };
        Layer<Rivers> riverLayer = new Layer<>(USrivers);
        riverLayer.RenderLayer();

        System.out.println("~".repeat(50));

        riverLayer.AddElements(new Rivers("Colorado", "40.4708, -105.8286","31.7811, -114.7724"),
                               new Rivers("Delaware", "42.2026, -75.0083","39.4955, -75.5592"));
        riverLayer.RenderLayer();
    }
}