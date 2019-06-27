package me.buck.githot;

import java.util.List;

import me.buck.githot.bean.Dev;
import me.buck.githot.bean.Lang;
import me.buck.githot.bean.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by gwf on 2019/6/26
 */
public interface GithubApi {

    String BASE_URL = "https://github-trending-api.now.sh/";

    @GET("repositories")
    Call<Repo> getHotRepo();

    @GET("repositories")
    Call<Repo> getHotRepo(@Query("language") String lang, @Query("since") String since);

    @GET("developers")
    Call<Dev> getHotDev();

    @GET("developers")
    Call<Dev> getHotDev(@Query("language") String lang, @Query("since") String since);

    @GET("languages")
    Call<List<Lang>> getLanguages();

}

