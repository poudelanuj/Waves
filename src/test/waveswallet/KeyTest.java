package test.waveswallet;

import static org.junit.Assert.*;

import org.junit.Test;

import com.waveswallet.Waves;

public class KeyTest {

	@Test
	public void test() {
		Waves w=new Waves();
		String seed="";
		byte[] privateKey =w.newPrivateKey();
		byte[] publicKey=w.publicKey(privateKey);
		byte[] address=w.generateWalletAddress(publicKey, 'W');
		System.out.println("Private key :"+Waves.getString(privateKey).toString());
		System.out.println("Public key:"+Waves.getString(publicKey).toString());
		System.out.println("Address Generated:"+Waves.getString(address));
	}

}
