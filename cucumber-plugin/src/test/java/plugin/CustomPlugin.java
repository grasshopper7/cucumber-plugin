package plugin;

import cucumber.api.event.Event;
import cucumber.api.event.EventListener;
import cucumber.api.event.EventPublisher;
import cucumber.api.event.StepDefinedEvent;
import cucumber.api.event.TestCaseFinished;
import cucumber.api.event.TestCaseStarted;
import cucumber.api.event.TestRunFinished;
import cucumber.api.event.TestRunStarted;
import cucumber.api.event.TestSourceRead;
import cucumber.api.event.TestStepFinished;
import cucumber.api.event.TestStepStarted;

public class CustomPlugin implements EventListener {

	@Override
	public void setEventPublisher(EventPublisher publisher) {
		//System.out.println("SET EVENT");
		//publisher.registerHandlerFor(Event.class, e -> System.out.println("Event - " + e));
		publisher.registerHandlerFor(TestRunStarted.class, e -> System.out.println("TestRunStarted - " + e));
		publisher.registerHandlerFor(TestSourceRead.class, e -> System.out.println("TestSourceRead - " + e));
		publisher.registerHandlerFor(TestCaseStarted.class, e -> System.out.println("TestCaseStarted - " + e));
		publisher.registerHandlerFor(StepDefinedEvent.class, e -> System.out.println("StepDefinedEvent - " + e));
		publisher.registerHandlerFor(TestStepStarted.class, e -> System.out.println("TestStepStarted - " + e));
		publisher.registerHandlerFor(TestStepFinished.class, e -> System.out.println("TestStepFinished - " + e));
		publisher.registerHandlerFor(TestCaseFinished.class, e -> System.out.println("TestCaseFinished - " + e));
		publisher.registerHandlerFor(TestRunFinished.class, e -> System.out.println("TestRunFinished - " + e));
	}
}
