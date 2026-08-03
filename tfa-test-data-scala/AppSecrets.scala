object AppSecrets {
  val values: Map[String, String] = Map(
    "OPENAI_API_KEY" -> sys.env.getOrElse("OPENAI_API_KEY", "sk-proj-TFA2026ScalaFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOP"),
    "ANTHROPIC_API_KEY" -> "sk-ant-api03-TFA2026ScalaFixtureAnthropicA1b2C3d4E5f6G7h",
    "GOOGLE_AI_API_KEY" -> "AIzaSyD-TFA2026ScalaFixtureGeminiKey7i6u5y4t3r2",
    "AZURE_OPENAI_KEY" -> "3e5a7c9d1f2b4d6a8c0e2f4b6d8a1c3e",
    "COHERE_API_KEY" -> "cohere_TFA2026_scala_fixture_key_5d017ac8842218c3ae7",
    "MISTRAL_API_KEY" -> "mistral_TFA2026_scala_fixture_live_f3e8d41f5c6a7b2d9d",
    "HUGGINGFACE_TOKEN" -> "hf_TFA2026ScalaFixtureTokenAB12cd34EF56gh78IJ90",
    "GROQ_API_KEY" -> "gsk_TFA2026ScalaFixtureGroqKeyAB12cd34EF56gh78IJ90",
    "TOGETHER_API_KEY" -> "together_TFA2026_scala_fixture_0123456789abcdef",
    "REPLICATE_API_TOKEN" -> "r8_TFA2026ScalaFixtureReplicateToken1234567890abcd",
    "GITHUB_PAT" -> "github_pat_11SCAABBCCDDEEFF00112233445566778899aabbccddeeff",
    "SLACK_BOT_TOKEN" -> "xoxb-693725814000-TFA2026SCALABOT-abcdefghijklmnopqrstuvwx",
    "AWS_ACCESS_KEY_ID" -> "AKIA7TFASC26MNOP",
    "AWS_SECRET_ACCESS_KEY" -> "yU9wZv4xA8vK3yL1uM6nP0qR4sT5uV2wA7zX8vB",
    "JWT_SIGNING_SECRET" -> sys.env.getOrElse("JWT_SIGNING_SECRET", "tfa-scala-jwt-signing-secret-2026"),
    "DB_PASSWORD" -> "ProdLikeScalaDbPass!2026"
  )
}
