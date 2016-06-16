package com.myproject.ticket;

import com.myproject.ticket.EventsResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/event", produces = {MediaType.APPLICATION_ATOM_XML_VALUE})
public class EventController {
    @RequestMapping(method = RequestMethod.POST)
    public
    @ResponseBody
    EventsResponse approveEvent() {
        final EventsResponse eventsResponse = buildEventsResponse();
        return eventsResponse;
    }

    private EventsResponse buildEventsResponse() {
        Event event = new Event();
        event.setName("Company Event");
        List<Event> events = new ArrayList<>();
        events.add(event);
        Page page = new Page();
        page.setPageNumber(1);
        page.setPageSize(10);
        Status status = new Status(0, "", "success", new Date(), 2.0);
        return new EventsResponse(events, page, status);
    }
}
