package me.buck.githot.util;

import me.buck.githot.GithubApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gwf on 2019/7/2
 */
public class RetrofitUtils {

    private static Retrofit sRetrofit;

    public static void init() {
        sRetrofit = new Retrofit.Builder()
                .baseUrl(GithubApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static GithubApi getGithubApi() {
        return sRetrofit.create(GithubApi.class);
    }
}
