package ail.tracing.events;

import java.util.LinkedList;
import java.util.List;

import ail.semantics.AILAgent;
import ail.syntax.Event;
import ail.syntax.Intention;

public class ModifyIntentionEvent extends AbstractEvent {
	private final Intention intention;

	public ModifyIntentionEvent(final Intention intention) {
		this.intention = intention.clone();
	}

	public Intention getIntention() {
		return this.intention;
	}

	//public Event getEvent() {
	//	List<Event> events = this.intention.events();
	//	return (events.isEmpty()) ? null : this.intention.events().get(0);
	//}

	@Override
	public List<String> getLookupData() {
		List<String> data = new LinkedList<>();
		data.add("intention " + intention.getID());
		//for (Event event : intention.events()) {
		//	data.add(event.getPredicateIndicator().toString());
		//}
		return data;
	}

	@Override
	public void execute(final AILAgent agent, final boolean reverse) {
		// TODO
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		// Event event = getEvent();
		//if (event != null) { // TODO: would like the 'start' event to be more detailed
		//	builder.append("for the event '").append(event).append("', ");
		//}
		// TODO: no nice descriptor available for intentions?
		// (same problem in SelectIntentionEvent)
		builder.append("modified intention ").append(intention.getID()).append(": ");
		builder.append(intention.toString()).append(".");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return this.intention.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null || !(obj instanceof ModifyIntentionEvent)) {
			return false;
		}
		ModifyIntentionEvent other = (ModifyIntentionEvent) obj;
		return (this.intention == other.intention);
	}
}