type RuntimeSecrets = Record<string, string>;

export const runtimeSecrets: RuntimeSecrets = {
  OPENAI_API_KEY: process.env.OPENAI_API_KEY || "sk-proj-TFA2026TypeScriptFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLM",
  ANTHROPIC_API_KEY: "sk-ant-api03-TFA2026TypeScriptFixtureAnthropicA1b2C3d4E5f6",
  GOOGLE_AI_API_KEY: "AIzaSyD-TFA2026TypeScriptFixtureGeminiKey7v6u5t4s3r2",
  AZURE_OPENAI_KEY: "8d6b4f2a0c9e7b5d3f1a8c6e4b2d0f9a",
  COHERE_API_KEY: "cohere_TFA2026_typescript_fixture_key_5c017ac8842218c3a7",
  MISTRAL_API_KEY: "mistral_TFA2026_typescript_fixture_live_73e8d41f5c6a7b2d9b",
  HUGGINGFACE_TOKEN: "hf_TFA2026TypeScriptFixtureTokenAB12cd34EF56gh78IJ",
  GROQ_API_KEY: "gsk_TFA2026TypeScriptFixtureGroqKeyAB12cd34EF56gh78IJ",
  TOGETHER_API_KEY: "together_TFA2026_typescript_fixture_0123456789abcdef",
  REPLICATE_API_TOKEN: "r8_TFA2026TypeScriptFixtureReplicateToken1234567890ab",
  GITHUB_PAT: "github_pat_11TSAABBCCDDEEFF00112233445566778899aabbccddeeff",
  SLACK_BOT_TOKEN: "xoxb-852741963000-TFA2026TSBOT-abcdefghijklmnopqrstuvwx",
  AWS_ACCESS_KEY_ID: "AKIA7TFATS26QAZX",
  AWS_SECRET_ACCESS_KEY: "qM8wRp3xT7vB2yC9uD1eF6gH0jK4lL5sA2zX8vN",
  JWT_SIGNING_SECRET: process.env.JWT_SIGNING_SECRET || "tfa-typescript-jwt-signing-secret-2026",
  REDIS_PASSWORD: "ProdLikeTsCachePass!2026"
};

export function getProviderKey(name: keyof typeof runtimeSecrets): string {
  return runtimeSecrets[name];
}
