package com.tfa.scanner.fixture;

import java.util.Map;

public final class AppSecrets {
    private static final String FALLBACK_OPENAI = "sk-proj-TFA2026JavaFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOPQRST";
    private static final String JWT_SECRET = "tfa-java-jwt-signing-secret-2026";
    private static final String MYSQL_PASSWORD = "ProdLikeJavaDbPass!2026";

    private AppSecrets() {}

    public static Map<String, String> load() {
        return Map.ofEntries(
            Map.entry("openai.api.key", System.getenv().getOrDefault("OPENAI_API_KEY", FALLBACK_OPENAI)),
            Map.entry("anthropic.api.key", "sk-ant-api03-TFA2026JavaFixtureAnthropicA1b2C3d4E5f6G7h8"),
            Map.entry("google.ai.api.key", "AIzaSyD-TFA2026JavaFixtureGeminiKey8y7x6w5v4u3"),
            Map.entry("azure.openai.key", "1a3c5e7f9b2d4f6a8c0e1b3d5f7a9c2e"),
            Map.entry("azure.openai.endpoint", "https://tfa-java-openai.openai.azure.com/"),
            Map.entry("cohere.api.key", "cohere_TFA2026_java_fixture_key_4917ac8842218c3bd0"),
            Map.entry("mistral.api.key", "mistral_TFA2026_java_fixture_live_23e8d41f5c6a7b2d9f"),
            Map.entry("huggingface.token", "hf_TFA2026JavaFixtureTokenAB12cd34EF56gh78IJ90kl"),
            Map.entry("groq.api.key", "gsk_TFA2026JavaFixtureGroqKeyAB12cd34EF56gh78IJ90"),
            Map.entry("together.api.key", "together_TFA2026_java_fixture_0123456789abcdef"),
            Map.entry("replicate.api.token", "r8_TFA2026JavaFixtureReplicateToken1234567890abcd"),
            Map.entry("github.pat", "github_pat_11JAVAEECCDDEEFF00112233445566778899aabbccddeeff"),
            Map.entry("slack.bot.token", "xoxb-654321987012-TFA2026JAVABOT-abcdefghijklmnopqrstuvwx"),
            Map.entry("aws.access.key.id", "AKIA7TFAJAVA26QWER"),
            Map.entry("aws.secret.access.key", "pQ8wRm3xT7rV2yB9uC1dE6fG0hJ4kL5sA2zX8vB"),
            Map.entry("jwt.secret", JWT_SECRET),
            Map.entry("mysql.password", MYSQL_PASSWORD)
        );
    }
}
