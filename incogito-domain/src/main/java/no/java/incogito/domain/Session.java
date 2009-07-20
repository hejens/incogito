package no.java.incogito.domain;

import fj.data.Java;
import fj.data.List;
import fj.data.Option;
import org.joda.time.Interval;

/**
 * @author <a href="mailto:trygve.laugstol@arktekk.no">Trygve Laugst&oslash;l</a>
 * @version $Id$
 */
public class Session {
    public final SessionId id;
    public final String title;
    public final Option<Interval> timeslot;
    public final Option<String> room;
    public final List<String> tags;
    public final List<Speaker> speakers;
    public final List<Comment> comments;

    public Session(SessionId id, String title, Option<Interval> timeslot, Option<String> room, List<String> tags, List<Speaker> speakers, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.timeslot = timeslot;
        this.room = room;
        this.tags = tags;
        this.speakers = speakers;
        this.comments = comments;
    }

    // -----------------------------------------------------------------------
    //
    // -----------------------------------------------------------------------

    public static SessionId id(String value) {
        return new SessionId(value);
    }

    // -----------------------------------------------------------------------
    // Getters
    // -----------------------------------------------------------------------

    public SessionId getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Option<Interval> getTimeslot() {
        return timeslot;
    }

    public Option<String> getRoom() {
        return room;
    }

    public java.util.List<String> getTags() {
        return Java.<String>List_ArrayList().f(tags);
    }

    public java.util.List<Speaker> getSpeakers() {
        return Java.<Speaker>List_ArrayList().f(speakers);
    }

    public java.util.List<Comment> getComments() {
        return Java.<Comment>List_ArrayList().f(comments);
    }
}
