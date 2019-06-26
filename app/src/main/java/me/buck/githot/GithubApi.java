package me.buck.githot;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gwf on 2019/6/26
 */
public interface GithubApi {

    String BASE_URL = "https://github-trending-api.now.sh/";

    @GET("repositories")
    Call<Repo> getHotRepo();

}

