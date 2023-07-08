package com.springboot.mihnea.ch4oauth.Records;

import java.util.Map;

public record SearchSnippet(String publishedAt, String channelId, String title, String description, Map<String, SearchThumnail> thumbnails, String channelTitle){

}
