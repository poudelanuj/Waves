package com.waveswallet;

public interface CryptoCurrency {
	byte[] newSeed(String mnemonic);

    /**
     * Creates a new private key
     * @return private key
     */
    byte[] newPrivateKey();

    /**
     * Creates a new private key using the provided seed value
     * @param seed seed value
     * @return private key
     */
    byte[] newPrivateKey(byte[] seed);

    /**
     * Creates a new private key of given index using the provided seed value
     * @param seed seed value
     * @param index index of private key
     * @return private key
     */
    byte[] newPrivateKey(byte[] seed, int index);

    /**
     * Returns public key corresponding to the given private key
     * @param privateKey private key
     * @return public key
     */
    byte[] publicKey(byte[] privateKey);



}
