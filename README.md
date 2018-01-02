<h3>For Generation of mnemonic</h3>

```
String mnemonic=PrivateKeyAccount.generateSeed();
```

<h3>For Generation of Seed Byte from mnemonic</h3>

```
byte[] seed=new Waves().newSeed();
```

<h3>For Encoding byte to string</h3>
```
String seedString=Base58.encode(seed);
```

<h3>For decoding string to byte</h3>

byte[] seedByte=Base58.decode(seedString);