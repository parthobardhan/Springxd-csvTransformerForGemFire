package io.pivotal.edu.spring.xd;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

public class CSVToJson {
	public Message<?> translate(Message<?> message) {
		Message<?> result = message;
		String payload = (String) message.getPayload();
		String[] info = payload.split("\\|");
		if (info != null && info.length != 0) {
			Person person = new Person();
			person.setPersonId(info[0]);
			person.setName(info[1]);
			person.setEmail(info[2]);
			result = MessageBuilder.withPayload(person).copyHeadersIfAbsent(message.getHeaders())
					.setHeaderIfAbsent("gemfireKey", info[2]).build();
		} else {
			throw new RuntimeException("can not process payload");
		}
		return result;
	}
}
