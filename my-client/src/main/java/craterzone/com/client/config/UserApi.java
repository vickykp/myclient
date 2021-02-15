package craterzone.com.client.config;

import java.util.List;

import craterzone.com.client.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface UserApi {
	
	@GET("all")
    Call<List<User>> findAll();

    /*DELETE("repos/{owner}/{repo}")
    Call<DeletePayload> deleteRepo(@Header("Authorization") String accessToken, @Header("Accept") String apiVersionSpec,
                                   @Path("repo") String repo, @Path("owner") String owner);

    @POST("user/repos")
    Call<Repository> createRepo(@Body Repository repo, @Header("Authorization") String accessToken,
                                      @Header("Accept") String apiVersionSpec,
                                      @Header("Content-Type") String contentType);
}*/

}

