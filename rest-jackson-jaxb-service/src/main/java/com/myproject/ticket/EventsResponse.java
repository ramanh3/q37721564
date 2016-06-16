package com.myproject.ticket;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EventsResponse {
    private Status status;
    @XmlElement(name = "Paging")
    private Page page;
    @XmlElementWrapper(name = "Events")
    @XmlElement(name = "Event")
    private List<Event> events;

    public EventsResponse(List<Event> events, Page page, Status status) {
        this.events = events;
        this.page = page;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
