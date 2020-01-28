package com.wert.invest.retrofitsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.wert.invest.retrofitsample.lead.LeadInformation;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           getHeroes();

    }

    private void getHeroes() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(Api.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
//                .build();

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request newRequest  = chain.request().newBuilder()
                        .addHeader("Authorization", "Bearer " + "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL2JqYWltcy5rbG91ZHBvcnRhbC5jb20vYXBpL2NybS9sb2dpbiIsImlhdCI6MTU4MDE0MjI1NSwiZXhwIjoxNTgwMTQ1ODU1LCJuYmYiOjE1ODAxNDIyNTUsImp0aSI6Ind2amNSMWtJUHpZMVp5R0IiLCJzdWIiOjEsInBydiI6Ijg3ZTBhZjFlZjlmZDE1ODEyZmRlYzk3MTUzYTE0ZTBiMDQ3NTQ2YWEifQ.M3fc-BsSbmcm9f6d1WJv0I-uB4dZRNaRfwarf7zt1bo")
                        .build();
                return chain.proceed(newRequest);
            }
        }).build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<LeadInformation> call =api.getInformationLead("4");
        call.enqueue(new Callback<LeadInformation>() {
            @Override
            public void onResponse(Call<LeadInformation> call, Response<LeadInformation> response) {
                LeadInformation leadInformation =response.body();
                Log.d("email",leadInformation.getData().getEmail());
            }

            @Override
            public void onFailure(Call<LeadInformation> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });










//        Call<ActiveLead> call = api.getActiveLead("1515483847","1");
//         call.enqueue(new Callback<ActiveLead>() {
//             @Override
//             public void onResponse(Call<ActiveLead> call, Response<ActiveLead> response) {
//                 ActiveLead activeLead =response.body();
//
//                 Log.d("activelead",activeLead.getData().get(0).getName());
//
//             }
//
//             @Override
//             public void onFailure(Call<ActiveLead> call, Throwable t) {
//
//             }
//         });








//        Call<LoginModel> call =api.getLogin("Basic YWRtaW5AYWRtaW4uY29tOmFkbWluMTIz","admin@admin.com","admin123");
//        call.enqueue(new Callback<LoginModel>() {
//            @Override
//            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
//                 LoginModel loginModel =response.body();
//                 Log.d("token",loginModel.getAccessToken());
//            }
//
//            @Override
//            public void onFailure(Call<LoginModel> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });








//        Map<String, Object> jsonParams = new ArrayMap<>();
////put something inside the map, could be null
//        jsonParams.put("userid", "117");
//
//        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),(new JSONObject(jsonParams)).toString());
//
//        Call<GoalModel> call =api.getGoalList(body);
//
//         call.enqueue(new Callback<GoalModel>() {
//             @Override
//             public void onResponse(Call<GoalModel> call, Response<GoalModel> response) {
//                 GoalModel goalModel =response.body();
//                 List<GoalsList> goalsLists =goalModel.getGoalsList();
//                 Log.d("goalname",goalsLists.get(0).getGoalname());
//             }
//
//             @Override
//             public void onFailure(Call<GoalModel> call, Throwable t) {
//
//                 Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
//             }
//         });


//        Call<List<Hero>> call = api.getHeroes();
//
//        call.enqueue(new Callback<List<Hero>>() {
//            @Override
//            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
//                List<Hero> heroList = response.body();
//                Log.d("herolist",heroList.get(0).getName());
//            }
//
//            @Override
//            public void onFailure(Call<List<Hero>> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
