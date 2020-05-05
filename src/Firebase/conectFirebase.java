package Firebase;

import java.io.IOException;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;


public class conectFirebase {
	
	public static Firestore firestore;
	
	private conectFirebase() {
		firestore = initFirebase();

	}
	
	public static Firestore getInstance() {
		
		if(firestore == null) {
			firestore = initFirebase();
		}
		return firestore;
	}

	private static Firestore initFirebase() {
	
		try {
			FirebaseOptions options = new FirebaseOptions.Builder()
						  .setCredentials(GoogleCredentials.fromStream(conectFirebase.class.getResourceAsStream("listadeprecios-ef04d-firebase-adminsdk-3c7pi-4fa852a4bb.json")))
						  .setDatabaseUrl("https://listadeprecios-ef04d.firebaseio.com")
						  .build();
			FirebaseApp.initializeApp(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return FirestoreClient.getFirestore();
	}
}
