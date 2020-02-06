package com.example.cse438_rest_studio.Network

import com.example.cse438.studio3.data.Payload
import com.example.cse438_rest_studio.data.Brewery
import com.example.cse438_rest_studio.data.CityPayload
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

//interface to denote different calls with arguements
interface BreweryInterface {

    //TODO #4: Create a function signature for accessing breweries by city
    @GET("api_city.php")
    suspend fun getCities(): Response<CityPayload>
    //TODO #5: Create a function signature that provides a search term for breweries
    suspend fun getQuestionBySearch(@Query("city") city: String, @Query("name") name:String) : Response<Payload>

}