package mk.ukim.finki.wp.lab.modelHolder;

import io.micrometer.common.KeyValues;
import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Event;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EventHolder {

    public static List<Event> listEvent = new ArrayList<>();

    @PostConstruct
    public void init(){
        listEvent.add(new Event("Lunar Festival", "A celebration marking the arrival of the lunar new year with fireworks, traditional music, and dragon dances.", 88.5));
        listEvent.add(new Event("Galactic Gaming Expo", "A celebration marking the arrival of the lunar new year with fireworks, traditional music, and dragon dances.", 88.5));
        listEvent.add(new Event("Earth Day Global March", "A celebration marking the arrival of the lunar new year with fireworks, traditional music, and dragon dances.", 88.5));
    }
}
