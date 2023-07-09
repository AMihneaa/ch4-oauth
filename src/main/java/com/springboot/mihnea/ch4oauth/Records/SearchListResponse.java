package com.springboot.mihnea.ch4oauth.Records;

public record SearchListResponse(String kind, String etag, String nextPageToken, String prevPageToken, PageInfo pageInfo, SearchResult[] items) {
}
