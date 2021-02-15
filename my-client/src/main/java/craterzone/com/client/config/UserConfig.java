package craterzone.com.client.config;



import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserConfig {
	
	private static Retrofit retrofit=null;
	public static Retrofit getClient() {

		HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor();
		interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
		OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
		retrofit = new Retrofit.Builder().baseUrl("http://localhost:8777/rest/employee/")
				.addConverterFactory(GsonConverterFactory.create()).client(client).build();
		return retrofit;
				  
		
				
	}
	
	
	
	

	/*
	 * @Bean public User masterClient(@Value("${connection.read.timeout.second:60}")
	 * final Long timeoutSeconds,
	 * 
	 * @Value("${master.base.url}") final String baseUrl) { return new
	 * Retrofit.Builder() .client(new
	 * OkHttpClient.Builder().readTimeout(timeoutSeconds, TimeUnit.SECONDS)
	 * .connectTimeout(timeoutSeconds, TimeUnit.SECONDS) .addInterceptor(new
	 * HttpLoggingInterceptor().setLevel(Level.BASIC)).build())
	 * .baseUrl(baseUrl).addConverterFactory(JacksonConverterFactory.create(
	 * buildDefaultMapper()))
	 * //.addConverterFactory(ScalarsConverterFactory.create())
	 * .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build().create(
	 * User.class); }
	 * 
	 *//**
		 * Builds the default object mapper to be used by clients to parse/populate json
		 * object.
		 *
		 * @return the {@link ObjectMapper} prepared with default configuration.
		 *//*
			 * private ObjectMapper buildDefaultMapper() { final ObjectMapper objectMapper =
			 * new ObjectMapper(); objectMapper.registerModule(new JavaTimeModule());
			 * objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); return
			 * objectMapper; }
			 */
}
