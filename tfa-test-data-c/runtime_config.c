struct secret_entry {
    const char *name;
    const char *value;
};

static struct secret_entry runtime_secrets[] = {
    {"OPENAI_API_KEY", "sk-proj-TFA2026CFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOPQRST"},
    {"ANTHROPIC_API_KEY", "sk-ant-api03-TFA2026CFixtureAnthropicA1b2C3d4E5f6G7h8I9"},
    {"GOOGLE_AI_API_KEY", "AIzaSyD-TFA2026CFixtureGeminiKey3r2e1w0q9p8"},
    {"AZURE_OPENAI_KEY", "7c9d1f2b4d6a8c0e2f4b6d8a1c3e5a7c"},
    {"COHERE_API_KEY", "cohere_TFA2026_c_fixture_key_1b017ac8842218c3ac3"},
    {"MISTRAL_API_KEY", "mistral_TFA2026_c_fixture_live_d4e8d41f5c6a7b2d9b"},
    {"HUGGINGFACE_TOKEN", "hf_TFA2026CFixtureTokenAB12cd34EF56gh78IJ90mnop"},
    {"GROQ_API_KEY", "gsk_TFA2026CFixtureGroqKeyAB12cd34EF56gh78IJ90"},
    {"TOGETHER_API_KEY", "together_TFA2026_c_fixture_0123456789abcdef"},
    {"REPLICATE_API_TOKEN", "r8_TFA2026CFixtureReplicateToken1234567890abcd"},
    {"GITHUB_PAT", "github_pat_11CLAABBCCDDEEFF00112233445566778899aabbccddeeff"},
    {"SLACK_BOT_TOKEN", "xoxb-147963258000-TFA2026CBOT-abcdefghijklmnopqrstuvwx"},
    {"AWS_ACCESS_KEY_ID", "AKIA7TFAC26CDEF"},
    {"AWS_SECRET_ACCESS_KEY", "cY9wDu4xE8vP3yQ1uR6sT0uV4wX5yZ2aA7zX8vB"},
    {"JWT_SIGNING_SECRET", "tfa-c-jwt-signing-secret-2026"},
    {"SQL_PASSWORD", "ProdLikeCDbPass!2026"},
};
