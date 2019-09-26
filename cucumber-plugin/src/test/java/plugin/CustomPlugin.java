package plugin;

import java.io.PrintStream;

import cucumber.api.PickleStepTestStep;
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
import cucumber.api.formatter.NiceAppendable;

public class CustomPlugin implements EventListener {

	private NiceAppendable defaultOut = new NiceAppendable(System.out);

	@Override
	public void setEventPublisher(EventPublisher publisher) {
		// System.out.println("SET EVENT");
		// publisher.registerHandlerFor(Event.class, e -> System.out.println("Event - "
		// + e));
		publisher.registerHandlerFor(TestRunStarted.class, e -> defaultOut.println("TestRunStarted - " + e));
		publisher.registerHandlerFor(TestSourceRead.class, e -> defaultOut.println("TestSourceRead - " + e));
		publisher.registerHandlerFor(TestCaseStarted.class, e -> defaultOut.println("TestCaseStarted - " + e));
		publisher.registerHandlerFor(StepDefinedEvent.class, e -> defaultOut.println("StepDefinedEvent - " + e));
		publisher.registerHandlerFor(TestStepStarted.class, e -> {
			defaultOut.println("TestStepStarted - " + e);
			PickleStepTestStep psts = (PickleStepTestStep)(e.testStep);
			defaultOut.println("STEP -- " + psts.getStepText());
		});
		publisher.registerHandlerFor(TestStepFinished.class, e -> defaultOut.println("TestStepFinished - " + e));
		publisher.registerHandlerFor(TestCaseFinished.class, e -> defaultOut.println("TestCaseFinished - " + e));
		publisher.registerHandlerFor(TestRunFinished.class, e -> defaultOut.println("TestRunFinished - " + e));
	}

	public CustomPlugin(Appendable appendable) {
		defaultOut = new NiceAppendable(appendable);
	}
}
