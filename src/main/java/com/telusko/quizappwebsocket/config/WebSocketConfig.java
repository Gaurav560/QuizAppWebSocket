package com.telusko.quizappwebsocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker // Enables WebSocket message handling, backed by a message broker.
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Register a WebSocket endpoint that the clients will use to connect to our WebSocket server.
        registry.addEndpoint("/quiz").setAllowedOriginPatterns("*").withSockJS(); // SockJS is used to enable fallback options for browsers that don’t support WebSocket.
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Configure a simple message broker and set destinations prefix to send and subscribe to.
        registry.setApplicationDestinationPrefixes("/app"); // Prefix for messages bound for methods annotated with @MessageMapping.
        registry.enableSimpleBroker("/topic"); // Prefix for messages that should be routed to the message broker.
    }
}
