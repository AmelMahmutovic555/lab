package mk.ukim.finki.wp.lab.web;

import ch.qos.logback.core.model.processor.DefaultProcessor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.ukim.finki.wp.lab.model.EventBooking;
import mk.ukim.finki.wp.lab.service.EventBookingService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import java.io.IOException;

@WebServlet(name = "Event-booking", urlPatterns = "/eventBooking")
public class EventBookingServlet extends HttpServlet {
//    private final EventBookingService eventBookingService;
    private final SpringTemplateEngine springTemplateEngine;

    public EventBookingServlet(SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine = springTemplateEngine;
//        this.eventBookingService = eventBookingService;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String attendeeName = req.getParameter("attendeeName");
        String eventName = req.getParameter("eventName");
        String numTickets = req.getParameter("numTickets");

        IWebExchange webExchange = JakartaServletWebApplication.buildApplication(getServletContext()).buildExchange(req, resp);
        WebContext context = new WebContext(webExchange);
        context.setVariable("attendeeName", attendeeName);
        context.setVariable("ip", req.getRemoteAddr());
        context.setVariable("eventName", eventName);
        context.setVariable("numTickets", numTickets);

        springTemplateEngine.process("bookingConfirmation.html", context, resp.getWriter());
    }
}
