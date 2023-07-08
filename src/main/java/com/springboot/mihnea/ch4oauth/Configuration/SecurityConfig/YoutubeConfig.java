package com.springboot.mihnea.ch4oauth.Configuration.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class YoutubeConfig {

    static String Youtube_V3_API = "https://www.googleapis.com/youtube/v3";

    @Bean
    WebClient webClient(OAuth2AuthorizedClientManager clientManager){
        ServletOAuth2AuthorizedClientExchangeFilterFunction oAuth2 = new ServletOAuth2AuthorizedClientExchangeFilterFunction(clientManager);
        oAuth2.setDefaultClientRegistrationId("google");

        return WebClient.builder()
                .baseUrl(Youtube_V3_API)
                .apply(oAuth2.oauth2Configuration())
                .build();
    }

}
