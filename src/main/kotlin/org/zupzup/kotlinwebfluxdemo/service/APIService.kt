package org.zupzup.kotlinwebfluxdemo.service

import mu.KLogging
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.zupzup.kotlinwebfluxdemo.model.Comment
import org.zupzup.kotlinwebfluxdemo.model.Post
import reactor.core.publisher.Flux

@Service
class APIService {
    companion object : KLogging()

    fun fetchComments(postId: Int): Flux<Comment> = fetch("posts/$postId/comments").bodyToFlux(Comment::class.java)

    fun fetchPosts(): Flux<Post> = fetch("/posts").bodyToFlux(Post::class.java)

    fun fetch(path: String): WebClient.ResponseSpec {
        val client = WebClient.create("http://jsonplaceholder.typicode.com/")
        return client.get().uri(path).retrieve()
    }
}