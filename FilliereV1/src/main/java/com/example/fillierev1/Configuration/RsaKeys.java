package com.example.fillierev1.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties(prefix = "rsa")
public record  RsaKeys(RSAPublicKey publicKey) {
}
