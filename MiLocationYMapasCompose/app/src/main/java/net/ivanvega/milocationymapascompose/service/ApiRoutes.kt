package net.ivanvega.milocationymapascompose.service


import net.ivanvega.milocationymapascompose.RouteResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiRoutes {
    @GET("/v2/directions/driving-car")
    suspend fun getRoute(
        @Query("api_key") key: String,
        @Query("start") start: String,
        @Query("end") end: String,
    ): Response<RouteResponse>
}