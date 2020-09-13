package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics =  Arrays.asList(
			new Topic("spring", "Spring Framework", " Spring Framework Description"),
			new Topic("java", "Core Java", " Core Java Description"),
			new Topic("javascript", "JavaScript", " JavaScript Description")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(p -> p.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		for(int i =0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(p -> p.getId().equals(id));
	}
}
