package com.tfa.scanner.fixture

object AppSecrets {
    val values: Map<String, String> = mapOf(
        "openai.api.key" to (System.getenv("OPENAI_API_KEY") ?: "sk-proj-TFA2026KotlinFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOP"),
        "anthropic.api.key" to "sk-ant-api03-TFA2026KotlinFixtureAnthropicA1b2C3d4E5f6G7h",
        "google.ai.api.key" to "AIzaSyD-TFA2026KotlinFixtureGeminiKey3t2s1r0q9p8",
        "azure.openai.key" to "9c7e5a3d1f8b6d4a2c0e7f5b3d1a9c7e",
        "cohere.api.key" to "cohere_TFA2026_kotlin_fixture_key_0a017ac8842218c3ac6",
        "mistral.api.key" to "mistral_TFA2026_kotlin_fixture_live_c3e8d41f5c6a7b2d9a",
        "huggingface.token" to "hf_TFA2026KotlinFixtureTokenAB12cd34EF56gh78IJ90",
        "groq.api.key" to "gsk_TFA2026KotlinFixtureGroqKeyAB12cd34EF56gh78IJ90",
        "together.api.key" to "together_TFA2026_kotlin_fixture_0123456789abcdef",
        "replicate.api.token" to "r8_TFA2026KotlinFixtureReplicateToken1234567890ab",
        "github.pat" to "github_pat_11KTAABBCCDDEEFF00112233445566778899aabbccddeeff",
        "slack.bot.token" to "xoxb-258147369000-TFA2026KOTLINBOT-abcdefghijklmnopqrstuvwx",
        "aws.access.key.id" to "AKIA7TFAKT26YHNU",
        "aws.secret.access.key" to "vR9wWs4xX8vG3yH1uJ6kL0mN4oP5qR2sA7zX8vB",
        "jwt.signing.secret" to (System.getenv("JWT_SIGNING_SECRET") ?: "tfa-kotlin-jwt-signing-secret-2026"),
        "postgres.password" to "ProdLikeKotlinDbPass!2026"
    )
}
