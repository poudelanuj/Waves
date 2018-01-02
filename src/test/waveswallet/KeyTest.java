package test.waveswallet;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wavesplatform.wavesj.Base58;
import com.wavesplatform.wavesj.PrivateKeyAccount;
import com.wavesplatform.wavesj.PublicKeyAccount;
import com.waveswallet.Waves;

public class KeyTest {

	@Test
	public void test() {
		Waves w=new Waves();
		String seed="sketch evolve promote crush trip panel exhaust isolate fault label spike dance avoid invest pulse";
		String privateKey="4pbYuwqYPad51SRF5RP9dGif8PCCkoXtW62Ex8kMWyak";
		byte[] seedByte=w.newSeed(seed);
		assertArrayEquals(Base58.decode(privateKey),w.newPrivateKey(seedByte,4));
		
	}

}
//5sAsGDZ777CKcFuyWbPCKVrUADTJCp7m4EjAY7n3DPmt