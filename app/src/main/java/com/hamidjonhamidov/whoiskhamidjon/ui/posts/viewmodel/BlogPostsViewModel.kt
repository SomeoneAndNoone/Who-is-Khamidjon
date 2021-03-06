package com.hamidjonhamidov.whoiskhamidjon.ui.posts.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import com.hamidjonhamidov.whoiskhamidjon.repository.BlogRepository
import com.hamidjonhamidov.whoiskhamidjon.ui.BaseViewModel
import com.hamidjonhamidov.whoiskhamidjon.ui.DataState
import com.hamidjonhamidov.whoiskhamidjon.ui.posts.state.BlogPostsStateEvent
import com.hamidjonhamidov.whoiskhamidjon.ui.posts.state.BlogPostsStateEvent.*
import com.hamidjonhamidov.whoiskhamidjon.ui.posts.state.BlogsPostsViewState
import com.hamidjonhamidov.whoiskhamidjon.util.AbsentLiveData
import javax.inject.Inject

class BlogPostsViewModel
@Inject
constructor(
    val blogRepository: BlogRepository
) : BaseViewModel<BlogPostsStateEvent, BlogsPostsViewState>() {

    private val TAG = "AppDebug"

    override fun handleStateEvent(stateEvent: BlogPostsStateEvent): LiveData<DataState<BlogsPostsViewState>> {
        Log.d(TAG, "BlogPostsViewModel: handleStateEvent: $stateEvent")
        return when(stateEvent){
            is GetBlogListStateEvent -> {
                Log.d(TAG, "BlogPostsViewModel: handleStateEvent: GetBlogListStateEvent")
                blogRepository.getAllBlogPosts()
            }

            is PostNewBlogStateEvent -> {
                Log.d(TAG, "BlogPostsViewModel: handleStateEvent: PostNewBlogStateEvent")
                blogRepository.postBlogPost(
                    stateEvent.userId,
                    stateEvent.title,
                    stateEvent.body
                )
            }

            is None -> {
                Log.d(TAG, "BlogPostsViewModel: handleStateEvent: None")
                AbsentLiveData.create()
            }
        }
    }

    override fun initNewViewState() = BlogsPostsViewState()


    fun setBlogListFields(blogPostsFields: BlogsPostsViewState.BlogPostsFields){
        val update = getCurrentViewStateOrNew()
        if(update.blogPostsFields.blogPostsList==blogPostsFields.blogPostsList)
            return

        Log.d(TAG, "BlogPostsViewModel: setBlogListFields: ")

        update.blogPostsFields = blogPostsFields
        setViewState(update)
    }

    fun getBlogPosts() = viewState.value?.blogPostsFields?.blogPostsList

    override fun onCleared() {
        super.onCleared()
        cancelActiveJobs()
    }

    fun cancelActiveJobs(){
        blogRepository.cancelActiveJobs()
        handlePendingData()// hide progress bar
    }

    fun handlePendingData(){
        Log.d(TAG, "BlogPostsViewModel: handlePendingData: ")
        setStateEvent(None())
    }
}





















