package com.example.musictheory.core.data.api

import com.example.musictheory.core.data.model.ServerData
import com.example.musictheory.home.data.model.PostSection
import com.example.musictheory.trainingtest.data.model.PostMusicTest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * @author Владислав Хвесюк 02.11.2021
 */

interface MusicEducationApiService {
    @GET("get_data")
    fun getCollectionByName(
        @Query("collection_name") collectionName: String
    ): Call<ServerData>

    @POST("put_data/")
    fun postSection(@Body postSection: PostSection): Call<PostSection>

    @POST("put_data/")
    fun postTest(@Body postMusicTest: PostMusicTest): Call<PostMusicTest>
}
