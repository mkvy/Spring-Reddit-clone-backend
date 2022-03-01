package com.redclone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.redclone.model.Post;
import com.redclone.model.Subreddit;
import com.redclone.model.User;
import com.redclone.dto.PostRequest;
import com.redclone.dto.PostResponse;

@Mapper(componentModel = "spring")
public interface PostMapper {
    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "description", source = "postRequest.description")
    @Mapping(target = "subreddit", source = "subreddit")
    @Mapping(target = "voteCount", constant = "0")
    @Mapping(target = "user", source = "user")
    Post map(PostRequest postRequest, Subreddit subreddit, User user);

    @Mapping(target = "id", source = "postId")
    @Mapping(target = "subredditName", source = "subreddit.name")
    @Mapping(target = "userName", source = "user.username")
    PostResponse mapToDto(Post post);
}
