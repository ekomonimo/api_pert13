package prasetyo.muhamad.api_pert13.Api

import io.reactivex.Single
import prasetyo.muhamad.api_pert13.Model.Photo
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>

}