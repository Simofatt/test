package comm.octest.security;

import java.security.Key;
import java.security.KeyPair;
import java.security.PublicKey;

public class MessageAndKey {
	public String encryptedMessage;
	public String publicKey;
	
	
	public MessageAndKey(String encryptedMessage, String publicKey) {
		this.encryptedMessage = encryptedMessage;
		this.publicKey = publicKey;
	}

	
}

