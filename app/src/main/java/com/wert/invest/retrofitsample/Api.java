package com.wert.invest.retrofitsample;

import com.wert.invest.retrofitsample.lead.LeadInformation;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {


    String BASE_URL = "https://bjaims.kloudportal.com/api/crm/";//http://dev-api.savingsmanager.co.in/api/v1/users/

    @GET("marvel")
    Call<List<Hero>> getHeroes();

    @POST("goalslist")
    Call<GoalModel> getGoalList(@Body RequestBody params);

     @POST("login")
     Call<LoginModel>  getLogin(@Header("Authorization") String token, @Query("email") String email,@Query("password") String password);


     @GET("activityleads")
     Call<ActiveLead>  getActiveLead(@Query("company_id") String companyid,@Query("user_id") String userid);


     @GET("leads/{id}")
     Call<LeadInformation> getInformationLead(@Path("id") String id);

//    @GET("api/Profiles/GetProfile?id={id}")
//    Call<UserProfile> getUser(@Path("id") String id, @Header("Authorization") String authHeader);

}
