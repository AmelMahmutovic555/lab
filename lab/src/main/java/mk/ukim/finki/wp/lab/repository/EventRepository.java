package mk.ukim.finki.wp.lab.repository;

import jakarta.servlet.http.HttpServlet;
import mk.ukim.finki.wp.lab.model.Event;
import mk.ukim.finki.wp.lab.modelHolder.EventHolder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class EventRepository {

    public List<Event> findAll(){
        return EventHolder.listEvent;
    }

    public List<Event> searchEvents(String text) {
        return EventHolder.listEvent.stream().filter(t -> (t.getName().contains(text) || t.getDescription().contains(text))).collect(Collectors.toList());
    }


}
