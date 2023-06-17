import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {

     List<T> elements;

    public Layer(T[] elements) {
        this.elements = new ArrayList<T>(List.of(elements));
    }

    public void AddElements(T... t){
        elements.addAll(List.of(t));
     }

     public void RenderLayer(){
         for(T t : elements ){
             t.render();
         }
     }
}
