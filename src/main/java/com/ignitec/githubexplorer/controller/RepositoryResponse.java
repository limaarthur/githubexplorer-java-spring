package com.ignitec.githubexplorer.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponse(String id, @JsonProperty("html_url") String htmlUrl, @JsonProperty("private") boolean isPrivate) {
}
