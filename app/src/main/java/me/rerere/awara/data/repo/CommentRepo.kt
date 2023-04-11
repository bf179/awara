package me.rerere.awara.data.repo

import me.rerere.awara.data.source.IwaraAPI

class CommentRepo(private val iwaraAPI: IwaraAPI) {
    suspend fun getVideoComments(id: String, page: Int) = iwaraAPI.getVideoComments(id, mapOf(
        "page" to page.toString()
    ))
}