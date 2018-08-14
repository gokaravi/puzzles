public class MySingleton{

private MySingleton(){
}

private static volatile MySingleton _instance;

public static MySingleton getInstance(){
if(null == _instance){
		synchronized (MySingleton.class){
			if(null == _instance){
			_instance = new MySingleton();
			}

		}
}
return _instance;

}

}