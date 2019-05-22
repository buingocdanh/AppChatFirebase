package com.koddev.chatapp.Fragments;

import com.koddev.chatapp.Notifications.MyResponse;
import com.koddev.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA1Jb5KWw:APA91bEOUhC1un8EZbAq0kgUjAvL8YitV7KRNlwmAuPAE8dGxBpmqjkS_1zPwTlEa2tkbNA3ve3pu-wCL1xxSzID-c1X24yFYwXVEaG4q6E4ax7nwWBgonhooF4aVzxSeXs99hwsYfeh"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
