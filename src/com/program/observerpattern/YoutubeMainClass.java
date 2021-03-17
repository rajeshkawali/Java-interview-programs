package com.program.observerpattern;

public class YoutubeMainClass {

	public static void main(String[] args) {

		Channel channel = new Channel();
		
		Subscriber subscriber1 = new Subscriber("Rajesh");
		Subscriber subscriber2 = new Subscriber("Mahesh");
		Subscriber subscriber3 = new Subscriber("Vidya");
		
		channel.subscribe(subscriber1);
		channel.subscribe(subscriber2);
		channel.subscribe(subscriber3);
		
		//To unSubscribe channel
		channel.unSubscribe(subscriber2);
		
		subscriber1.subscribeChannel(channel);
		subscriber2.subscribeChannel(channel);
		subscriber3.subscribeChannel(channel);
		
		channel.upload("Spring boot microservice");
		
	}

}
