package craterzone.com.client.gatway;

import java.util.List;

import craterzone.com.client.config.UserApi;
import craterzone.com.client.config.UserConfig;
import craterzone.com.client.model.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserGatway {
	
	
	public static void main(String []args){
		
		try {
			UserApi userApi = UserConfig.getClient().create(UserApi.class);
			userApi.findAll().enqueue(new Callback<List<User>>() {

				@Override
				public void onResponse(Call<List<User>> call, Response<List<User>> response) {
					try {
						if(response.isSuccessful()) {
							List<User> users=response.body();
							System.out.println("size: " + users.size());
							
						}
						
					}catch (Exception e) {
						System.err.println(e.getMessage());
					}
					
					
				}

				@Override
				public void onFailure(Call<List<User>> call, Throwable t) {
					System.err.println(t.getMessage());
					
				}
			});

			}catch (Exception e)	{
				System.err.println(e.getMessage());
			}
		}

}